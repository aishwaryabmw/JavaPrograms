import java.lang.*; 
import java.util.Scanner; 
class Spiral { 
	public static void main (String[] args) 
	{ 
    	Scanner sc=new Scanner(System.in); 
    	int m=sc.nextInt(); 
    	
		m=m*2-1;
		int arr[][]=new int[m][m];
		int size=m;
		//int row= size/2 ;
		//int column= size/2;
		arr[size/2][size/2]=1;
		for(int n=2,row= size/2-1,column= size/2-1;n<m&&row>=0&&column>=0;
				n++,row=row -1,column=column -1)
		{
			//setNumberSpiral(arr,size/2,size/2,n);
			for(int i=row;i<row+2*n-1;i++)
    	    for(int j=column;j<column+2*n-1;j++)
				if(arr[i][j]==0)
    	        arr[i][j]=n;
			//row=size/2 -1;
			//column=size/2 -1;
		}
		//System.out.println(m);
		for(int i=0;i<m;i++)
		{
		    for(int j=0;j<m;j++)
		        System.out.print(arr[i][j]+" ");
		    System.out.println();
		}
		
		
    	
	}
	
	/*public static void setNumberSpiral(int arr[][],int row,int column,int num)
	{
		for(int i=row;i<=column;i++)
    	    for(int j=row;j<=column;j++)
				if(arr[i][j]!="")
    	        arr[i][j]=num;
	}*/
}