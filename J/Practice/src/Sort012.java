/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class Sort012 {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int tc = sc.nextInt();
		int size;
		while (tc>0)
		{
		     size = sc.nextInt();
		    int a[]=new int[size],countzero=0,countone=0,counttwo=0;
		    
		    for(int i=0;i<size;i++)
		    {
		        a[i]=sc.nextInt();
		        
		    }
		    
		    for(int i=0;i<size;i++)
		    {
		        if(a[i]==0) countzero++;
		        else if(a[i]==1) countone++;
		        else counttwo++;
		        System.out.println("zero "+countzero);
		        System.out.println("one "+countone);
		        System.out.println("two "+counttwo);
		    }
		    for(int i=0;i<countzero;i++)
		    	 a[i]=0;
		    for(int i=countzero;i<countone+countzero;i++)
		    	 a[i]=1;
		    for(int i=(countone+countzero);i<size;i++)
		    	 a[i]=2;
		    for(int i=0;i<size;i++)
		    	 System.out.print(a[i]+" ");

		   
		    System.out.println("");
		   tc--; 
		}
	}
}
