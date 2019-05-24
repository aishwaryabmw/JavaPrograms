import java .util.Scanner;
public class MarcusIEHOVA
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int tc = sc.nextInt();
		while(tc--!=0)
		{
		int m=sc.nextInt();
		int n=sc.nextInt();
		char a[][]=new char[m][n];
		for(int i=0;i<m;i++)
		{
			String s = sc.next();
			char c[] =s.toCharArray();
			for(int j=0;j<n;j++)
				a[i][j]= c[j];
		}
		
		marcusIEHOVA(a);
		System.out.println();
	}
	}
	
	static void marcusIEHOVA(char[][] a)
	{
		for(int i=a.length-1;i>=0;i--)
			for(int j=0;j<a[0].length;j++)
				if(a[i][j]=='@')
					marcusIEHOVAHelper(a,i,j,"IEHOVA#",new StringBuilder());
	}
	static void marcusIEHOVAHelper(char[][] a,int i,int j,String str,StringBuilder dir)
	{
		if(i<0 || j<0||j>=a[0].length)
			return;
		
		if(a[i][j]=='#' && str.length()==0)
		{
			System.out.print(dir+" ");
			return;
		}
		
		if(i-1>=0&&a[i-1][j]==str.charAt(0))
		{
			char c= a[i][j];
			a[i][j]='Z';
			marcusIEHOVAHelper(a,i-1,j,str.replace(str, str.substring(1, str.length())),dir.append("forth "));
				dir= dir.replace(dir.length()-6, dir.length(), "");
				a[i][j]=c;
		}
		
		if(j-1>=0&&a[i][j-1]==str.charAt(0))
		{
			char c= a[i][j];
			a[i][j]='Z';
			marcusIEHOVAHelper(a,i,j-1,str.substring(1, str.length()),dir.append("left "));
			dir= dir.replace(dir.length()-5, dir.length(), "");
			a[i][j]=c;
		}
		if(j+1<a[0].length&&a[i][j+1]==str.charAt(0))
		{
			char c= a[i][j];
			a[i][j]='Z';
			marcusIEHOVAHelper(a,i,j+1,str.substring(1, str.length()),dir.append("right "));
			dir= dir.replace(dir.length()-6, dir.length(), "");
			a[i][j]=c;
		}
		
	}
	
}
