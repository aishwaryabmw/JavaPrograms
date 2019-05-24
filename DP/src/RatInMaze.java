import java .util.Scanner;
public class RatInMaze
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
		
		ratPath(a);
		System.out.println();
	}
	}
	
	static void ratPath(int[][] a)
	{
		ratPathHelper(a,0,0,new StringBuilder());
	}
	static void ratPathHelper(int[][] a,int i,int j,StringBuilder str)
	{
		if(i==a.length-1 && j==a[0].length-1)
		{
			System.out.print(str+" ");
			return;
		}
		
		if(i<0 || j<0||i>=a.length||j>=a[0].length||a[i][j]==0)
			return;
		
		if(i+1<a.length&&a[i+1][j]==1)
		{
			a[i][j]=0;
			ratPathHelper(a,i+1,j,str.append('D'));
			if(str.length()>=1)
				str=str.deleteCharAt(str.length()-1);
					
		}
		if(j-1>=0&&a[i][j-1]==1)
		{
			a[i][j]=0;
			ratPathHelper(a,i,j-1,str.append('L'));
			if(str.length()>=1)
				str=str.deleteCharAt(str.length()-1);
			
		}
		if(j+1<a[0].length&&a[i][j+1]==1)
		{
			a[i][j]=0;
			ratPathHelper(a,i,j+1,str.append('R'));
			if(str.length()>=1)
				str=str.deleteCharAt(str.length()-1);
			
		}
		
		if(i-1>=0&&a[i-1][j]==1)
		{
			a[i][j]=0;
			ratPathHelper(a,i-1,j,str.append('U'));
			if(str.length()>=1)
				str=str.deleteCharAt(str.length()-1);
						
		}
		
		a[i][j]=1;
	}
	
}
