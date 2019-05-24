import java.util.Arrays;
import java.util.Scanner;
public class HasSubSetSumDFS {
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
            Arrays.sort(a);
            int p[] = new int[a.length];
            System.out.println(printArraySubsets(a,0,p,0,sum));
         }
	}
	static boolean printArraySubsets(int a[],int from,int p[],int pi,int sum)
	{
		if(from>=a.length)
			return false;
		for(int i=from;i<a.length;i++)
		{
			p[pi]=a[i];
			int s=0;
			for(int j=0;j<=pi;j++)
			{
				s+=p[j];
				if(s==sum)
					return true;
			}
			printArraySubsets(a,i+1,p,pi+1,sum);
		}
		return false;
	}
}
