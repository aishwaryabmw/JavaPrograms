
import java.util.*;
import java.lang.*;

class RectangleOverlap {
    public static void main (String[] args) {
	    Scanner sc= new Scanner(System.in);
	    int r1x1,r1x2,r1y1,r1y2,r2x1,r2x2,r2y1,r2y2;
	    r1x1=sc.nextInt();
	    r1y1=sc.nextInt();
	    r1x2=sc.nextInt();
	    r1y2=sc.nextInt();
	    r2x1=sc.nextInt();
	    r2y1=sc.nextInt();
	    r2x2=sc.nextInt();
	    r2y2=sc.nextInt();
        
        if(( (r2x1>r1x2 && r2x1<r1x1) &&  (r2y1>r1y2 && r2y1<r1y1) || 
            (r2x2>r1x2 && r2x2<r1x1) &&  (r2y2>r1y2 && r2y2<r1y1) ) ||( (r1x1>r2x1 && r1x1<r2x2) &&  (r1y1>r2y1 && r1y1<r2y2) || 
            (r1x2>r2x1 && r1x2<r2x2) &&  (r1y2>r2y1 && r1y2<r2y2) ))
            System.out.println("true");
            
        else
        System.out.println("false");
       
       
	}
}