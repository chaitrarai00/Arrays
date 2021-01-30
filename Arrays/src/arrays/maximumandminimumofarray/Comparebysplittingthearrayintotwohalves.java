package arrays.maximumandminimumofarray;
/*
 * Each element being compared and hence a time complexity of the 
 * algorithm would be O(n)
 */
public class Comparebysplittingthearrayintotwohalves {
	/*
	 * The comparison of the elements happen by splitting the array into two
	 * from the middle and then considering the max and min of each resultant array
	 * and comparing the end max min with each other
	 *  
	 */
	public static Pair minmax=new Pair();
	public static Pair minmax_low=new Pair();
	public static Pair minmax_high=new Pair();
	public static Pair minmax_array(int[] array,int low,int high) {
		minmax.min=Integer.MAX_VALUE;
		minmax.max=Integer.MIN_VALUE;
		if(low==high) {
			if(array[low]<minmax.min)
				minmax.min=array[low];
			else if(array[low]>minmax.max)
				minmax.max=array[low];
			return minmax;
		}
		if(low+1==high) {
			if(array[low]>array[high] ) {
				if(array[low]>minmax.max)
				minmax.max=array[low];
				if(array[high]<minmax.min)
				minmax.min=array[high];
				}
			else {
				if(array[high]>minmax.max)
					minmax.max=array[high];
				if(array[low]<minmax.min)
					minmax.min=array[low];
			}
			return minmax;
		}
		
		int middle=(low+high)/2;
		minmax_low=minmax_array(array, low,middle);
		minmax_high=minmax_array(array, middle+1, high);
		if(minmax_low.max>minmax_high.max)
			{
			minmax.max=minmax_low.max;
			}
		else { 
			minmax.max=minmax_high.max;
		}if(minmax_low.min<minmax_high.min)
			{
			minmax.min=minmax_low.min;
			}
		else {
			minmax.min=minmax_high.min;
		}
		return minmax;
	}
	public static void main(String[] args) {
		int[] array= {4,5,9,6,6,1};
		minmax_array(array,0,array.length-1);
		System.out.println("Maximum in array: "+minmax.max+", Minimum in array: "+minmax.min);
	}

}
