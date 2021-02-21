package arrays.rotateanarray;
//Time complexity :O(n)
//Space complexity :1
public class Iterateandplacetheelemntbehind {
	public static int[] rotate(int[] array) {
		int x=array[array.length-1];
		for(int i=array.length-1;i>0;i--) {
			array[i]=array[i-1];
		}
		array[0]=x;
		return array;
	}
	public static void main(String[] args) {
		int[] array= {1,2,3,4,5,6};
		array=rotate(array);
		for(int i=0;i<array.length;i++) {
			System.out.print(array[i]+" ");
		}
		
	}

}
