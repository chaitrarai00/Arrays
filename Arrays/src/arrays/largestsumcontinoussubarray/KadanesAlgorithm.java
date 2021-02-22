package arrays.largestsumcontinoussubarray;
/*
 * Time complexity:O(n)
 * space: o(1)
 */
public class KadanesAlgorithm {
/*
 * We keep a variable say max_ending_here to store the sum at each iteration 
 * or sum at adding each array element
 * and max_sum_so_far to store or mark maximum sum until now
 * 
 */
	public static int kadanealgorith(int[] array){
		int max_ending_here=0,max_sum_so_far=0;
		for(int i=0;i<array.length;i++) {
			max_ending_here=max_ending_here+array[i];
			if(max_ending_here<0)
				max_ending_here=0;
			else if(max_sum_so_far<max_ending_here)
				max_sum_so_far=max_ending_here;
		}
		return max_sum_so_far;
	}
	public static void main(String[] args) {
		int[] array= {-2,-3,4,-1,-2,1,5,-3};
		System.out.print(kadanealgorith(array));
	}

}
