import java.util.Scanner;

public class LongestCommonSubsequence {

	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		String str1=sc.next();
		System.out.println(lcsLen(str.toCharArray(),str1.toCharArray()));
	}
	static int lcsLen(char a[], char b[]) 
	{ 
		
	  int dp[][]=new int[a.length+1][b.length+1];
	  for(int j=b.length-1;j>=0;j--)
	  {
	    for(int i=a.length-1;i>=0;i--)
	    {
	      if(a[i]==b[j])
	        dp[i][j]=1+dp[i+1][j+1];
	      else
	        dp[i][j] = Math.max(dp[i+1][j],dp[i][j+1]);
	    }
	  }
	  return dp[0][0];
	}
	
}
