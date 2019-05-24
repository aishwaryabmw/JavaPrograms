import java.lang.*; 
import java.util.Scanner; 
class FlippingAnImage { 
	public static void main (String[] args) 
	{ 
    	Scanner sc=new Scanner(System.in); 
    	int n=sc.nextInt(); 
    	int m=sc.nextInt();
    	int arr[][]=new int[n][n];
    	for(int i=0;i<n;i++)
    	    for(int j=0;j<m;j++)
    	        arr[i][j]=sc.nextInt(); 
	    
	    int sum=0;
	    boolean magicSquare=false;
	    for(int i=0;i<n;i++)
	    {
    	    for(int j=0;j<m/2;j++)
    	    {
    	        
    	        int temp=arr[i][j];
    	        arr[i][j]=arr[i][m-1-j];
    	      
    	        arr[i][m-1-j]=temp;
    	        
    	    }
    	   
	    }  
	    
	     for(int i=0;i<n;i++)
	    {
    	    for(int j=0;j<m;j++)
    	    {
    	        if(arr[i][j]==0)
    	         arr[i][j]=1;
    	         else arr[i][j]=0;
    	        
    	        System.out.print(arr[i][j]+" ");
    	    }
    	     System.out.println();
	    }
	    
    }
}