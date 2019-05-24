import java.util.Scanner; 
class RotateBy90 { 
	public static void main (String[] args) 
	{ 
    	Scanner sc=new Scanner(System.in); 
    	int m=sc.nextInt(); 
    	int arr[][]=new int[m][m];
    	for(int i=0;i<m;i++)
    	    for(int j=0;j<m;j++)
    	        arr[i][j]=sc.nextInt();
    	for(int i=0;i<m/2;i++)
    	{
    	    for(int j=0;j<m/2;j++)
    	    {
    	    	int temp=arr[i][j];
    	    	arr[i][j]=arr[m/2-i][m/2-j];
    	        arr[m/2-i][m/2-j]=temp;
    	    }
    	}
    	for(int i=0;i<m;i++)
    	{
    	    for(int j=0;j<m;j++)
    	    System.out.print(arr[i][j]+" ");
    	    System.out.println();
    	}
	}
}