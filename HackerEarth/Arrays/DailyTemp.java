import java.util.*;
import java.lang.*;

class DailyTemp {
    
    public static void main (String[] args) {
	    Scanner sc= new Scanner(System.in);
	    int n,count=0;
	    n=sc.nextInt();
	    long arr[]=new long[n];
        for(int i=0;i<n;i++)
            arr[i]=sc.nextLong();
       int j;
        for(int i=0;i<n-1;i++)
        {
            for(j=i+1;j<n;j++)
            {
                if(arr[i]>=arr[j])
                    continue;
                else if(arr[i]<arr[j])
               {
                  count=j-i;
                  System.out.print(count+" ");
                  break;
               }
            }
            if(j==n)// no next greater element 
                System.out.print(0+" ");
        }
        System.out.print(0+" ");
       
	}
}