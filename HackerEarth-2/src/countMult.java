import java.io.*;
import java.util.*;

public class countMult {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Scanner sc= new Scanner(System.in);
        int tc= sc.nextInt();
        while(tc--!=0)
        {
            long n =  sc.nextLong();
                     
            
            long count = countM(n);
            
            System.out.println(count);
        }
    }
    
    public static int countM(long n)
    {
        int c=0;
        for(int i=3;i<=n;i++)
        {
            if(i%3 ==0)
               ++c;
             if(i%5==0)
            	++c;
            if(i%11==0)
            		 ++c;
            if(i%3==0&& i%5==0)
            	--c;
            if(i%5==0&&i%11==0)
            	--c;
        }
        return c;
    }
}