/**
 * 
 */
package sort;

import java.util.Scanner;

/**
 * @author biraa
 *
 */
public class MergeSort {

	/**
	 * 
	 */
	public MergeSort() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		mergeSort(a,0,a.length-1);
		for(int i=0;i<n;i++)
		{
			System.out.print(a[i]+" ");
		}
		
	}

	private static void mergeSort(int[] a, int s, int e) {
		// TODO Auto-generated method stub
		if(s>=e)
			return;
		int mid=(s+e)/2;
		mergeSort(a,s,mid);
		mergeSort(a,mid+1,e);
		merge(a,s,e);
	}

	private static void merge(int[] a, int s, int e) {
		int mid=(s+e)/2;
		int i=s,j=mid+1,k=s;
		int t[]=new int[100];
		while(i<=mid&&j<=e)
		{
			if(a[i]<a[j])
				t[k++]=a[i++];
			else if(a[i]>a[j])
				t[k++]=a[j++];
			else
			{
				t[k++]=a[i++];
				t[k++]=a[j++];
			}
		}
		while(i<=mid)
		{
				t[k++]=a[i++];
		}
		while(j<=e)
		{
				t[k++]=a[j++];
		}
		
		for(int p=s;p<=e;p++)
		{
			a[p]=t[p];
		}
		
	}

}
