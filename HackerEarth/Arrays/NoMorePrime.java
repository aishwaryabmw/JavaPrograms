import java.util.*;
public class Test { 
    public static void main(String args[]) 
    { 
		Scanner sc=new Scanner(System.in);
        int n;
	    n=sc.nextInt();
	    long nums[]=new long[n];
	    int count=0;
		for(int i=0;i<n;i++)
		{
			nums[i]=sc.nextLong();
			for(int j=2;j<=nums[i]/2;j++)
			{
			    if(nums[i]%j == 0)
			        count++;
			}
			if(count>0 || nums[i]==1)
			    System.out.println(nums[i]+" ");
			count=0;
		}
		
    } 
}