import java.util.*;
class Edge{
  int v;
  int w;
  Edge(int v, int w){
    this.v = v;
    this.w = w;
  }
}
class BeingZeroGraph1
{
  	void insertEdge(HashMap<Integer,ArrayList<Edge>> g, int u, int v, int w)
    {
      g.get(u).add( new Edge(v,w));
      g.get(v).add( new Edge(u,w));
    }
  
  	void printGraph(HashMap<Integer,ArrayList<Edge>> g)
    {
  		for(int i=0;i<g.size();i++)
  		{
  			System.out.print(i+" : ");
	     	for(Edge key:g.get(i))
	     	{
	     		System.out.print(key.v+" ("+key.w+") ");
	     		
	     	}
	     	System.out.println();
  		}
    }
}
public class CreatePrintWeightedAdjMatrix 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
      	int t=sc.nextInt();
      	BeingZeroGraph1 bzg = new BeingZeroGraph1();
      	while(t-->0)
      	{
        	int v=sc.nextInt();
        	int e=sc.nextInt();
        	HashMap<Integer,ArrayList<Edge>> g=new HashMap<>();
        	for(int k=0;k<v;k++)
          		g.put(k,new ArrayList<Edge>());
            for(int i=0;i<e;i++)
            {
              int x=sc.nextInt();
              int y=sc.nextInt();
              int w=sc.nextInt();
              bzg.insertEdge(g, x, y, w);
            }
        	bzg.printGraph(g);
      	} 
        System.out.println();      
	}
}