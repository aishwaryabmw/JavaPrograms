import java.lang.*; 
import java.util.Scanner; 
class MagicSquare { 
	public static void main (String[] args) 
	{ 
    	Scanner sc=new Scanner(System.in); 
    	int n=sc.nextInt(); 
    	int arr[][]=new int[n][n];
    	for(int i=0;i<n;i++)
    	    for(int j=0;j<n;j++)
    	        arr[i][j]=sc.nextInt(); 
	    int magic=n*(n*n +1)/2;
	    int sum=0;
	    boolean magicSquare=false;
	    for(int i=0;i<n;i++)
	    {
    	    for(int j=0;j<n;j++)
    	    {
    	        sum+=(2*arr[i][j]);
    	        if(i+j==n-1 || i==j)
    	        sum+=arr[i][j];
     	    }
	    } 
	    if(n%2!=0)
	    sum+=arr[n/2][n/2];
    
	    if(sum==(2*n +2)*magic)
    	    magicSquare=true;
    	else
    	    magicSquare=false;
	    System.out.print(magicSquare);
    	
    }
}