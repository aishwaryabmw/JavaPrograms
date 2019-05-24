import java.util.*;

public class count012
{
	public static void main(String[] args)
	{
      Scanner sc= new Scanner(System.in);
		int tc = sc.nextInt();
      while(tc--!=0)
      {
        int n = sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
          a[i]=sc.nextInt();
        a= sort(a);
        for(int i=0;i<a.length;i++)
        	System.out.print(a[i]+" ");
        System.out.println();
      }
      
     
	}
  static int[] sort(int a[])
  {
    int i=0,j=0,k=a.length-1;
    while(j<=k&&j<a.length)
    {
    
     if(a[j]==0)
     {
       int s = a[i];
       a[i]=a[j];
       a[j]=s;
       i++;
       j++;
     }
     else if(a[j]==2)
     {
       int s = a[k];
       a[k]=a[j];
       a[j]=s;
       k--;
     }
     else j++;
    }
    return a;
  }
}