import java.util.Arrays;
import java .util.Scanner;
public class HarryPotterStones
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int tc = sc.nextInt();
		while(tc--!=0)
		{
		int m=sc.nextInt();
		int n=sc.nextInt();
		int a[][]=new int[m][n];
		for(int i=0;i<m;i++)
			for(int j=0;j<n;j++)
				a[i][j]=sc.nextInt();
		System.out.println(maxCost(a));
	}
	}
	static int dp[][];
	static int maxCost(int[][] a)
	{
		int max=-1;
		int cost=0;
		dp=new int[a.length][a[0].length];
		for(int i=0;i<a.length;i++)
			Arrays.fill(dp[i], -1);
		for(int i=0;i<a.length;i++)
			for(int j=0;j<a[0].length;j++)
			{
				cost=maxCostHelper(a,i,j);
				if(cost>max)
					max=cost;
			}
		return max;
	}
	////backtracking soln
	/*static int maxCostHelper(int[][] a,int i,int j)
	{
		if(i<0 || j<0||i>=a.length||j>=a[0].length)
			return 0;
		int leftDiag =  maxCostHelper(a,i+1,j-1);
		int rightDiag = maxCostHelper(a,i+1,j+1);
		int down = maxCostHelper(a,i+1,j);
		return a[i][j]+Math.max(leftDiag,Math.max(rightDiag,down));
	}*/
	
	////dp solution
	static int maxCostHelper(int[][] a,int i,int j)
	{
		if(i<0 || j<0||i>=a.length||j>=a[0].length)
			return 0;
		if(dp[i][j]!=-1)
			return dp[i][j];
		int leftDiag =  maxCostHelper(a,i+1,j-1);
		int rightDiag = maxCostHelper(a,i+1,j+1);
		int down = maxCostHelper(a,i+1,j);
		return dp[i][j]=a[i][j]+Math.max(leftDiag,Math.max(rightDiag,down));
	}
	
	
}
