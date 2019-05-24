import java.io.*;
import java.text.DecimalFormat;
import java.util.*;


public class SumDistinct {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.000"); 
        int tc = sc.nextInt();
        double d=0;
        while(tc--!=0)
        {
            int n = sc.nextInt();
            Set<Integer> set=new HashSet<Integer>();
            int count = 0;
            for(int i=0;i<n;i++)
            {
                int num = sc.nextInt();
                if(set.add(num))
                {
                    d+=num;
                    count++;
                }
            }
            System.out.printf("%.3f",d/(long)count);
            d=0;
            System.out.println();
        }
    }
}