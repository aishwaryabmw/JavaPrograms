import java.util.*;
public class MaxCostFRFCToLRLC {
	static int dp[][];
	public static void main(String args[])
	{
		
		Scanner sc=new Scanner(System.in);
		int m=sc.nextInt();
		int n=sc.nextInt();
		int a[][]=new int[m][n];
		for(int i=0;i<m;i++)
			for(int j=0;j<n;j++)
				a[i][j]=sc.nextInt();
		int cost=maxCost(a);
		System.out.println(cost);
	}
	
	static int maxCost(int a[][]) 
	{
	  dp=new int[1000][1000];
	  for(int i=0;i<dp.length;i++)
	  	Arrays.fill(dp[i],-1);
	  return maxCostHelper(a,0,0);
	}
	static int maxCostHelper(int a[][],int i,int j)
	{
	    if(i>=a.length || j>=a[0].length)
	      return Integer.MIN_VALUE;

	    if(i==a.length-1 && j==a[0].length-1)
	      return a[i][j];
	  	if(dp[i][j]!=-1)
	      return dp[i][j];
	  
	    int da=maxCostHelper(a,i+1,j);
	    int ra=maxCostHelper(a,i,j+1);
		return dp[i][j]=a[i][j]+Math.max(ra,da);
	}
}
