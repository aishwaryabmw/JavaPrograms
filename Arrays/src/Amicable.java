import java.io.*;
import java.util.*;

public class Amicable {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
            
            Scanner sc  = new Scanner(System.in);
            int a = sc.nextInt();
            int b = sc.nextInt();
            int sa = 1,sb=1;
            for(int i = 2;i<Math.sqrt(a);i++)
            {
                    if(a%i==0)
                            sa+=(i+a/i);
            }
            
            for(int i = 2;i<Math.sqrt(b);i++)
            {
                    if(b%i==0)
                            sb+=(i+b/i);
            }
            if(sa==b && sb==a)
                    System.out.println("YES");
            else
                    System.out.println("NO");
                    
            
    }
}