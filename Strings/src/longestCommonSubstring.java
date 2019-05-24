import java.util.Scanner;

public class longestCommonSubstring {

	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		String str1=sc.next();
		System.out.println(lcsLen(str,str1));
	}

	private static int lcsLen(String s1,String s2) {
		return lcsH(s1,s2,0,0,0);
	}

	private static int  lcsH(String s1, String s2, int i, int j,int count) {
		if(i>=s1.length()||j>=s2.length())
			return 0;
		if(s1.charAt(i)==s2.charAt(j))
			 count=lcsH(s1,s2,i+1,j+1,count+1);
		 return Math.max(count,Math.max(lcsH(s1,s2,i+1,j,0), lcsH(s1,s2,i,j+1,0)));
		 //return count;
	}
	
	
}
