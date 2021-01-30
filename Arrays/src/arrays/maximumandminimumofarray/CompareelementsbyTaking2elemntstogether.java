package arrays.maximumandminimumofarray;
/*
 * time complexity of the 
 * algorithm would be O(n)
 */
public class CompareelementsbyTaking2elemntstogether {
	/*
	 * The comparison of the elements happens by taking two elements at a time
	 * comparing them first
	 * hence this avoid overlapping and 2 elemnts are compared at once
	 * the number of comparisons is reduced but the time complexity remains the same
	 *  
	 */
	public static Pair minmax_array(int[] array,int n) {
		Pair minmax=new Pair();
		int i;
		if(n%2==0) {
			i=2;
			if(array[1]>array[0]) {
				minmax.max=array[1];
				minmax.min=array[0];
			}
			else {
				minmax.max=array[0];
				minmax.min=array[1];
			}
		}
		else {
			i=1;
			minmax.min=array[0];
			minmax.max=array[0];
		}
		while(i<n-1) {
			if(array[i]<(array[i+1])) {
				if(array[i]<minmax.min)
					minmax.min=array[i];
				if(array[i+1]>minmax.max)
					minmax.max=array[i+1];
			}
			else {
				if(array[i+1]<minmax.min)
					minmax.min=array[i+1];
				if(array[i]>minmax.max)
					minmax.max=array[i];
			}
			i+=2;
		}
		return minmax;
	}
	public static void main(String[] args) {
		int[] array= {4,5,9,6,6,1};
		Pair minmax=minmax_array(array, array.length);
		System.out.println("Maximum in array: "+minmax.max+", Minimum in array: "+minmax.min);
	}

}
