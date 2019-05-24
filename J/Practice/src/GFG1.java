/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG1 {
	public static void main (String[] args) {
		//code
		 Scanner sc=new Scanner(System.in); 
		 int tc = sc.nextInt();
		while(tc>0)
		{
		    int n = sc.nextInt();
	        int arg[]=new int[n];
			for(int i=0;i<n;i++)
			{
				arg[i]=sc.nextInt();
			}
			
		for(int i=0;i<n-1;i++)
		{
    		    if(arg[i]>arg[i+1])
    		    {
    		        System.out.print(arg[i+1]);
    		    }
    		    else
    		    {
    		         System.out.print("-1");
    		    }
		        System.out.print(" ");
		}  
		    System.out.println("-1");
		    tc--;
		}
	}
}