


	import java.util.*;

	public class RoutesServiceNow {
		static Scanner sc = new Scanner(System.in);
		public static void main(String[] args){
			int  k =sc.nextInt();
			int nv = sc.nextInt();
			int ne =sc.nextInt();
			
			HashMap<Integer,ArrayList<Edge2>> g =new
					HashMap<Integer,ArrayList<Edge2>>();
			
			for(int i=0;i<nv;i++)
			{
				g.put(i,new ArrayList<Edge2>());
			}
			for(int i=0;i<ne;i++)
			{
				int u = sc.nextInt();
				int v = sc.nextInt();
				int t =sc.nextInt();//time
				int f=sc.nextInt();//fare
				u--;v--;
				g.get(u).add(new Edge2(u,v,t,f,k));
				g.get(v).add(new Edge2(v,u,t,f,k));
			}
			int src = sc.nextInt();
			int dest = sc.nextInt();
			src--;
			dest--;
			int dist[]=new int[nv];
			int p[]=new int[nv];
			sssp(g,src,dist,p);
		
		}
		private static void sssp(HashMap<Integer, ArrayList<Edge2>> g, int src, int[] dist, int[] p) {
			// TODO Auto-generated method stub
			
		}
		
		}
	class Edge2 implements Comparable<Edge2>{
		int u,v,t,f,w;
		Edge2(int u,int v,int t,int f,int k)
		{
			this.u=u;
			this.v=v;
			this.t=t;
			this.f=f;
			this.w=t*k+f;
		}
		Edge2(int v,int w)
		{
			this.v=v;
			this.w=w;
		}
		@Override
		public int compareTo(Edge2 e) {
			// TODO Auto-generated method stub
			return this.w-e.w;
		}
	}
	

