package arrays.sort012withoutsortmethods;

import java.util.Scanner;
// Time complexitty O(n)
public class Count012inorder {

	public static int[] rearrange(int[] array,int n) {
		int count0=0,count1=0,count2=0;
		for(int i=0;i<n;i++) {//first count the no of 0,1,2 in array
			switch(array[i]) {
			case 0:
				count0++;break;
			case 1:
				count1++;break;
			case 2:
				count2++;break;
			}
		}
		int i=0;
		//then place them in order based on the obtained count
		while(count0>0) { 
			array[i++]=0; count0--;
		}
		while(count1>0) { 
			array[i++]=1; count1--;
		}
		while(count2>0) { 
			array[i++]=2; count2--;
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
