	import java.util.Scanner;

public class HexStringsOfLengthN {

	    static void genBinaryNumbers(int n,char p[],int idx)
	    {
	   
	        if(idx==n)
	        {
	          for(int i=0;i<idx;i++)
	          System.out.print(p[i]);
	          System.out.print(" ");
	          return ;
	        }
	        for(int i=0;i<=9;i++)
	        {
	          p[idx]=(char)(i+'0');
	          genBinaryNumbers(n,p,idx+1);
	        }
	        for(int i=10;i<=15;i++)
	        {
	          p[idx]=(char) hexDigit(i);
	          genBinaryNumbers(n,p,idx+1);
	        }
	        
	    }
	    static int hexDigit(int dig)
	    {
	    	 switch(dig)
	            {
	                case 15:
	                    return 'F';
	                case 14:
	                	return 'E';
	                case 13:
	                    return 'D';
	                case 12:
	                	return 'C';
	                case 11:
	                	return 'B';
	                case 10:
	                    return 'A';
	                         
	            }
	    	 return dig;
	    }
	    public static void main(String args[])
	    {
	    	Scanner sc=new Scanner(System.in);
	    	int tc=sc.nextInt();
	    	while(tc--!=0)
	    	{
	    		int n=sc.nextInt();
	    		char p[]=new char[n];
	    			genBinaryNumbers(n,p,0);
	        System.out.println();
	    	}
	    }
	}
