package arrays.mergeintervals;


import java.util.Arrays;
import java.util.Comparator;

/*
 * Lets reduce the space complexity by avoiding a stack and 
 * instead modifying the existing array by taking one elemnt at a time 
 * as an index element and comparing with current element in iteration
 * Time complexity O(nlogn) to sort
 * Space Complexity O(1)
 */

public class Modifyexistingarray {

		public static void merge(Interval array[]) {
			if(array.length<0)
				return;
			//use comparator to sort based on the start element but sort in descending order
			//so that overalapping can be identified easily
			Arrays.sort(array,new Comparator<Interval>() {
				public int compare(Interval I1,Interval I2) {
					return I2.start-I1.start;
					}
			});
			int index=0;//the index starts from zero
			for(int i=0;i<array.length;i++) {
				//index element and the ith elemnt is overlapping 
				if(array[index].end>=array[i].start)
				{
					//if it overalps create an interval thats ideal covering both the interval space
					array[index].end=Math.max(array[index].end, array[i].end); 
					array[index].start=Math.min(array[index].start, array[i].start);
				}
				
				else {
					//replace index elemnt to ith element/ curr element 
					index++;
					array[index]=array[i];
				}
				}
			System.out.println("Merged Intervals are:");
			for(int i=0;i<=index;i++){
				System.out.print(" ["+array[i].start+","+array[i].end+"] ");
			}
		} 
		
		public static void main(String[] args) {
			Interval array[]=new Interval[3];
			array[0]=new Interval(6, 8);
			//array[1]=new Interval(1,9);
			array[1]=new Interval(1,3);
			array[2]=new Interval(2,4);
			//array[3]=new Interval(2,7);
			merge(array);
		}
		
	
}
