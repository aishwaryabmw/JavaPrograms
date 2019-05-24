import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class PathExists 
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
            //g.get(v).add(u);
          }
          int count=sc.nextInt();
          
          while(count--!=0)
          {
        	  int sv=sc.nextInt();
              int ev=sc.nextInt();
              System.out.print(bfs(g,sv,ev)+" ");
          }
          System.out.println();
        }
	}
	static boolean bfs(HashMap<Integer, ArrayList<Integer> > g, int sv,int ev){
		Queue<Integer> q = new LinkedList<>();
	  int a[]=new int[g.size()];
	  q.add(sv);
	  while(!q.isEmpty())
	  {
	    int front=q.peek();
	    if(a[front]==0)
	         {
	        	a[front]=-1;
	           //System.out.print(front+" ");
	           for(int i=0;i<g.get(front).size();i++)
	           {
	        	   if(g.get(front).get(i)==ev)
	        		   return true;
	             q.add(g.get(front).get(i));
	           }
	           q.remove();
	         }
	    else
	         {
	         q.remove();
	         }
	  }
	  return false;
	}
}