import java.lang.*; 
import java.util.Scanner; 
class CornerSum { 
	public static void main (String[] args) 
	{ 
    	Scanner sc=new Scanner(System.in); 
    	int m=sc.nextInt(); 
    	int n=sc.nextInt(); 
    	int arr[][]=new int[m][n];
    	for(int i=0;i<m;i++)
    	    for(int j=0;j<n;j++)
    	        arr[i][j]=sc.nextInt(); 
	    System.out.print(arr[0][0]+" "+arr[m-1][0]+" "+arr[0][n-1]+" "+arr[m-1][n-1]);
	    System.out.println();
	    System.out.print(arr[0][0]+arr[m-1][0]+arr[0][n-1]+arr[m-1][n-1]);
    	
    }
}