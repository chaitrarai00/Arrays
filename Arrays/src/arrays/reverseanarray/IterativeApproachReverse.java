package arrays.reverseanarray;

public class IterativeApproachReverse {

		//public static int[] array;
		/*
		 * we first try to reverse an array by taking the start and end value 
		 * and swapping it with each other
		 * In the iterative approach we increment the value of start and 
		 * decrement value of end
		 * till the value of start is less than end when we realize the swapping is complete
		 * The time complexity is O(n) since traversing each array of size n happens
		 */
		public static void reverse_array(int[] array,int start,int end)
		{
			int temp;
			while(start<end) {
				temp=array[start];
				array[start]=array[end];
				array[end]=temp;
				start++;
				end--;
			}
		}
		public static void main(String[] args) {
			int[] array= {4,5,9,6,6,1};
			reverse_array(array, 0, array.length-1);
			for(int i=0;i<array.length;i++)
				System.out.print(array[i]+" ");
		}

	

}

