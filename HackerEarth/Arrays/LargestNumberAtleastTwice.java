
import java.util.*;
import java.lang.*;

class Test {
    public static int largestNumberAtleastTwice(long arr[])
    {
        long max=arr[0];
		int index=-1;
        for(int i=1;i<arr.length;i++)
        {
			if(arr[i]>max)
			{
				max=arr[i];
				index=i;
			}
           //max=Math.max(max, arr[i]);
        }
    	for(int i=0;i<arr.length;i++)
        {
			
            if(arr[i]!=max)
                if(arr[i]*2>max)
                    return -1;       
        }
        return index;
    }
	public static void main (String[] args) {
	    Scanner sc= new Scanner(System.in);
	    int n;
	    n=sc.nextInt();
	    long arr[]=new long[n];
        for(int i=0;i<n;i++)
            arr[i]=sc.nextLong();
        int isLarge = largestNumberAtleastTwice(arr);
        System.out.println(isLarge);
	}

	
}