

import java.io.*;
import java.util.*;

public class CountSmaller {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Scanner sc= new Scanner(System.in);
        int tc= sc.nextInt();
        while(tc--!=0)
        {
            int n =  sc.nextInt();
            int a[]=new int[n];
            for(int i=0;i<n;i++)
                a[i]=sc.nextInt();
            int k = sc.nextInt();
            int count = countSmaller(a,k);
            if(k<a[0])
            	System.out.println(0);
            else if(k>a[a.length-1])
            	System.out.println(a.length);
            else
            System.out.println(count+1);
        }
    }
    
    public static int countSmaller(int[] a,int k)
    {
        int i=0;
        int j=a.length-1;
        int mid=a.length/2;
        while(i<=j && mid>=0&&mid<=a.length-1)
        {
            if(k==a[mid])
                return mid-1;
        else if(k>a[mid])
        {
            mid=mid+1;
        }
        else
        {
        	mid=mid-1;
            return mid;
        }
        }
        return mid;
    }
}