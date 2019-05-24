import java.util.Scanner;

public class MaxWintsellingProfit {

	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
			a[i]=sc.nextInt();
		System.out.println(maxProfit(a));
	}
	static int maxWineSellingProfit(int a[])
	{
	    // Your Code Here...
	  return maxWineSellingProfitHelper(a,0,a.length-1);
	  
	}
	static int maxWineSellingProfitHelper(int[] a,int i,int j)
	{
	  if(i==j)
	    return a[i]*a.length;
	  if(i>j)
		  return 0 ;
	  
	  int first = a[i]*(a.length-j+i) +maxWineSellingProfitHelper(a,i+1,j);
	  int last = a[j]*(a.length-j+i) + maxWineSellingProfitHelper(a,i,j-1);
	    return Math.max(first,last);
	}
	/////same above functionality without recursion
	static int maxProfit(int[] a)
	{
		int dp[][]=new int[a.length+2][a.length+2];
		for(int i=1;i<=a.length;i++)
			dp[i][i] = a[i-1]*a.length;
	
			for(int j=1;j<=a.length;j++)
				dp[j][a.length+1]=a[j-1];
			for(int j=1;j<=a.length;j++)
				dp[a.length+1][j]=a[j-1];
		for(int k=1;k<a.length;k++)
		for(int i=a.length-k,j=i+k;i>0&&j>0;i--,j--)
		{
			if(dp[i+1][j]>dp[i][j-1])
				dp[i][j]=dp[dp.length-1][j]*(j-i)+dp[i+1][j];
			else if(dp[i+1][j]<dp[i][j-1])
				dp[i][j]=dp[i][dp.length-1]*(j-i)+dp[i][j-1];
			else
				dp[i][j]= Math.max(dp[dp.length-1][j],dp[i][dp.length-1] )*(j-i)+dp[i][j-1];
		}
			//dp[i][j]=a[j]*(j-i)+Math.max(dp[i+1][j],dp[i][j-1]);
		return dp[1][dp.length-2];
	}
}
