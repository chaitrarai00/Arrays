package arrays.largestsumcontinoussubarray;
/*
 * Time Complexity O(n)
 * Space Complexity O(1)
 */
public class ConsiderMaxeachtime {
//curr max storing the current maximum value compared to each element in array
	// and max_so_far stores the variable which is the maximum among all encountered maximums
	public static int maxlongsum(int[] array) {
		int max_so_far=array[0];
		int curr_max=array[0];
		for(int i=0;i<array.length;i++) {
			curr_max=Math.max(array[i], curr_max+array[i]);
			max_so_far=Math.max(max_so_far,curr_max);
		}
		return max_so_far;
	}
	public static void main(String[] args) {
		int[] array= {-2,-3,4,-1,-2,1,5,-3};
		System.out.print(maxlongsum(array));
	}

}
