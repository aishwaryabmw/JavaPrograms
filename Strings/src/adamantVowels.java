
import java.util.*;
class adamantVowels {
    public static void main(String args[] ) throws Exception {
       Scanner sc  = new Scanner(System.in);
       StringBuilder s = new StringBuilder(sc.next());
       StringBuilder s1= new StringBuilder(s);
       s.reverse();
       int c=0;
       for(int i=0;i<s.length();i++)
       {
    	   if(s.charAt(i)=='a' || s.charAt(i)=='e'  ||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u')
    	   {
    		   if(s.charAt(i)==s1.charAt(i))
    			   c++;
    	   }
       }
       System.out.println(c);
    }
}

