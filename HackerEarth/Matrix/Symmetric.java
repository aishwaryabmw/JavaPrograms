import java.lang.*; 
import java.util.Scanner; 
class Symmetric { 
	public static void main (String[] args) 
	{ 
    	Scanner sc=new Scanner(System.in); 
    	int n=sc.nextInt(); 
    	int arr[][]=new int[n][n];
    	boolean symmetric=false;
    	for(int i=0;i<n;i++)
    	    for(int j=0;j<n;j++)
    	        arr[i][j]=sc.nextInt(); 
    	for(int i=0;i<n;i++)
    	{
    	    for (int j=0;j<n;j++)
    	    {
        	    if(arr[i][j]==arr[j][i])
        	    {
        	        symmetric=true;
        	        continue;
        	    }
        	    else
        	    {
        	        symmetric = false;
        	        break;
        	    }
    	    }
  	    
    	}
    	System.out.println(symmetric);
    	
    }
}