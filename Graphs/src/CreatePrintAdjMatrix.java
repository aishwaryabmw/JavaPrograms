
import java.util.*;
public class CreatePrintAdjMatrix {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
      	int tc=sc.nextInt();
      	while(tc--!=0)
        {
          int v=sc.nextInt();
          int e=sc.nextInt();
          int a[][]=new int[v][v];
          for(int edges=0;edges<e;edges++)
          {
            int v1=sc.nextInt();
            int v2=sc.nextInt();
            a[v1][v2]=1;
            a[v2][v1]=1;
          }
          printMatrix(a,v);
          System.out.println();
        }
	}
	
	static void printMatrix(int a[][],int v)
	{
		for(int i=0;i<v;i++)
        {
      	  System.out.print(i+" : ");
            for(int j=0;j<v;j++)
            {
              if(a[i][j]!=0)
              	System.out.print(j+" ");
            }
            System.out.println();
        }
	}
}