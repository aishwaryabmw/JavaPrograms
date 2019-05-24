import java.util.Scanner;

public class MinEditDistance {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		String str1=sc.next();
		System.out.println(minEditDistance(str.toCharArray(),str1.toCharArray()));
	}
	static int minEditDistance(char[] a,char[] b)
	{
		int dp[][]=new int[a.length+1][b.length+1];
		for(int i=b.length;i>=0;i--)
			dp[a.length][i]=b.length-i;
		for(int i=0;i<a.length;i++)
			dp[i][b.length]=a.length-i;
		for(int j=b.length-1;j>=0;j--)
		  {
		    for(int i=a.length-1;i>=0;i--)
		    {
		    	if(a[i]==b[j])
		    		dp[i][j]=dp[i+1][j+1];
		    	else
		    		dp[i][j]=1+Math.min(dp[i+1][j],Math.min(dp[i+1][j+1],dp[i][j+1]));
		    }
		  }
	
		return dp[0][0];
	}
	////using recursion
	int editDistanceHelper(char[] a,char b[],int i,int j)
	{
	  if(j>=b.length)
	    return a.length-i;
	  if(i>=a.length)
	    return b.length - j;
	  if(a[i]==b[j])
	    return editDistanceHelper(a,b,i+1,j+1);
	  int insert = 1+editDistanceHelper(a,b,i,j+1);
	  int replace= 1+editDistanceHelper(a,b,i+1,j+1);
	  int delete= 1+editDistanceHelper(a,b,i+1,j);
	  return Math.min(insert,Math.min(replace,delete));
	}
}
