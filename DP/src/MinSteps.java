import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;
public class MinSteps {
	static int[] dp = new int[1000001];
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
	//	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int t=sc.nextInt();
         while(t--!=0){
        //	 String s="";
        	 int steps=0;
		//	s = br.readLine();
             int n=sc.nextInt();
            dp[0]=0;
            dp[1]=1;
            for(int i=2;i<dp.length;i++)
            	dp[i]=-1;
             //steps= minSteps(n);
            
            steps=minStepsBottomUp(n);
             System.out.println(steps);
			 }
	}
	static int minSteps(int n)
	{
		if(n==1)
			return 1;
		if(n==0) return 0;
		if(dp[n]!=-1)
			return dp[n];
		int choice1=0;
		if(dp[n-1]!=-1)
		{
			choice1=1+dp[n-1];
		}
		else
		 choice1 = 1+(dp[n-1]=minSteps(n-1));
		int choice2=0;
		//ArrayList<Integer> list = new ArrayList<>();
		int min=Integer.MAX_VALUE;
		int factor=(int) Math.floor(Math.sqrt(n));
		for (int i = factor; i >= 2; i--) 
        {
        	if(n%i==0)
        	{
                factor = n/i;
                if(dp[factor]!=-1)
                {
                	choice2=1+dp[factor];
                	if(min>choice2)
                    	min=choice2;
                	//continue;
                }
                else
                {
                choice2= 1+(dp[factor]=minSteps(factor));
                if(min>choice2)
                	min=choice2;
                }
                
                
                
        	}
        }
		
		return dp[n]=choice2!=0 ? Math.min(choice1, min) : choice1;
	}
	
	
	
	/////bottom up dp
	static int minStepsBottomUp(int n)
	{
		int steps[]=new int[n+1];
		//for(int i=0;i<4;i++)
			//steps[i]=i;
		for(int i=0;i<steps.length;i++)
		{
			if(i>=0 && i<=3)
			{
				steps[i]=i;
				continue;
			}
			int factor=(int) Math.floor(Math.sqrt(i));
			int min=Integer.MAX_VALUE;
			int choice2=0;
			for (int f = factor; f >= 2; f--) 
	        {
	        	if(i%f==0)
	        	{
	                factor = i/f;
	                	choice2=steps[factor];
	                	min=Math.min(min, choice2);
	        	}
	        }
			steps[i]=( choice2!=0? 1+Math.min(steps[i-1], min) :1+ steps[i-1]);
		}
		return steps[n];
	}
}
