import java.io.*;
import java.util.*;

public class HappyYear {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
            
            Scanner sc  = new Scanner(System.in);
            int t = sc.nextInt();
            
            while(t-->0) {
            	int y = sc.nextInt();
	            int y1=y,oldy=y;
	            int newy;
	            int a[]=new int[4];
	            int size=3;
	            while(y>0)
	            {
	            	a[size]=y%10;
	            	y=y/10;
	            	size--;
	            }
	            y=oldy;
	            Arrays.sort(a);
	            int b[]=new int[4];
            	while(true)
            	{
            	y1++;
            	newy=y1;
            	size=3;
            	while(newy>0)
                {
                	b[size]=oldy%10;
                	oldy=oldy/10;
                	size--;
                }
            	Arrays.sort(b);
            	boolean f=false;
	            for(int i=0;i<3;i++) {
	            	if(b[i]==b[i+1])
	            	{
	            		f=true;
	                    break;
	            	}
	            }
	            if(!f)
	            	{
	            	System.out.println(newy); 
	            	break;}
	            	}
	            oldy=y;
            	}
            }
                    
    }
