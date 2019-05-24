import java.util.Arrays;
import java.util.Scanner;
public class SubsetsDFS {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
         while(t--!=0){
            int n = sc.nextInt();
            int a[]=new int[n];
            if(n==0) return;
            for(int i=0;i<n;i++)
            	a[i]=sc.nextInt();
            Arrays.sort(a);
            int p[] = new int[a.length];
            printArraySubsets(a,0,p,0);
            System.out.println();
         }
	}
	static void printArraySubsets(int a[],int from,int p[],int pi)
	{
		if(from>=a.length)
			return;
		for(int i=from;i<a.length;i++)
		{
			p[pi]=a[i];
			for(int j=0;j<=pi;j++)
			{
				System.out.print(p[j]+" ");
			}
			System.out.println();
			printArraySubsets(a,i+1,p,pi+1);
		}	
		
		
	}
}
