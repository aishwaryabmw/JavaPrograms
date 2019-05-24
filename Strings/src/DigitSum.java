import java.io.*;
import java.util.*;

public class DigitSum {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int a=sc.nextInt();
        System.out.println(superNum(s,a));
    }
    public static int superNum(String str,int r)
    {
        int s=0;
        char c[] = str.toCharArray();
        for(int i=0;i<c.length;i++)
        {
            s+=c[i]-48;
        }
        int digSum=0;
        while(s>0)
        {
            digSum += s%10;
            s=s/10;
        }
         s=digSum*r;
         digSum=0;
        while(s>0)
        {
            digSum += s%10;
            s=s/10;
        }
        return digSum;
    }
}