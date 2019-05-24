import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BFS 
{
	public static void main(String[] args)
	{
   	  Scanner sc = new Scanner(System.in);
      	int t = sc.nextInt();
      	while(t--!=0){
          int nv = sc.nextInt();
          int ne = sc.nextInt();
          HashMap<Integer, ArrayList<Integer> > g = new HashMap<>();
          
          for(int i=0;i<nv;i++)
            g.put(i, new ArrayList<Integer>());
          
          for(int i=0;i<ne;i++)
          {
          	int u, v;
            u = sc.nextInt();
            v = sc.nextInt();
            g.get(u).add(v);
            g.get(v).add(u);
          }
          //int countVisited=0;
           //int a[]=new int[g.size()];
           int s=sc.nextInt();
          bfs(g,s);
          System.out.println();
        }
	}
	static void bfs(HashMap<Integer, ArrayList<Integer> > g, int s){
		Queue<Integer> q = new LinkedList<>();
	  int a[]=new int[g.size()];
	  q.add(s);
	  while(!q.isEmpty())
	  {
	    int front=q.peek();
	    if(a[front]==0)
	         {
	        	a[front]=-1;
	           System.out.print(front+" ");
	           for(int i=0;i<g.get(front).size();i++)
	           {
	             q.add(g.get(front).get(i));
	           }
	           q.remove();
	         }
	    else
	         {
	         q.remove();
	         }
	  }
	}
}