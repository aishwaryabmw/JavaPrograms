import java.util.*;
import java.lang.*;

class PrintOneToN {
    
    public static void printN(int n)
    {
        if(n==0) return ;
        printN(n-1);
        System.out.print(n+" ");
        
    }
	public static void main (String[] args) {
	    int  tc=0;
	    Scanner sc=new Scanner(System.in);
	    tc=sc.nextInt();
	    int n;
	    while(tc>0)
	    {
	        n=sc.nextInt();
	        printN(n);
	        tc--;
	    }
	}
}