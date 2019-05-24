
import java.util.Arrays;
import java.util.Scanner;

public class MaxWineProfit {

	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
			a[i]=sc.nextInt();
		System.out.println(maxWineSellingProfit(a));
	}
static int dp[][];
static int maxWineSellingProfit(int a[])
{
    // Your Code Here...
  dp=new int[100][100];
  for(int i=0;i<100;i++)
	  for(int j=0;j<100;j++)
		  dp[i][j]=-1;
		  
  return maxWineSellingProfitHelper(a,0,a.length-1);
  
}
static int maxWineSellingProfitHelper(int[] a,int i,int j)
{
  if(i>j)
    return dp[i][j]=0;
  if(i==j)
    return dp[i][j]=a[i]*a.length;
  if(dp[i][j]!=-1)
    return dp[i][j];
  int first = a[i]*(a.length-j+i) +maxWineSellingProfitHelper(a,i+1,j);
  int last = a[j]*(a.length-j+i) + maxWineSellingProfitHelper(a,i,j-1);
    return dp[i][j]=Math.max(first,last);
}
}