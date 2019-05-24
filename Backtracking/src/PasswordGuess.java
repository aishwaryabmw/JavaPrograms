import java.util.Scanner;
import java.lang.Character;
public class PasswordGuess {

	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int tc = sc.nextInt();
		while(tc--!=0)
		{
		String inp = sc.next();
		passwordGuess(inp,0);
		System.out.println();
		}
	}
	
	static void passwordGuess(String inp,int idx)
	{
		if(idx>=inp.length())
		{
			System.out.print(inp + " ");
			return;
		}
		if(inp.charAt(idx) >='a' && inp.charAt(idx)<='z' || inp.charAt(idx) >='A' && inp.charAt(idx)<='Z')
			{
				inp=inp.replace(inp.charAt(idx),Character.toLowerCase(inp.charAt(idx)));
				passwordGuess(inp,idx+1);
				inp=inp.replace(inp.charAt(idx),Character.toUpperCase(inp.charAt(idx)));
				passwordGuess(inp,idx+1);
			}
		else
			passwordGuess(inp,idx+1);
	}
}
