import java.util.*;
import java.lang.*;

class Test {
    public static void main (String[] args) {
	    Scanner sc= new Scanner(System.in);
	    int r1[]=new int[4];
	    int r2[]=new int[4];
	    for(int i=0;i<4;i++)
	        r1[i]=sc.nextInt();
	   for(int i=0;i<4;i++)
	        r2[i]=sc.nextInt();
	    
        
        if(( (r2[0]>r1[2] && r2[0]<r1[0]) &&  (r2[1]>r1[3] && r2[1]<r1[1]) || 
            (r2[2]>r1[2] && r2[2]<r1[0]) &&  (r2[3]>r1[3] && r2[3]<r1[1]) ) ||
            ( (r1[0]>r2[0] && r1[0]<r2[2]) &&  (r1[1]>r2[1] && r1[1]<r2[3]) || 
            (r1[2]>r2[0] && r1[2]<r2[2]) &&  (r1[3]>r2[1] && r1[3]<r2[3]) ))
            System.out.println("true");
            
        else
        System.out.println("false");
       
       
	}
}