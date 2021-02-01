package arrays.kthsmallestorlargestelement;

import java.util.Arrays;

public class Kthelementwithmedianpivot {
	public static int partition(int[] array,int low,int high,int x) {
		int i;
		for(i=low;i<high;i++) 
			if(array[i]==x)
				break;
		swap(array, i, high);
		i=low;
		for(int j=low;j<high;j++) {
			if(array[j]<=x) {
				swap(array,i, j);
				i++;
			}
		}
		swap(array,i,high);// swap the i and pivot position the last swap to create a partition
		return i;
	}
	public static int[] swap(int[] array,int i,int j) {
		int temp=array[i];
		array[i]=array[j];
		array[j]=temp;
		return array;
	}
	
	public static int find_median(int[] array,int i,int n) {
		if(i<=n)
			Arrays.sort(array,i,n);
		else
			Arrays.sort(array,n,i);
		return array[n/2];
	}
	
	public static int ksmallestelement(int[] array,int low,int high,int k) {
		if(k>0 && k<=(high-low+1)) {
			int n=high-low+1;
			int i;
			//create an array of medians and split it into groups of 5 element
			int[] median=new int[(n+4)/5];
			for(i=0;i<n/5;i++) {
				median[i]=find_median(array, low+i*5, 5);
			}
			if(i*5<n) {//remaining elements which are less than 5
				median[i]=find_median(array, low+i*5, n%5);
				i++;
			}
			//find median of medians to make partition from the elements
			int medianofmedian=(i==1)?median[i-1]:ksmallestelement(array,0, i-1, i/2);
			int position=partition(array, low, high, medianofmedian);
			if(position-low==k-1)
				return array[position];//the kth smmallest element is found
			else if(k-1<position-low)
				return ksmallestelement(array, low, position-1, k);// pivot is way past the kth smallest element, search the kth element is in the left subarray
			else
				return ksmallestelement(array, position+1, high, k-(position+low)-1);// the pivot is behind the kth smallest element search the right subarray 
			//we change the kth element so that right k is found and not biased by the positioning towards right
		}
	return 0;//elements not found
	}
	public static void main(String[] args) {
		int[] array= {12,5,787,1,23};
		int k=3;
		System.out.println(k+"th smallest element: "+ksmallestelement(array,0, array.length-1,k));
		
	}
}
