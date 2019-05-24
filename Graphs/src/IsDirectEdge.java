
import java.util.*;
public class IsDirectEdge {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
      	int tc=sc.nextInt();
      	while(tc--!=0)
        {
          int v=sc.nextInt();
          int e=sc.nextInt();
          int a[][]=new int[v+1][v+1];
          for(int edges=0;edges<e;edges++)
          {
            int v1=sc.nextInt();
            int v2=sc.nextInt();
            a[v1][v2]=1;
            a[v2][v1]=1;
          }
          int q= sc.nextInt();
          while(q--!=0)
          {
        	  int v1=sc.nextInt();
              int v2=sc.nextInt();
        	  if(isDirectEdge(a,v1,v2))
        	  	System.out.println("YES");
        	  else
        	  	System.out.println("NO");
          }
         
          System.out.println();
        }
      	
	}
	static boolean isDirectEdge(int a[][],int v1,int v2)
  	{
  		return (a[v1][v2]==1);
  	}
	
}