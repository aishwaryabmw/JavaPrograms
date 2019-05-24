import java .util.Scanner;
public class MaxConnected
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
		
		
		System.out.println(ratPath(a));
	}
	}
	
	static int ratPath(int[][] a)
	{
		int max=-1;
		int cost=0;
		
		for(int i=0;i<a.length;i++)
			for(int j=0;j<a[0].length;j++)
			{
				cost=ratPathHelper(a,i,j);
				if(cost>max)
					max=cost;
			}
		return max;
	}
	static int ratPathHelper(int[][] a,int i,int j)
	{
				
		if(i<0 || j<0||i>=a.length||j>=a[0].length||a[i][j]==0)
			return 0;
		
		if(i+1<a.length&&a[i+1][j]==1)
		{
			a[i][j]=0;
			return 1+ratPathHelper(a,i+1,j);
		}
		if(j-1>=0&&a[i][j-1]==1)
		{
			a[i][j]=0;
			return 1+ratPathHelper(a,i,j-1);
		}
		if(j+1<a[0].length&&a[i][j+1]==1)
		{
			a[i][j]=0;
			return 1 +ratPathHelper(a,i,j+1);
		}
		
		if(i-1>=0&&a[i-1][j]==1)
		{
			a[i][j]=0;
			return 1+ratPathHelper(a,i-1,j);
		}
		a[i][j]=1;
		return 1;
	}
	
}
