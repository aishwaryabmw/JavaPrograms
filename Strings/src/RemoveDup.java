import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class RemoveDup {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int tc = sc.nextInt();
		while(tc--!=0)
		{
			String s = sc.next();
		removeDup(s);
		}
	}

	private static void removeDup(String s) {
		Set<Character> set = new LinkedHashSet<>();
		int i=0;
		while(i<s.length())
		{
			set.add(s.charAt(i));
			i++;
		}
		Iterator<Character> it = set.iterator();
		while(it.hasNext())
		System.out.print(it.next());
		System.out.println();
		
	}

}
