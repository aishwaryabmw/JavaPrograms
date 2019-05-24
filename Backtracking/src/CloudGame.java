import java.io.*;
import java.util.*;

public class CloudGame {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        System.out.println(minJumps(a));
    }
    public static int minJumps(int a[])
    {
    	int count=0,i=0;
        
        while(true)
        {
        	if(i+2 < a.length && a[i+2]==0)
        		i=i+2;
        	else if(i+1<a.length && a[i+1]==0)
        		i++;
        	else
        		break;
        	count++;
        }
        return count;
       
    }
}