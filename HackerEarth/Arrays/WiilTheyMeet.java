
import java.util.*;
import java.lang.*;

class WiilTheyMeet {
    public static void main (String[] args) {
	    Scanner sc= new Scanner(System.in);
	    int x1,x2,v1,v2;
	    x1=sc.nextInt();
	    v1=sc.nextInt();
	    x2=sc.nextInt();
	    v2=sc.nextInt();
		int x11=x1,x22=x2;
	    
	    if(x1<x2 && v1<10000 && v2<10000)
	    {
			for(int i=x1,j=x2;(i<10000&&j<10000);i=i+v1,j=j+v2,x11=i,
			x22=j)
			{
				if(i==j)
				{
				System.out.println("YES");
				break;
				}
				if(i>j)
				{
				//System.out.println("NO");
				break;
				}
			}		
			if(x11>=10000 || x22>=10000 || x11>x22)
				System.out.println("NO");
		}
        else
        	System.out.println("NO");
       
	}
}
