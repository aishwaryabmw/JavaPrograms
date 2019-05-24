import java.util.*;
class FloydWarshall
{
	static void printAllPairSD(HashMap<Integer, ArrayList<Edge1> > g)
	{
      int dist[][]=new int[g.size()][g.size()];
      int INFINITY = 1000;
      
      for(int i=0;i<g.size();i++)
      {
        for(int j=0;j<g.size();j++)
        {
        	if(i==j)
        	{
        		dist[i][j]=0;
        		continue;
        	}
        	dist[i][j]=INFINITY;
        }
    }
		for(int i=0;i<g.size();i++)
        {
          for(int j=0;j<g.get(i).size();j++)
          {
        	  dist[i][g.get(i).get(j).v] = g.get(i).get(j).w;
        	  dist[g.get(i).get(j).v][i] = g.get(i).get(j).w;
          }
        }
		
		for(int k=0;k<g.size();k++)
	      {
	        for(int i=0;i<g.size();i++)
	        {
	          for(int j=0;j<g.size();j++)
	          {
	            if(dist[i][j]>(dist[i][k] + dist[k][j]))
	              dist[i][j]=dist[i][k] + dist[k][j];
	          }
	        }
	      }
	      for(int i=0;i<g.size();i++)
	        {
	          for(int j=0;j<g.size();j++)
	          {
	            System.out.print(dist[i][j]+" ");
	          }
	        System.out.println();
	      }
	}
	
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		HashMap<Integer, ArrayList<Edge1> > g = new HashMap<>();
		int nv =sc.nextInt();
		int ne = sc.nextInt();
		for(int i=0;i<ne;i++)
		{
			int u = sc.nextInt();
			int v = sc.nextInt();
			int w = sc.nextInt();
			Edge1 e=new Edge1(v,w);
			
			if(!g.containsKey(u))
			{
				 g.put(u, new ArrayList<Edge1>());
			}
			g.get(u).add(new Edge1(v,w));
			if(!g.containsKey(v))
			{
				 g.put(v, new ArrayList<Edge1>());
			}
			g.get(v).add(new Edge1(u,w));
		}
		printAllPairSD(g);
	}
}
class Edge1
{
  	int v;
  	int w;
  	Edge1(int v, int w)
    {
      	this.v = v;
      	this.w = w;
    }
}
