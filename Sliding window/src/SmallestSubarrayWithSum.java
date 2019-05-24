import java.util.Scanner;

public class SmallestSubarrayWithSum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        
         while(t--!=0){
            int n = sc.nextInt();
            int a[]=new int[n];
            if(n==0) return;
            for(int i=0;i<n;i++)
            	a[i]=sc.nextInt();
            int count = sc.nextInt();
            while(count--!=0)
            {
            int sum = sc.nextInt();
            int w_size = smallestWindow(a,sum);
            System.out.print(w_size+" ");
            }
            System.out.println();
         }
	}
	public static int smallestWindow(int a[],int sum)
	{
		if(sum==0) return 1;
		int min = Integer.MAX_VALUE,diff;
		int si = 0,ei=0,win_sum=0;
		while(ei<a.length)
		{
			while(win_sum<sum&& ei<a.length)
			{
				win_sum+=a[ei];
				ei++;
			}
			while(win_sum>=sum && si<a.length)
			{
				diff=ei-si;
				if(diff<min) min=diff;
				win_sum-=a[si];
				si++;
			}
		}
		
		return min==Integer.MAX_VALUE ? -1:min;
	}
}
