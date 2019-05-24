import java.util.Scanner;

public class GanerateValidParenthesis {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int tc = sc.nextInt();
		while(tc--!=0)
		{
		int n=sc.nextInt();
		validParenthesis(n,n,"");
		System.out.println();
		}
	}
	static void validParenthesis(int open,int close,String str)
	{
		
		if(open==0 && close == 0)
		{
			System.out.print(str+" ");
			return;
		}
		
		if(open<=close)
		{
		if(open>0)
			validParenthesis(open-1,close,str+"{");
		if(close>0)
			validParenthesis(open,close-1,str+"}");
		}
	}
}
