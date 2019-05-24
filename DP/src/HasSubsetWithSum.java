import java.util.Arrays;
import java.util.Scanner;
public class HasSubsetWithSum {
	static boolean dp[][]=new boolean[5500][25000];
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<dp.length;i++)
    	  	Arrays.fill(dp[i],false);
         while(t--!=0){
            int n = sc.nextInt();
            int a[]=new int[n];
            if(n==0) return;
            for(int i=0;i<n;i++)
            	a[i]=sc.nextInt();
            int sum = sc.nextInt();
          //  Arrays.sort(a);
            System.out.println(hasSum(a,sum));
         }
	}
	
	
	///recursive function
	static boolean hasSubsetWithSum(int a[],int idx,int sum)
	{
		if(idx>=a.length  || sum<0)
			return false;
		if(a[idx]==sum) return true;
		if(dp[idx][sum])
			return true;
		boolean withme = hasSubsetWithSum(a,idx+1,sum-a[idx]);
		boolean withoutme = hasSubsetWithSum(a,idx+1,sum);
		return dp[idx][sum]=( withme||withoutme );
	}
	
	//bottom up approach
	static boolean hasSum(int a[],int sum)
	{
		boolean dp[][]=new boolean[a.length+1][sum+1];
		for(int i=0;i<dp.length;i++)
			dp[i][0]=true;
		for(int i =1;i<dp.length;i++)
			for(int j=1;j<dp[0].length;j++)
				dp[i][j]=(dp[i-1][j]||(j-a[i-1]>=0 ? dp[i-1][j-a[i-1]] : false));
		return dp[a.length][sum];
	}
}
