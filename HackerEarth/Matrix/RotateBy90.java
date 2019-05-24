import java.lang.*; 
import java.util.Scanner; 
class Rotate { 
	public static void main (String[] args) 
	{ 
    	Scanner sc=new Scanner(System.in); 
    	int m=sc.nextInt(); 
    	int arr[][]=new int[m][m];
    	for(int i=0;i<m;i++)
    	    for(int j=0;j<m;j++)
    	        arr[i][j]=sc.nextInt();
    	int b[][]=new int[m][m];
    	
    	for(int i=0;i<m;i++)
    	{
    	    for(int j=0;j<m;j++)
    	    {
    	        b[j][i]=arr[m-1-i][j];
    	    }
    	}
    	for(int i=0;i<m;i++)
    	{
    	    for(int j=0;j<m;j++)
    	    System.out.print(b[i][j]+" ");
    	    System.out.println();
    	}
	}
}