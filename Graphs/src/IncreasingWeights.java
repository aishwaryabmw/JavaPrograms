
import java.util.*;
class GEdge{
 	int v, w;  
  	public GEdge(int v, int w){
     	this.v = v;
        this.w = w;
    }
}

class PQEdge implements Comparable<PQEdge>{
 	int u, v, w;  
  	public PQEdge(int u, int v, int w){
        this.u = u;
     	this.v = v;
        this.w = w;
    }
  	public String toString(){
      	return "("+u+" "+v+" "+w+")";
    }
  	public int compareTo(PQEdge e){
      	if(this.w != e.w)
      		return this.w - e.w;
      	return this.u - e.u;      
    }
}

public class IncreasingWeights 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
      	int t = sc.nextInt();
      	while(t-- > 0){
          int nv = sc.nextInt();
          int ne = sc.nextInt();
          
          HashMap<Integer, ArrayList<GEdge>> g = new HashMap<>();
          for(int i=0; i<nv; i++){
           	g.put(i, new ArrayList<>());            
          }
          
          for(int i=0; i<ne; i++){
            int u = sc.nextInt();
            int v = sc.nextInt();
            int w = sc.nextInt();
            
            g.get(u).add(new GEdge(v, w));
            g.get(v).add(new GEdge(u, w));            
          }
          
          PriorityQueue<PQEdge> pq = new PriorityQueue<>();
          for(int u=0; u<nv; u++){
            ArrayList<GEdge> adjListOfU = g.get(u);
            for(GEdge e: adjListOfU){
             	 int v = e.v;
              	 int w = e.w;
              	 if(u < v){
                  	pq.add(new PQEdge(u, v, w)); 
                 }               
            } 
          }
          
          while(!pq.isEmpty()){
           	System.out.print(pq.remove() + " ");           
          }
        }
		
	}
}