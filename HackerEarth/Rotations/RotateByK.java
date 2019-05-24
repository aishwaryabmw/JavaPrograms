
import java.util.*;
import java.lang.*;
import java.io.*;

class RotateByK {
    public static void rotateArray(int a[],int k)
    {
        reverseArray(a,0,a.length-1);
        reverseArray(a,0,k-1);
        reverseArray(a,k,a.length-1);
    }
    public static void reverseArray(int a[],int s,int e)
    {
        for(int i=s,j=e;i<j;i++,j--)
        {
                int temp=a[i];
                a[i]=a[j];
                a[j]=temp;
        }
    }
	
	public static void printArray(int a[])
	{
		for(int i=0;i<a.length;i++)
		        System.out.print(a[i]+" ");
		System.out.println();
	}
	
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int tc = sc.nextInt();
		int size;
		while (tc>0)
		{
		    size = sc.nextInt();
		    int a[]=new int[size];
		    for(int i=0;i<size;i++)
		        a[i]=sc.nextInt();
		    int d = sc.nextInt();
		    printArray(a);
		    rotateArray(a,d%size);
			
		    printArray(a);
//		    System.out.println();
    	    tc--; 
		}
	}
}
