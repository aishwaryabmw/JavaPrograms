/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class ReverseArray {
	public static void main (String[] args) {
		//code
		 Scanner sc=new Scanner(System.in); 
		 int tc = sc.nextInt();
		while(tc>0)
		{
			int n = sc.nextInt();
	         int a[]=new int[n];
			for(int i=0;i<n;i++)
			{
				a[i]=sc.nextInt();
			}
			int temp,j=n-1;
						for(int i=0;i<n;i++)
						{
							temp = a[i];
							a[i]=a[j];
							a[j]=temp;
							//System.out.println("");
							//for(int k=0;k<n;k++)System.out.print(a[k]+" ");
							if(n%2!=0)
							{
								if(i==j)break;
							} else
								{
									if(j==(i+1))break;
								}
							j--;
						}  
		for(int i=0;i<n;i++)
		{
			System.out.print(a[i]+ " ");
		} 
		System.out.println(" ");
		    tc--;
		}
		 
	}
}