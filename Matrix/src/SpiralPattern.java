import java.util.Scanner; 
class SpiralPattern { 
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
		{
		    for(int j=0;j<n;j++)
		        arr[i][j]=sc.nextInt();
		}
		printSpiral(arr);
		System.out.println();
		tc--;
    	}
		
	}
	public static void printSpiral(int[][] a)
	{
		int rows=a.length;
		int cols=a[0].length;
		int firstRow=0,lastRow=rows-1,firstCol=0,lastCol=cols-1;
		int size=rows*cols;
		
		while(size>0)
	    {
			for(int i=firstCol;i<=lastCol;i++)
			{
				if(size==1)
					System.out.print(a[firstRow][i]);
				else
				System.out.print(a[firstRow][i]+", ");
				size--;
			}
			if(size==0) break;
			firstRow++;
			if(lastCol>firstCol)
			{
				for(int i=firstRow;i<=lastRow;i++)
				{
					if(size==1)
						System.out.print(a[i][lastCol]);
					else
					System.out.print(a[i][lastCol]+", ");
					size--;
				}
				if(size==0) break;
				lastCol--;
			}
			
			for(int i=lastCol;i>=firstCol;i--)
			{
				if(size==1)
					System.out.print(a[lastRow][i]);
				else
				System.out.print(a[lastRow][i]+", ");
				size--;
			}
			if(size==0) break;
			lastRow--;
			if(lastCol>firstCol)
			{
			for(int i=lastRow;i>=firstRow;i--)
			{
				if(size==1)
					System.out.print(a[i][firstCol]);
				else
				System.out.print(a[i][firstCol]+", ");
				size--;
			}
			firstCol++;
			}
	    }
		
	}
	
	}