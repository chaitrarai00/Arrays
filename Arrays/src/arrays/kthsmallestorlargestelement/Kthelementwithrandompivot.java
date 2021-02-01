package arrays.kthsmallestorlargestelement;

public class Kthelementwithrandompivot {
	public static int partition(int[] array,int low,int high) {
		int pivot=array[high];
		int i=low;
		for(int j=low;j<=high-1;j++) {
			if(array[j]<pivot) {
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
	
	public static int random_partition(int[] array,int low,int high) {
		int n=high-low+1;
		int pivot=(int)Math.random()*(n-1);//pick a random pivot between low and high
		swap(array,pivot+low,high);//create a partition from of the random pivot
		return partition(array, low, high);
	}
	
	public static int ksmallestelement(int[] array,int low,int high,int k) {
		if(k>0 && k<=(high-low+1)) {
			int position=random_partition(array, low, high);
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
