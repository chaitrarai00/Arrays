package arrays.mergeintervals;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Stack;

/*
 * We push all elements to stack one by one in a sorted manner
 *  and compare with the top
 * element and the end element of the array 
 * to check for overlapping
 * 
 * Time complexity O(nlogn) to sort
 * Space Complexity O(n)
 */
public class Stackuseformerging {	

	public static void merge(Interval array[]) {
		if(array.length<0)
			return;
		//use comparator to sort based on the start elemnent
		Arrays.sort(array,new Comparator<Interval>() {
			public int compare(Interval I1,Interval I2) {
				return I1.start-I2.start;
				}
		});
		Stack<Interval> stack=new Stack<Interval>();
		stack.push(array[0]);//push the first element as a sample for comparing to
		
		for(int i=0;i<array.length;i++) {
			Interval top=stack.peek();//check the values of current stack top
			
			//if current top is not coinciding/overlapping with the current element
			//push this element
			if(top.end<array[i].start)
				stack.push(array[i]);
			
			else if(top.end<array[i].end){//the element and the top overlaps
				top.end=array[i].end;// place the new end as the current array end
				stack.pop();
				stack.push(top);//new top is inserted
			}
			}
		System.out.println("Merged Intervals are:");
		while(!stack.isEmpty()) {
			Interval I=stack.pop();
			System.out.print(" ["+I.start+","+I.end+"] ");
		}
	} 
	
	public static void main(String[] args) {
		Interval array[]=new Interval[4];
		array[0]=new Interval(6, 8);
		array[1]=new Interval(1,9);
		array[2]=new Interval(2,4);
		array[3]=new Interval(2,7);
		merge(array);
	}
	
}
