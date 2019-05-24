import java.io.*;
import java.util.*;

public class PrintSumDigits {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        
        while(tc--!=0)
        {
        	String s = sc.next();
            System.out.println(printSumDigits(s));
        }
    }
    public static int printSumDigits(String s)
    {
        int sum=0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)>=48 && s.charAt(i)<=57)
                sum+=(s.charAt(i)-48);
        }
        return sum;
    }
   
}