package arrays.movenegetiveelemnttobeginningtopositivetoend;

import java.util.Scanner;
//Time complexitty O(n)
public class Twopointapproach {
	public static int[] rearrange(int[] array,int n) {
		int left=0,right=n-1;
		while(left<=right) {
			if(array[left]<0 && array[right]<0) {
				left++;
			}
			else if(array[left]>0 && array[right]<0) {
				int temp=array[left];
				array[left]=array[right];
				array[right]=temp;
				left++;
				right--;
			}
			else if(array[left]>0 && array[right]>0) {
				right--;
			}
			else {
				left++;
				right--;
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
