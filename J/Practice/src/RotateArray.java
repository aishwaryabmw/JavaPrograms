/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class RotateArray {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int tc = sc.nextInt();
		int size;
		while (tc>0)
		{
		     size = sc.nextInt();
		    int a[]=new int[size];
		    
		    for(int i=0;i<size;i++)
		    {
		        a[i]=sc.nextInt();
		        
		    }
		    int d = sc.nextInt();
		    int j= 0;
		    int b[]=new int[size];
		    
		    	for(int i=d;i<size;i++)
			    {
			       
			        b[j]=a[i];
			        j++;
			       // System.out.print(b[j]+" ");
			    }
		    	j=size-d;
		    	for(int i=0;i<d;i++)
		    	{
		    		b[j]=a[i];
		    		j++;
		    		//System.out.print(b[j]+" ");
		    	}
		    	for(int i=0;i<size;i++)
		    	{
		    		
		    		System.out.print(b[i]+" ");
		    	}
		    
		    
		    //else
		    //	for(int i=0;i<size;i++)System.out.print(a[i]+" ");
		    System.out.println("");
		   tc--; 
		}
	}
}
