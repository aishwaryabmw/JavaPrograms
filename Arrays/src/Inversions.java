import java.util.Scanner;

public class Inversions {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int tc = sc.nextInt();
		while(tc--!=0)
		{
			int n = sc.nextInt();
			int a[]=new int[n];
			for(int i=0;i<n;i++)
				a[i]=sc.nextInt();
			System.out.println(inversion(a));
		}
	}

	private static int inversion(int[] a) {
		int count=0;
		for(int i=0;i<a.length-1;i++)
			for(int j=i+1;j<a.length;j++)
				if(a[i]>a[j])
					++count;
		return count;
	}
}
