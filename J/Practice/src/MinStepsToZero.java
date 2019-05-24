import java.util.Scanner;

public class MinStepsToZero {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
         while(t--!=0){
            int n  = sc.nextInt();
            int dp[] = new int[n]; 
            int steps= minSteps(n);
            System.out.println(steps);
         }
	}
	static int minSteps(int n)
	{
		if(n==1)
			return 1;
		if(n%2==0)
		{
			return 1 + minSteps(n/2);
		}
		else 
			return 1 + minSteps(--n);
			
	}
}
