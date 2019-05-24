import java.util.*;
class BeingZero{
  void printGraph(Map<Integer, List<Integer> > g){
    
	  
		  for(int j=0;j<g.size();j++)
		  {
			  System.out.print(j+" : ");
			  for(Integer value:g.get(j))
		          	System.out.print(value+" ");
			  System.out.println();
		  }
  }
}
public class PrintGraph 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
      	int t = sc.nextInt();
     	BeingZero bz = new BeingZero();
      	while(t--!=0){
          int nv = sc.nextInt();
          int ne = sc.nextInt();
          Map<Integer, List<Integer> > g = new HashMap<>();
          
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
          bz.printGraph(g);
          System.out.println();
        }
	
	}
}