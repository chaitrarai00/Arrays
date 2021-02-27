package arrays.nextpermutation;
/*
 *Time Complexity O(n) 
 *Space Complexity O(1) 
 */
public class NextPermutation {

	public static int[] next_permutation(int[] array) {
		if(array==null || array.length<=1) return array;
		int i=array.length-2;//we take an index i for finding the first index
		//index1 is found in suvch a manner where the value i is supposed to be less than
		//value in the next index ie i+1
		while(i>=0) {
			if(array[i]<array[i+1]) //checking if there is an increasing pattern in the array ; 
				//thats is the breakpoint using which we can analyse or find the next permutation
				break;
			i--;
		}
		//once we get the respective index1 we find a value index2
		//such that its an elemnt in the array and is greater than the value at index1
		if(i>=0){// this condition checks if there is an increasing pattern in the array
			//since permutation has an increasing pattern while lexographically finding all permutations
			int j=array.length-1;
			while(array[j]<=array[i])j--;
			swap(array, i, j);		
		}
		reverse(array, i+1, array.length-1);
		return array;
	}
	public static void swap(int[] array,int left,int right) {
		int temp=array[left];
		array[left]=array[right];
		array[right]=temp;
	}
	
	public static void reverse(int[] array,int left,int right) {
		while(left<right) {
			int temp=array[left];
			array[left++]=array[right];
			array[right--]=temp;
		}
	}
	public static void main(String[] args) {
		int[] array= {1,2,3};
		array=next_permutation(array);
		for(int i=0;i<array.length;i++) {
			System.out.print(array[i]+" ");
		}
	}

}
