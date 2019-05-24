import java.io.*;
import java.util.*;

public class IsRotation {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while(tc--!=0)
        {
            String s1= sc.next();
            String s2 = sc.next();
            System.out.println(isRotation(s1,s2));
        }
    }
    
    static String isRotation(String s1,String s2)
    {
        s2=s2+s2;
        if(s2.contains(s1))
            return "TRUE";
        else return "FALSE";
    }
}