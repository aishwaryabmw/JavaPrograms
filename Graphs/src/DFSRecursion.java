import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
public class DFSRecursion
{
	private static Scanner sc;
	public static void main(String[] args)
	{
      	sc = new Scanner(System.in);
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
          dfs(g);
          System.out.println();
        }
	}
	static void dfs(HashMap<Integer, ArrayList<Integer> > g){
		  boolean v[]=new boolean[g.size()];
		  for (int i = 0; i <g.size() ; i++) {
              if(!v[i])
            	  dfsHelper(g,v,i);  
		  }
		}
		static void dfsHelper(HashMap<Integer, ArrayList<Integer>> g,
				boolean v[],int vertex)
		{
			  v[vertex]=true;
			  System.out.print(vertex+" ");
			  for(int i=0;i<g.get(vertex).size();i++)
			  {
			    if(!v[g.get(vertex).get(i)])
			      dfsHelper(g,v,g.get(vertex).get(i)); 
			  }
		 }
	 }
		
