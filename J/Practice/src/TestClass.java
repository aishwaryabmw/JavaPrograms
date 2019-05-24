import java.lang.*; 
import java.util.Scanner; 
class TestClass { 
	public static void main (String[] args) 
	{ 
    	
    	Scanner sc=new Scanner(System.in); 
    	int n=sc.nextInt(); 
    	char arr[][]=new char[n][n];
    	if(n%2!=0) 
    	{
    	for(int i=0;i<n;i++)
    	{
    		if(i<n/2)
    	    for(int j=i;j<n;j=n-1-i)
    	    {
    	    arr[i][j]='*';
    	    if(j==n-1-i) break;
    	    }
    		else 
    			arr[i][n/2]='*';
    	}
    	for(int i=0;i<n;i++)
    	{
    	    for (int j=0;j<n;j++)
    	    {
    	    if(arr[i][j]=='*')
    	        System.out.print(arr[i][j]+" ");
    	    else
    	        System.out.print("  ");
    	    }
    	    
    	    System.out.println(" ");
    	    //System.out.println();
    	}
    	}
    }
}