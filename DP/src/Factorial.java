import java.util.Scanner;

public class Factorial {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int tc = sc.nextInt();
		while(tc--!=0)
		{
			int s = sc.nextInt();
			System.out.println(fact(s));
		}
	}

	private static int fact(int s) {
		int[] a=new int[100001];
		a[0]=1;
		a[1]=1;
		for(int i=2;i<a.length;i++)
			a[i]=i*a[i-1];
		return a[s];
	}
	
	
}
