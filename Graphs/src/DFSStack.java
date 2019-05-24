import java.util.*;
public class DFSStack 
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
          int count=sc.nextInt();
          while(count--!=0)
          {
            int sv=sc.nextInt();
            int ev=sc.nextInt();
            if(sv==ev)
            {
            	System.out.println(sv+"->"+ev);
            	continue;
            }
            dfs(g,sv,ev);
            System.out.println();
          }
          System.out.println();
        }
	
	}
  
  	static void dfs(HashMap<Integer, ArrayList<Integer> > g, int sv,int ev){
		Stack<Integer> q = new Stack<>();
	  int a[]=new int[g.size()];
	  q.push(sv);
	  while(!q.isEmpty())
	  {
	    int front=q.peek();
	    if(a[front]==0)
	         {
	        	a[front]=-1;
          		if(front!=ev)
	           System.out.print(front+"->");
          		if(front==ev)
                {
                  System.out.print(front);
                  return;
                }
               q.pop();
	           for(int i=0;i<g.get(front).size();i++)
	           {
	             q.push(g.get(front).get(i));
	             if(g.get(front).get(i)==ev)
	            	 break;
	           }
	           
	         }
	    else
	         {
	         q.pop();
	         }
	  }
	}
}