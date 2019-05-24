import java.util.*;
import java.lang.*;
import java.io.*;

class Closest {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int tc = sc.nextInt();
		int n;
		while (tc>0)
		{
		     n = sc.nextInt();
		    int a[]=new int[n];
		    int num = sc.nextInt();
		    int b[]=new int[n];int min=0,minpos=0,minneg=0,minp=0,minn=0;
		    for(int i=0;i<n;i++)
		    {
		        a[i]=sc.nextInt();
		        b[i]=a[i]-num;
		      //  System.out.print(a[i]+" ");
		    }
		    for(int i=0;i<n;i++)
		    {
		        
		        System.out.print(b[i]+" ");
		    }
		    minp=b[0];
		    minn=b[0];
		    for(int i=1;i<n;i++)
		    {
		    	if(b[i]<minp && b[i]>0)
		    	{
		    		minp=b[i];
		    		minpos=i;
		    	}
		    	else if(b[i]>minn&& b[i]<0)
		    	{
		    		minn=b[i];
		    		minneg=i;
		    	}
		    }
		    System.out.print("minp"+minp);
		    System.out.print("minn"+minn);
		    System.out.print(a[minpos]);
		    if(a[minpos]>a[minneg]  && minneg!=0)
		    	System.out.println(a[minpos]);
		    else
		    	System.out.print(a[minpos]);
		    
		    System.out.println(" ");
		    tc--;
		}
	}
}
