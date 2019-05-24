/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class Sorting012 {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int tc = sc.nextInt();
		int size;
		while (tc>0)
		{
		     size = sc.nextInt();
		    int a[]=new int[size],countzero=0,countone=0,counttwo=0;
		    int b[]=new int[size];
		    
		    for(int i=0;i<size;i++)
		    {
		        a[i]=sc.nextInt();
		        
		    }
		    int j=0;
		    for(int i=0;i<size;i++)
		    {
		        if(a[i]==0)
		        {
		        	b[j]=0;
		        	j++;
		        }
		        
		    }
		    for(int i=0;i<size;i++)
		    {
		        if(a[i]==1)
		        {
		        	b[j]=1;
		        	j++;
		        }
		        
		    }
		    for(int i=0;i<size;i++)
		    {
		        if(a[i]==2)
		        {
		        	b[j]=2;
		        	j++;
		        }
		        
		    }
		    
		    for(int i=0;i<size;i++)
		    	 System.out.print(b[i]+" ");

		   
		    System.out.println("");
		   tc--; 
		}
	}
}
