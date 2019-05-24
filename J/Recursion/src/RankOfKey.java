import java.util.Arrays;
import java.util.Scanner;
public class RankOfKey {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            long a[]=new long[n];
            if(n==0) return;
            for(int i=0;i<n;i++)
            	a[i]=sc.nextLong();
            int m=sc.nextInt();
            if(m==0)return;
            long search[]=new long[m];
            Arrays.sort(a);
            for(int i=0;i<m;i++)
            {
            	search[i]=sc.nextInt();
	            int key=binSearch(a,0,a.length-1,search[i]);
	            System.out.println(key);
            }
}
	static int binSearch(long[] a,int low,int high,long k)
 	{
		int mid=(low+high)/2;
 		if(low<0 || high==a.length|| mid == a.length || mid<0 || high<0|| low==a.length) 
 			return -1;
 		if(a[(int) mid]==k) 
 			return mid+1;
 		else if(a[(int) mid]>k)
 			return binSearch(a,low,mid-1,k);
 		else
 			return binSearch(a,mid+1,high,k);
 	}
}
	
