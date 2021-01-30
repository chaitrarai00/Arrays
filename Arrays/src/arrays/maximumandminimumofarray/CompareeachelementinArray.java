package arrays.maximumandminimumofarray;
/*
 * Each element being compared and hence a time complexity of the 
 * algorithm would be O(n)
 */
public class CompareeachelementinArray {
	/*
	 * The comparison of the elements happen one by one here
	 * each element is compared with the element next to it
	 *  
	 */
	public static void minmax_array(int[] array,int n) {
		Pair minmax=new Pair();
		if(n==1) {
			minmax.max=array[0];
			minmax.min=array[1];
		}
		if(array[0]>array[1]) {
			minmax.max=array[0];
			minmax.min=array[1];
		}
		else {
			minmax.max=array[1];
			minmax.min=array[0];
		}
		for(int i=2;i<n;i++) {
			if(array[i]>minmax.max)
				minmax.max=array[i];
			else if(array[i]<minmax.min)
				minmax.min=array[i];
		}
		System.out.println("Maximum in array: "+minmax.max+", Minimum in array: "+minmax.min);
	}
	public static void main(String[] args) {
		int[] array= {4,5,9,6,6,1};
		minmax_array(array,array.length);
	}

}
