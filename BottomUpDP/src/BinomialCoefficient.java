import java.util.Arrays;
import java.util.Scanner;

public class BinomialCoefficient {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int tc = sc.nextInt();
		while(tc--!=0)
		{
			int n = sc.nextInt();
			int k = sc.nextInt();
			System.out.println(binomialCoefficientBottomUp(n,k));
		}
	}

	static long binomialCoefficientBottomUp(int n,int k)
	{
		long[][] dp=new long[n+1][k+1];
		for(int i=0;i<n+1;i++)
			dp[i][0] = 1;
		for(int i=0;i<=n;i++)
			for(int j=0;j<=k;j++)
				if(i<j)
					dp[i][j]=0;
				else if(i==j)
					dp[i][j]=1;
		for(int i=2;i<=n;i++)
			for(int j=1;j<=k;j++)
				dp[i][j]=dp[i-1][j]+dp[i-1][j-1];
		return dp[n][k];
	}
}
