import java.util.Scanner; 
class RotateClockwise { 
	public static void main (String[] args) 
	{ 
    	Scanner sc=new Scanner(System.in); 
    	int tc=sc.nextInt(); 
    	while(tc!=0)
    	{
    	int m=sc.nextInt();
    	int n=sc.nextInt();
		int arr[][]=new int[m][n];
		for(int i=0;i<m;i++)
		    for(int j=0;j<n;j++)
		        arr[i][j]=sc.nextInt();
		rotateClockwise(arr);
		System.out.println();
		tc--;
    	}
	}
	public static void rotateClockwise(int[][] a)
	{
			for(int i=0;i<a.length;i++)
			{
			    for(int j=i+1;j<a[0].length;j++)
			    {
			    	int temp=a[i][j];
			    	a[i][j]=a[j][i];
			    	a[j][i]=temp;
			    }
			}
		for(int i=0;i<a.length;i++)
		{
		    for(int j=0;j<a[0].length/2;j++)
		    {
		    	int temp=a[i][j];
		    	a[i][j]=a[i][a.length-1-j];
		    	a[i][a.length-1-j]=temp;
		    }
		}
		
		for(int i=0;i<a.length;i++)
		{
		    for(int j=0;j<a[0].length;j++)
		    	System.out.print(a[i][j]+" ");
		    System.out.println();
		}
	
	}
	
	}