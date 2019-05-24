import java.util.Scanner;
class PrintAllNBinaryStrings {
    static void genBinaryNumbers(int nBits)
    {
        int p[]=new int[nBits];
        genBinaryNumbersHelper(nBits,p,0);
    }
    static void genBinaryNumbersHelper(int n,int p[],int pi)
    {
        if(pi==p.length)
        {
          for(int i=0;i<pi;i++)
          System.out.print(p[i]);
          System.out.print(" ");
          return ;
        }
        for(int i=0;i<=1;i++)
        {
          p[pi]=i;
          genBinaryNumbersHelper(n,p,pi+1);
        }
    }
    public static void main(String args[])
    {
    	Scanner sc=new Scanner(System.in);
    	int tc=sc.nextInt();
    	while(tc--!=0)
    	{
    		int n=sc.nextInt();
        genBinaryNumbers(n);
        System.out.println();
    	}
    }
}