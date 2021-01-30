package arrays.maximumandminimumofarray;
/*
 * time complexity of the 
 * algorithm would be O(n)
 */
public class Comparebysplittingthearrayintotwohalves {
	/*
	 * The comparison of the elements happen by splitting the array into two
	 * from the middle and then considering the max and min of each resultant array
	 * and comparing the end max min with each other
	 *  
	 */
	
	
	
	
	public static Pair minmax_array(int[] array,int low,int high) {
		Pair minmax=new Pair();
		Pair minmax_low=new Pair();
		Pair minmax_high=new Pair();
		int middle;
		if(low==high) {
			minmax.max=array[low];
			minmax.min=array[low];
			return minmax;
		}
		if(high==low+1) {
			if(array[low]<array[high]){
				minmax.max=array[high];
				minmax.min=array[low];
			}
			else {
				minmax.max=array[low];
				minmax.min=array[high];
			}
		}
		middle=(low+high)/2;
		minmax_low=minmax_array(array, low, middle);
		minmax_high=minmax_array(array, middle+1, high);
		if(minmax_low.min<minmax_high.min) {
			minmax.min=minmax_low.min;
		}
		else {
			minmax.min=minmax_high.min;
		}
		if(minmax_high.max>minmax_low.max) {
			minmax.max=minmax_high.max;
		}
		else {
			minmax.max=minmax_low.max;
		}
		return minmax;
	}
	public static void main(String[] args) {
		int[] array= {4,5,9,6,6,1};
		Pair minmax=minmax_array(array,0,array.length-1);
		System.out.println("Maximum in array: "+minmax.max+", Minimum in array: "+minmax.min);
	}

}
