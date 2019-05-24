
import java.util.Scanner;

public class MaxSumNonCont {
	static int max=-1;
	public static void main(String[] args)
	{
		StringBuilder s = new StringBuilder();
		s.reverse();
      Scanner sc= new Scanner(System.in);
		int tc = sc.nextInt();
      while(tc--!=0)
      {
        int n = sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
          a[i]=sc.nextInt();
        System.out.println(maxContiguousSubArraySum(a,0));
      }
      
	}
	static int maxContiguousSubArraySum(int a[],int i) {
	  if(i>=a.length)
		  return 0;
	  int incl = a[i]+maxContiguousSubArraySum(a,i+2);
	  int exc = maxContiguousSubArraySum(a,i+1);
	  return Math.max(max, Math.max(incl, exc));
	}
	
	

}
