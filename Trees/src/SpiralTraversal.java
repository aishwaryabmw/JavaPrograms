import java.util.*;

class BSTNode {
	int data;
	BSTNode left, right;

	public BSTNode(int data) {
		this.data = data;
		this.left = this.right = null;
	}
}

class SpiralTraversal {
	static void spiralOrderTraversal(BSTNode root) {
		Map<Integer,ArrayList<Integer>> map = new TreeMap<>();
		spiralOrderTraversalHelper(root,1,map);
		for(int i=1;i<=map.size();i++)
		{
			if(i%2!=0)
			for(int j=0;j<map.get(i).size();j++)
				System.out.print(map.get(i).get(j)+" ");
			else
				for(int j=map.get(i).size()-1;j>=0;j--)
					System.out.print(map.get(i).get(j)+" ");
		}
	}
  static void spiralOrderTraversalHelper(BSTNode root,int level,Map<Integer,ArrayList<Integer>> map)
  {
	  if(root==null)
	       return;
	if(map.get(level)==null)
		map.put(level,new ArrayList<>());
	map.get(level).add(root.data);
	spiralOrderTraversalHelper(root.left,level+1,map);
	spiralOrderTraversalHelper(root.right,level+1,map);
  }
  public static void main(String args[])
  {
	  BSTNode n =new BSTNode(1);
	  n.left=new BSTNode(2);
	  n.right=new BSTNode(3);
	  n.left.left=new BSTNode(4);
	  n.left.right=new BSTNode(5);
	  n.right.left=new BSTNode(6);
	  n.right.right=new BSTNode(7);
	  spiralOrderTraversal(n);
  }
  
}