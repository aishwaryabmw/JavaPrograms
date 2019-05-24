import java.util.*;
public class DecimalToBinary {
    public static String decToBin(int n)
    {
        if(n==0) 
            return "";
        return decToBin(n/2)+n%2 ;
    }
	public static void main (String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int tc=sc.nextInt();
	    int n;
	    while(tc>0)
	    {
	        n=sc.nextInt();
	        if(n>0)
	        {
	        	String decNum = decToBin(n);
	        	System.out.println(decNum);
	        }
	        else
	        System.out.println(0);
	        tc--;
	    }
	}
}