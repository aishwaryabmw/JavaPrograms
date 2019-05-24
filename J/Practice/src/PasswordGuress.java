import java.util.Scanner;

public class PasswordGuress {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
      	int tc=sc.nextInt();
      	while(tc--!=0)
        {
      		String str=sc.next();
          char c[]= (str).toCharArray();
          for(int i=c.length-1;i>=0;i--)
          {
        	  if(c[i]>='a' && c[i]<='z')
        	  {
        		  for(int k=0;k<str.length();k++)
        		  {
        			  if(k==i)
        			  {
        				  String s = (str.charAt(i)+"").toUpperCase();
        				  System.out.print(s);
        			  }
        			  else
        				  System.out.print(str.charAt(k));
        		  }
        		  System.out.print(" ");
        		  
        	  }
        	  else if(c[i]>='A' && c[i]<='Z')
        	  {
        		  for(int k=0;k<str.length();k++)
        		  {
        			  if(k==i)
        			  {
        				  String s = (str.charAt(i)+"").toLowerCase();
        				  System.out.print(s);
        			  }
        			  else
        				  System.out.print(str.charAt(k));
        		  }
        		  System.out.print(" ");
        	  }
        	  else
        	  {
        		  System.out.print(str+" ");
        	  }
          }
        }
	}
}
