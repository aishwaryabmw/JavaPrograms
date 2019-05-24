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
    	        
    	        if(i<j)
        	    arr[i][j]=0;
        	    System.out.print(arr[i][j]+" ");
    	    }
    	    System.out.println();
    	}
    }
}