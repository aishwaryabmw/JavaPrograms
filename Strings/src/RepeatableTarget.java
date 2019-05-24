import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
public class RepeatableTarget {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int tc = sc.nextInt();
		while(tc--!=0)
		{
			char[] s1 = sc.next().toCharArray();
			char[] s2 = sc.next().toCharArray();
			System.out.println(minimumConcat(s1,s2));
		}
	}
	private static int minimumConcat(char[] s1,char[] s2) {
		if(s1.length>s2.length)
			return -1;
		Set<Character> r = new HashSet<>();
		Set<Character> t = new HashSet<>();
		for(int i=0;i<s1.length;i++)
			r.add(s1[i]);
		for(int i=0;i<s2.length;i++)
			t.add(s2[i]);
		if(r.size()!=t.size()) return -1;
		for(int i=0;i<s1.length;i++)
		{
			if(s1[i]!=s2[i])
				return -1;
		}
			return (s2.length/s1.length)-1;
	}

}
