import java.util.*;
import java.lang.*;

class Test {

	public static void main (String[] args) {
	    
	    Scanner sc= new Scanner(System.in);
	    int n;
	    n=sc.nextInt();
	    long arr[]=new long[n];
	   
    for(int i=0;i<n;i++)
    {
        arr[i]=sc.nextLong();
    }
	int i=0;
	for(;i<n-1;i+=2)
    {
        long temp=arr[i];
		arr[i]=arr[i+1];
		arr[i+1]=temp;
		 System.out.print(arr[i]+" "+arr[i+1]+" ");
    }
   
	}
}