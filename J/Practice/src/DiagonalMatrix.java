
import java.util.Scanner; 
class DiagonalMatrix {

	public static void printDiagonal(int arr[][],int m,int n)
	{
		
		for(int i=0;i<m;i++)
		{
			for(int row=i, j=0;row>=0;row--,j++)
				System.out.print(arr[row][j]+" ");
			System.out.println();
		}
		for(int j=1;j<n;j++)
		{
			for(int col=j,i=m-1;col<n;col++,i--)
				System.out.print(arr[i][col]+" ");
			System.out.println();
		}
	}
	public static void main (String[] args) 
	{ 
    	Scanner sc=new Scanner(System.in);
    	int tc=sc.nextInt();
    	while(tc>0)
    	{
	    	int m=sc.nextInt(); 
			int n=sc.nextInt();
	    	int arr[][]=new int[m][n];
	    	for(int i=0;i<m;i++)
	    	    for(int j=0;j<n;j++)
	    	        arr[i][j]=sc.nextInt();
	    	printDiagonal(arr,m, n);
	    	System.out.println();
    		tc--;
    	}
	}
	
}