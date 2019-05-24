import java.util.*;
import java.lang.*;
import java.io.*;

class Leader {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int tc = sc.nextInt();
		int n;
		while (tc>0)
		{
		     n = sc.nextInt();
		    int a[]=new int[n];
		    
		    for(int i=0;i<n;i++)
		    {
		        a[i]=sc.nextInt();
		      //  System.out.print(a[i]+" ");
		    }
		    int j,leader;
		    for(int i=0;i<n;i++)
		    {
		    	//j=n-i;
		    	leader=a[i];
		    	for(j=i+1;j<n;j++)
		    	{
		    		if(leader<=a[j])
		    		{
		    			break;
		    		}
		    		
		    		if(j==(n-1))
		    		{
		    			System.out.print(leader+" ");
		    		}
		    	}
		    }
		    //System.out.println(n);
		    System.out.print(a[n-1]);
		    System.out.println(" ");
		    tc--;
		}
	}
}
