import java.util.Scanner;
public class GenerateBinaryStrZeroToN {
    static void genBinaryNumbers(int n,int p[],int idx)
    {
   
        if(idx>n)
        {
          for(int i=0;i<idx;i++)
          System.out.print(p[i]);
          System.out.print(" ");
          return ;
        }
        for(int i=0;i<=1;i++)
        {
          p[idx]=i;
          genBinaryNumbers(n,p,idx+1);
        }
    }
    public static void main(String args[])
    {
    	Scanner sc=new Scanner(System.in);
    	int tc=sc.nextInt();
    	while(tc--!=0)
    	{
    		int n=sc.nextInt();
    		int p[]=new int[n];
    		for(int i=0;i<n;i++)
    			genBinaryNumbers(i,p,0);
        System.out.println();
    	}
    }
}