package arryas.unionandintersectionofsortedarrays;


import java.util.TreeSet;
//Time O(m+n)
public class Setforuniuonintersection {
	public static void union(int[] arrayn, int[] arraym) {
		//add all eleemnets in a set
		//tghe set will handle removing the duplicates
		TreeSet<Integer> set=new TreeSet<Integer>();
		for(int i=0;i<arrayn.length;i++)
			set.add(arrayn[i]);
		for(int j=0;j<arraym.length;j++)
			set.add(arraym[j]);
		for(Integer i:set)
			System.out.print(i+" ");
	}
	
	public static void intersection(int[] arrayn, int[] arraym) {
		//insert elements from one arrAY TO SET
		System.out.println("");
		TreeSet<Integer> set=new TreeSet<Integer>();
		for(int i=0;i<arrayn.length;i++)
			set.add(arrayn[i]);
		//while iterating throught elemnts 
		//in second arary check if elemnts already exists in the set
		//that is has vbeen inserted last time
		// if set contains the elemnt it means its part of the intersection
		for(int j=0;j<arraym.length;j++) {
			if(set.contains(arraym[j]))
				System.out.print(arraym[j]+" ");
		}
			
	}
	public static void main(String[] args) {
		int[] arrayn={1,2,3,4,5};
		int[] arraym={4,5,6,7};
		
		union( arrayn, arraym);
		intersection( arrayn,arraym);
	}

}
