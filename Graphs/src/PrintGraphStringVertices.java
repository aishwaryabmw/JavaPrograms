


import java.util.*;
class PrintGraphStringVertices
{
	Map<String, Integer> nameToIdx;
	Map<Integer, String> idxToName;
	List< List<Integer> > g;
	int indices = 0;
	
	public PrintGraphStringVertices(int nv)
	{
		nameToIdx = new HashMap<>();
		idxToName = new HashMap<>();
		g = new ArrayList<>();
		for(int i=0;i<nv;i++)
			g.add(new ArrayList<Integer>());
	}
	
	

	boolean areFriendsOfFriends(int n1, int n2){
			return true;
	}	
	
	void insertEdge(int u, int v)
	{
		g.get(u).add(v);
		g.get(v).add(u);
	}
	void insertEdge(String n1, String n2)
	{
		if(!nameToIdx.containsKey(n1)){
			nameToIdx.put(n1, indices);
			idxToName.put(indices, n1);
			indices++;
		}
		int n1Idx = nameToIdx.get(n1);
		
		if(!nameToIdx.containsKey(n2)){
			nameToIdx.put(n2, indices);
			idxToName.put(indices, n2);
			indices++;
		}
		int n2Idx = nameToIdx.get(n2);
		System.out.printf("INSERT EDGE between %s(%d) and %s(%d)\n", n1, n1Idx, n2, n2Idx);
		insertEdge(n1Idx, n2Idx);
	}
	
	void printGraph()
	{
		for(int i=0;i<idxToName.size();i++)
		{
			System.out.printf("%s : ", idxToName.get(i));
			List<Integer> friendsOfI = g.get(i);
			for(int friendIdx : friendsOfI)
				System.out.printf("%s ", idxToName.get(friendIdx));
			System.out.println();
		}
	}
}


