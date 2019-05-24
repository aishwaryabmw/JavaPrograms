import java.util.*;
import java.lang.*;

class Test {
    
    
	public static void main (String[] args) {
	    
	    Scanner sc= new Scanner(System.in);
	    int n;
	    n=sc.nextInt();
	    long arr[]=new long[n];
	    
    long minS=0,maxS=0;
    
   
    for(int i=0;i<n;i++)
    {
        arr[i]=sc.nextLong();
    }
    Arrays.sort(arr);
    for(int i=0;i<n;i++)
    {
        if(i!=arr.length-1)
        minS+=arr[i];
        if(i!=0)
        maxS+=arr[i];
    }
    System.out.println(minS +" "+ maxS);
}
}