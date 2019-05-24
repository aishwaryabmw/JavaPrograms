package sort;

import java.util.Scanner;

public class Quicksort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		quickSort(a,0,a.length-1);
		for(int i=0;i<n;i++)
		{
			System.out.print(a[i]+" ");
		}
	}

	private static void quickSort(int[] a, int i, int j) {
		
		if(i<j) 
		{
		int idx=partition(a,i,j);
		quickSort(a,i,idx-1);
		quickSort(a,idx+1,j);
		}
	}

	private static int partition(int[] a, int s, int e) {
		int pIndex=s;
		int pivot=a[e];
		for(int i=s;i<e;i++)
		{
			if(a[i]<=pivot)
			{
				int temp=a[i];
				a[i]=a[pIndex];
				a[pIndex]=temp;
				pIndex++;				
			}
		}
		int temp=a[pIndex];
		a[pIndex]=a[e];
		a[e]=temp;
		return pIndex;
	}

}
