import java.util.Scanner;

public class PalinPartition {

	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		System.out.println(isPalin(str,0,str.length()-1));
	}

	private static boolean isPalin(String str,int s,int e) {
		if(s>=e)
			return true;
		while(s<e)
		{
			if(str.charAt(s)!=str.charAt(e))
				return false;
			else
			{
				s++;
				e--;
			}
		}
		return true;
	}
	
	

}
