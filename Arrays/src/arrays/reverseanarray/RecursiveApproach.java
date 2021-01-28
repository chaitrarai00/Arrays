package arrays.reverseanarray;

public class RecursiveApproach {

		//public static int[] array;
			/*
			 * we first try to reverse an array by taking the start and end value 
			 * and swapping it with each other
			 * In the recursice approach we increment the value of start and 
			 * decrement value of end and call the same function again
			 * till the value of start is less than end when we realize the swapping is complete
			 * The time complexity is O(n) since traversing each array of size n happens
			 */
			public static void reverse_array(int[] array,int start,int end)
			{
				int temp;
					if(start>end)return;
					temp=array[start];
					array[start]=array[end];
					array[end]=temp;
					reverse_array(array,start+1,end-1);
					
			
			}
			public static void main(String[] args) {
				int[] array= {4,5,9,6,6,1};
				reverse_array(array, 0, array.length-1);
				for(int i=0;i<array.length;i++)
					System.out.print(array[i]+" ");
			}



}
