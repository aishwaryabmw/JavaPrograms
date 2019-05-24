
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
	    int d1,d2;
		double t=((double)x2-x1)/(v1-v2);
		
	//	System.out.println(t+"=t");
		int digit=(int)(t*10);
		digit=digit%10;
		//System.out.println("digit="+digit);
		if(digit==0)
		{
		int time=(int)(t);
		d1= x1+(v1)*time;
		d2= x2+(v2)*time;
		if (d1==d2) System.out.println("YES");
		}
        else System.out.println("NO");
	}
}
