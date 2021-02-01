package arrays.kthsmallestorlargestelement;

public class KthelementofUnsortedarraycountarray {
	public static int ksmallestelement(int[] array,int n,int k) {
	//first find the maximum value in the array
	int max=0;
	for(int i=0;i<n;i++) {
		if(array[i]>max)
			max=array[i];
	}
	//second get the count array of all elements till max to find the frequencies
	int[] counter=new int[max+1];
	//increment count value for each occurence/element in array
	for(int i=0;i<n;i++) {
		counter[array[i]]++;
	}
	int smallest=0;
	for(int i=1;i<=max;i++) {
		//increment smallest at each element occurence in 
		//order and on reaching k we get the required element
		if(counter[i]>0)
			smallest=smallest+counter[i];
		if(smallest>=k)
			return i;
			
	}
	return 0;//elements not found
	}
	public static void main(String[] args) {
		int[] array= {12,5,787,1,23};
		int k=3;
		System.out.println(k+"th smallest element: "+ksmallestelement(array,array.length-1,k));
		
	}
}
