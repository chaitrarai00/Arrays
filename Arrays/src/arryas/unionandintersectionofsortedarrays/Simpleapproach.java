package arryas.unionandintersectionofsortedarrays;

import java.util.Scanner;
//Time Complexity O(m+n) and space is O(1)
public class Simpleapproach {
private final static Scanner sc=new Scanner(System.in);
	
	public static void union(int n,int[] arrayn,int m, int[] arraym) {
		int i=0,j=0;//pointer to n and m arrays
		while(i<n && j<m) {
			if(arrayn[i]<arraym[j])
			{
				System.out.print(arrayn[i]+" ");//print the elemnt which is smaller
				i++;
			}
			else if(arraym[j]<arrayn[i])
			{
				System.out.print(arraym[j]+" ");
				j++;
			}
			else {
				//if elemnt is equal print only once
				System.out.print(arrayn[i]+" ");
				i++;
				j++;
			}
		}
		while(i<n) {
			System.out.print(arrayn[i++]+" ");
		}
		while(j<m) {
			System.out.print(arraym[j++]+" ");
		}
	}
	public static void intersection(int n,int[] arrayn,int m, int[] arraym) {
		System.out.println("");
		int i=0,j=0;//pointer to n and m arrays
		while(i<n && j<m) {
			if(arrayn[i]<arraym[j])
			{
				
				i++;
			}
			else if(arraym[j]<arrayn[i])
			{
				j++;
			}
			else {
				System.out.print(arrayn[i++]+" ");
				j++;
			}
		}
	}
	public static void main(String[] args) {
		//int testcases=sc.nextInt();
		//for(int i=0;i<testcases;i++)
		int[] arrayn={1,2,3,4,5};
		int[] arraym={4,5,6,7};
		union(arrayn.length, arrayn, arraym.length, arraym);
		intersection(arrayn.length, arrayn, arraym.length, arraym);
		
	}
}
