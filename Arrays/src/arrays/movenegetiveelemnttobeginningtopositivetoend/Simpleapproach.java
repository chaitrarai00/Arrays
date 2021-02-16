package arrays.movenegetiveelemnttobeginningtopositivetoend;

import java.util.Scanner;
//Time complexitty O(n)
public class Simpleapproach {

	public static int[] rearrange(int[] array,int n) {
		int j=0;
		int temp;
		for(int i=0;i<n;i++) {
			while(array[i]<0) {// iterate and find the array element with elemnt less than 0 value
				if(i!=j) {
					temp=array[i];
					array[i]=array[j]; //if the value is neegetive and not the same elemnt pointed swap it
					array[j]=temp;
					j++; //incremenrt the j value to check with next elemnts
				}
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
