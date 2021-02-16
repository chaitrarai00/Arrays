package arrays.sort012withoutsortmethods;

import java.util.Scanner;
//Time complexitty O(n)
public class DutchFlagMethod {
	public static int[] rearrange(int[] array,int n) {
		int temp,low=0,mid=0,high=n-1;//first part 0 being low to mid
		while(mid<=high) {				// second part being the mid section
		switch(array[mid]) { // and tirst the high part
		case 0:
			temp=array[low];
			array[low]=array[mid];
			array[mid]=temp;
			low++;
			mid++;
			break;
		case 1:
			mid++;
			break;
		case 2:
			temp=array[mid];
			array[mid]=array[high];
			array[high]=temp;
			high--;
			break;
		}
		}
		return array;
	}
	
	private final static Scanner sc=new Scanner(System.in);
	
	public static void main(String[] args) {
		int n;
		//int testcases=sc.nextInt();
		//for(int i=0;i<testcases;i++)
		n=sc.nextInt();
		int[] array=new int[n];
		for(int i=0;i<n;i++) {
			array[i]=sc.nextInt();
		}
		array=rearrange(array, n);
		for(int i=0;i<n;i++) {
			System.out.print(array[i]+" ");
		}
	}

}
