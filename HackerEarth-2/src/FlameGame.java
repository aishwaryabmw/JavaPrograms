import java.util.Scanner;
public class FlameGame {

	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int tc = sc.nextInt();
		while(tc--!=0)
		{
			String str1 = sc.next();
			String str2 =sc.next();
			System.out.println(flameGameSwap(new StringBuilder(str1),new StringBuilder(str2)));
		}
	}
	static String flameGameSwap(StringBuilder str1,StringBuilder str2)
	{
		
		int count=0;
		int match = -1;
		boolean charMatch=false;
		for(int i=0;i<str1.length();i++)
		{
			for(int j=0;j<str2.length();j++)
			{
				if(str1.charAt(i)==str2.charAt(j) && str1.charAt(i)!=' ' && str2.charAt(j)!=' ')
				{
							count++;
							match=i;
							charMatch = true;
							str2.replace(j, j+1, " ");
				}
			}
			if(charMatch)
			{
				count++;
				charMatch=false;
				int k=match+1;
				
				while(k<str1.length())
				{
					if(str1.charAt(match)==str1.charAt(k) && str1.charAt(k)!=' ')
					{
						count++;
					str1.replace(k,k+1," ");
					}
					k++;
				}
				str1 = str1.replace(match,match+1," ");
				match=-1;
			}
						
		}
		int swap = (str1.length() + str2.length()-count)%5;
		if(swap==1) return "LFAME";
		if(swap==2) return "FLAME";
		if(swap==3)return "FALME";
		if(swap==4) return "FMALE";
		else return "FEAML";
	}

}
