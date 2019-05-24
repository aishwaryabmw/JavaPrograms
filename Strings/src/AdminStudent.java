



	import java.io.*;
	import java.util.*;

	public class AdminStudent {

	    public static void main(String[] args) {
	        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
	            
	            Scanner sc  = new Scanner(System.in);
	            String s1  = sc.next();
	            int z=0,e=0,r=0,o=0;
	           // HashMap<Character,Integer> h = new HashMap<>();
	            for(int i=0;i<s1.length();i++)
	            {
	            	if(s1.charAt(i)=='Z')
	            		z++;
	            	else if(s1.charAt(i)=='E')
	            		e++;
	            	else if(s1.charAt(i)=='R')
	            		r++;
	            	else if(s1.charAt(i)=='O')
	            		o++;
	            }
	            
	            if(z>=2 && e>=2 && r>=2 && o>=2 && (s1.contains("ZERO") || s1.contains("OREZ")))
	            	System.out.println("ADMIN");
	            else
	            	System.out.println("STUDENT");
	            
	    }
	}