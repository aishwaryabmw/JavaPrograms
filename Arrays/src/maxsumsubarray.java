import java.util.Scanner;

public class maxsumsubarray {
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
        maxContiguousSubArraySum(a);
       
        System.out.println();
      }
      
	}
	static void maxContiguousSubArraySum(int a[]) {
	  int c=0,i=0,j=0;
		  int max=a[0];
		  for(int k=0;k<a.length;k++)
		  {
		    c+=a[k];
		    max=Math.max(max,c);
		    if(c<0)
		    {
		      c=Math.max(c,0);
		      i=j+1;
		    }
		    j++;
		  } 
		  System.out.println(i+" "+--j);
	}
	
	

}
