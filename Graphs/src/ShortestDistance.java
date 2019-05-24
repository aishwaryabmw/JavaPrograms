import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
public class ShortestDistance
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
          int count = sc.nextInt();
		  while(count--!=0)
		  {
			  int sv=sc.nextInt();
			  int ev=sc.nextInt();
			  shortestPath(g,sv,ev);
		  }
          System.out.println();
        }
	
	}
	static void shortestPath(HashMap<Integer, ArrayList<Integer> > g,int sv,int ev){
		  boolean v[]=new boolean[g.size()];
		              	int min=  shortestPathHelper(g,v,sv,ev,Integer.MAX_VALUE,0);
            	if(min==Integer.MAX_VALUE)
            		System.out.print(0+" ");
            	else
            		System.out.print(min+" ");
		}
		static int shortestPathHelper(HashMap<Integer, ArrayList<Integer> > g,
				boolean v[],int vertex,int ev,int min,int d)
		{
			  v[vertex]=true;
			  for(int i=0;i<g.get(vertex).size();i++)
			  {
			    if(!v[g.get(vertex).get(i)] )
			    {
			    	if(g.get(vertex).get(i)!=ev )
			    	{
			    		d++;
			    		min= shortestPathHelper(g,v,g.get(vertex).get(i),ev,min,d);
			    		--d;
			    	}
			    	else
			    	{
			    		if(min>d)
			    			min=++d;
			    		break;
			    	}
			    }
			  }
			  return min;
		  }
	 }
		
