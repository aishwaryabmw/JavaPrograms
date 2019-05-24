/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class NthFibonacci {
	
	public int fibonacci(int n)
	{
		int n1=1;int n2=1,fib=0,temp;
		for(int i=3;i<=n;i++)
		{
			fib = n1+n2;
			temp = fib;
			n1=n2;
			n2=temp;
		}
		return fib;
	}
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		NthFibonacci fibn= new NthFibonacci();
		
		int tc = sc.nextInt();
		int n = sc.nextInt();
		int k;
		while (tc>0)
		{	
			if(n==1 || n==2)
				k=1;
			else
			 k=fibn.fibonacci(n);
			System.out.println(k);
		    tc--; 
		}
	}
}
