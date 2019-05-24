import java.util.Arrays;
import java.util.Scanner;
public class HasSubsetSumFinal {
	static boolean dp[][]=new boolean[5500][25000];
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        
         while(t--!=0){
            int n = sc.nextInt();
            int a[]=new int[n];
            if(n==0) return;
            for(int i=0;i<n;i++)
            	a[i]=sc.nextInt();
            int sum = sc.nextInt();
          //  Arrays.sort(a);
            System.out.println(hasSubsetWithSum(a,sum));
         }
	}
	/*static boolean hasSubsetWithSum(int a[],int idx,int sum)
	{
		if(idx>=a.length  || sum<0)
			return false;
		if(a[idx]==sum) return true;
		
		return hasSubsetWithSum(a,idx+1,sum-a[idx])||hasSubsetWithSum(a,idx+1,sum) ;
	}*/
	
	static boolean hasSubsetWithSum(int arr[], int S) {
	    dp = new boolean[2000][5000];
	  for(int i=0;i<dp.length;i++)
	    Arrays.fill(dp[i],false);
	  return hasSubsetWithSumHelper(arr,0,S);
	}

	 static boolean hasSubsetWithSumHelper(int a[],int idx,int sum)
		{
			if(idx>=a.length || sum<0)
				return false;
	   if(sum==0) return true;
			if(a[idx]==sum) return true;
			if(dp[idx][sum])
				return true;
			boolean withme = hasSubsetWithSumHelper(a,idx+1,sum-a[idx]);
			boolean withoutme = hasSubsetWithSumHelper(a,idx+1,sum);
			return dp[idx][sum]=( withme||withoutme );
		}
}
