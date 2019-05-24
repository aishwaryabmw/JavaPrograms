
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
	boolean b=areThreeIdiotsIn(arr);
	if(b)
		System.out.println("yes");
	else
		System.out.println("no");
	}

	public static boolean areThreeIdiotsIn(long arr[]) {
    boolean t=false;
  		if(arr.length>=3)
        for(int i=1;i<arr.length -1;i++)
          {
          	if((arr[i]>arr[i-1])&&(arr[i]<arr[i+1]))
            {
              if((arr[i]-arr[i-1])==(arr[i+1]-arr[i]))
              {
              t=true;
                break;
              }
            }
              
          }
          return t;
	}
}