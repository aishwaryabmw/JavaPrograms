import java.io.*;
import java.util.*;

public class MinStepsFinal {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int tc= sc.nextInt();
        while(tc--!=0)
        {
        int n =  sc.nextInt();
            int a[]=new int[n];
            for(int i=0;i<n;i++)
                a[i]=sc.nextInt();
            int count = maxProfit(a);
            System.out.println(count);
        }
    }
    
    static int maxProfit(int[] a)
    {
        int i=0,j=1;
        int diff=-1,p=0;
        int max=Integer.MIN_VALUE;
        while(j<=a.length-1)
        {
            while(i<j && j<=a.length-1 )
            {
                if(a[j]-a[i]>0)
                {
                     diff =  a[j]-a[i];
                    diff=Math.max(diff,max);
                    j++;
                }
                if(j<a.length)
                if(a[j]-a[i]<=0 && diff!=-1 )
                {
                    p = p+diff;
                    i=j;
                    j++;
                    max=Integer.MIN_VALUE;
                    diff=-1;
                }
                else if(a[j]-a[i]<=0 && diff==-1)
                {
                	i++;
                	j++;
                }
                else if(a[j]-a[i]<diff)
                {
                	i=j;
                	j=i+1;
                	
                }
            }
        }
        return p;
    }
}