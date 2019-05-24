import java.util.Scanner;

public class DiagDiff {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[][]=new int[n][n];
		
		for(int i=0;i<n;i++)
			for(int j=0;j<n;j++)
				a[i][j]=sc.nextInt();
		System.out.println(printDiff(a));
	}

	private static int printDiff(int[][] a) {
		int sum1=0,sum2=0;
		for(int i=0;i<a.length;i++)
			for(int j=0;j<a.length;j++)
			{
				if(i==j)
				sum1+=a[i][j];
				if(i+j==a.length-1)
					sum2+=a[i][j];
			}
		return sum1-sum2;
	}
}
