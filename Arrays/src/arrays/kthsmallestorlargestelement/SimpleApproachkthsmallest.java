package arrays.kthsmallestorlargestelement;

import java.util.Arrays;
/*
 * Most simple approach would be to first sort the array into ascending/descending order
 * and find the kth smallest elements from the k-1 index as the array on sorting will 
 * place elements in the required sorted order
 * Time complexity would be same O(nlogn) for  sorting(same as sorting algorithm)
 * and to retireve O(1)
 * so the total complexity of the method O(nlogn)
 */
public class SimpleApproachkthsmallest {
	public static int ksmallestelement(int[] array,int n) {
		Arrays.sort(array);
		return array[n-1];
	}
	public static void main(String[] args) {
		int[] array= {12,5,787,1,23};
		int n=3;
		System.out.println(n+"th smallest element: "+ksmallestelement(array, n));
		
	}

}
