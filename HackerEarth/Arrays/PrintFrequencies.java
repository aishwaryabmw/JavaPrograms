import java.util.*;
import java.lang.*;

class Test {
    
    public static void main (String[] args) {
	    Scanner sc= new Scanner(System.in);
	    int n,count=1,countTotal=0;
	    n=sc.nextInt();
	    long arr[]=new long[n];
        for(int i=0;i<n;i++)
            arr[i]=sc.nextLong();
        Arrays.sort(arr);
        for(int i=0;i<n-1;i++)
        {
          
           if(arr[i]==arr[i+1])
           {
               count++;
               continue;
           }
           System.out.print(arr[i]+"-"+count+" ");
           countTotal+=count;
           count=1;
        }
        if(countTotal!=n)
            System.out.print(arr[n-1]+"-"+count);
	}
}