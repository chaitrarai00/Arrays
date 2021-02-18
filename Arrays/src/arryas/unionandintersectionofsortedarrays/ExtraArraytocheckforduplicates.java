package arryas.unionandintersectionofsortedarrays;
//Time Complecity O(m+n
//Space is O(largest elemnt)
public class ExtraArraytocheckforduplicates {
	public static int[] numarray;// we keep an extra array to check if elemnts are added prior or not
	public static void initiatenumarray(int[] arrayn, int[] arraym) {
		int n=arrayn[arrayn.length-1];
		int m=arraym[arraym.length-1];
		int ans;
		if(n>m)
			ans=n;
		else
			ans=m;
		numarray=new int[ans+1];
	}
	public static void union(int n,int[] arrayn,int m, int[] arraym) {
		for(int i=0;i<n;i++) {
			System.out.print(arrayn[i]);
			++numarray[arrayn[i]];
		}
		for(int i=0;i<m;i++) {
			if(numarray[arraym[i]]==0)
			{System.out.print(arraym[i]);
			++numarray[arraym[i]];
		}}
	}
	public static void intersection(int n,int[] arrayn,int m, int[] arraym) {
		System.out.println("");
		int i=0,j=0;
		while(i<n && j<m) {
			if(arrayn[i]==arraym[j]) {
				System.out.print(arrayn[i++]);
				j++;
				}
			else if(arrayn[i]<arraym[j]) {
				i++;
				
			}
			else if(arraym[j]<arrayn[i]) {
				j++;
			}
		}
	}
	public static void main(String[] args) {
		//int testcases=sc.nextInt();
		//for(int i=0;i<testcases;i++)
		int[] arrayn={1,2,3,4,5};
		int[] arraym={4,5,6,7};
		initiatenumarray( arrayn, arraym);
		union(arrayn.length, arrayn, arraym.length, arraym);
		intersection(arrayn.length, arrayn, arraym.length, arraym);
		
	}
}
