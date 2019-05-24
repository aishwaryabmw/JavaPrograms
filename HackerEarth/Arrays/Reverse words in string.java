import java.util.*;
public class Test { 
    public static void main(String args[]) 
    { 
	Scanner sc=new Scanner(System.in);
        String str = sc.nextLine();
        String[] arrOfStr = str.split(" "); 
        for (int i=arrOfStr.length-1;i>=0;i--) 
            System.out.print(arrOfStr[i]+ " "); 
    } 
}