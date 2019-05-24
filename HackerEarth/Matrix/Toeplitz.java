
import java.util.Scanner; 
class Toeplitz {
	
	public static boolean checkToeplitz(int arr[][],int m,int n)
	{
		int i=0;   
		int num;
		
    	for(int c=0;c<n;c++)
    	{
			int r=i;
			int t=c;
			num = arr[r][t];
    	    while(r<m-1 && t<n-1)
    	    {
    	        if(arr[r+1][t+1]!=num)
    	        	return false;
    	        r++;
    	        t++;
    	    }
    	}
    	i=0;   
    	for(int r=0;r<m;r++)
    	{
			int c=i;
			int t=r;
			num = arr[t][c];
    	    while(c<n-1 && t<m-1)
    	    {
    	        if(arr[t+1][c+1]!=num)
    	        	return false;
    	        c++;
    	        t++;
    	    }
    	    
    	}
    	return true;
	}

	public static void main (String[] args) 
	{ 
    	Scanner sc=new Scanner(System.in); 
    	int m=sc.nextInt(); 
		int n=sc.nextInt();
    	int arr[][]=new int[m][n];
    	for(int i=0;i<m;i++)
    	    for(int j=0;j<n;j++)
    	        arr[i][j]=sc.nextInt();
    	System.out.println(checkToeplitz(arr,m, n));
	}
	
}