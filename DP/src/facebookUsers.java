
import java.io.*;
import java.util.*;

public class facebookUsers {
static int dp[][]=new int[100][100];
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    	Scanner sc = new Scanner(System.in);
    	int n=5;int a[][]=new int[5][5];
    for(int i=0;i<n;i++)
    	for(int j=0;j<n;j++)
    	{
    		a[i][j]=sc.nextInt();
    	}
    for(int i=0;i<100;i++)
    	Arrays.fill(dp[0], -1);
    System.out.print(wormAffects(a,4,4));
    }
    
    static int wormAffects(int a[][],int i, int j)
    {
    	
    	
    	int up=0,down=0,left = 0,right=0;
    	if( dp[i][j]!=-1) return dp[i][j];
    	if(i-1<0)
    		up=0;
    	else
    	if(a[i-1][j]==1)
    	{
    		 up = 1+ wormAffects(a,i-1,j);
    	}
    	if(i+1>=a.length)down =0; 
    	else
    	if(a[i+1][j]==1)
    	{
    		 down =1+ wormAffects(a,i+1,j);
    	}
    	if(j-1<0) left=0;
    	else
    	if(a[i][j-1]==1)
    	{
    		 left = 1+wormAffects(a,i,j-1);
    	}
    	if(j+1>=a[0].length) right=0;
    	else
    	if(a[i][j+1]==1)
    	{
    		 right =1+ wormAffects(a,i,j+1);
    	}
    	
    	return dp[i][j]=up+down+left+right;
    }
}