import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;
public class DistinctCharacters
 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while(t--!=0){
        	String str=sc.next();
            Set<Character> set=new LinkedHashSet<Character>();
            for(int i=0;i<str.length();i++)
               set.add(str.charAt(i));
            for(char i:set)
            	System.out.print(i);
            System.out.println();
        }
       
	}
}