import java.util.*;

public class Components 
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
          int countVisited=0;
           int a[]=new int[g.size()];
          int comp=bfs(g,a,0,countVisited,0);
          System.out.println(comp);
        }
	}
  static int bfs(HashMap<Integer, ArrayList<Integer> > g,int a[], int s,int countVisited,int comp)
  {
    if(countVisited==g.size())
      return comp;
    else{
        Queue<Integer> q = new LinkedList<>();
        q.add(s);
        while(!q.isEmpty())
        {
          int front=q.peek();
          if(a[front]==0)
               {
                  a[front]=-1;
            	countVisited++;
                // System.out.print(front+" ");
                 for(int i=0;i<g.get(front).size();i++)
                 {
                   q.add(g.get(front).get(i));
                 }
                 q.remove();
               }
          else
               q.remove();
        }
      if(q.isEmpty() && countVisited!=g.size() )
      {
        comp++;
        for(int i=0;i<g.size();i++)
        {
          if(a[i]==0)
            return bfs(g,a,i,countVisited,comp);
        }
      }
   }
    return ++comp;
}
}