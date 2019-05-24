import java.util.*;
class DiagonalTraversalBST
{
	public static void main(String args[])
	{
		//diagonalTraversal();
	}
    void diagonalTraversal(BTNode root)
    {
      int diagonalNo=1;
      Map<Integer,ArrayList<Integer>> hm = new TreeMap<>();
      diagonalTraversalHelper(root,diagonalNo,hm);
      Set<Integer> keys= hm.keySet(); 
      
      for(Integer key:keys)
      {
      	//System.out.print(key + " : ");
    	  for(int i=0;i<hm.get(key).size();i++)
          {
        		System.out.print( hm.get(key).get(i) +" ");
          }
      	System.out.println();
      }
    }
  	void diagonalTraversalHelper(BTNode root,int diagonalNo,Map<Integer,ArrayList<Integer>> hm)
    {
  		if(root == null) return;
      if(hm.get(diagonalNo).size()==0)
      {
      	hm.put(diagonalNo,new ArrayList<>());
      }
      hm.get(diagonalNo).add(root.data);
      diagonalTraversalHelper(root.left,diagonalNo+1,hm);
      diagonalTraversalHelper(root.right,diagonalNo,hm);
      
     
    }
  	
  	
  	void leftView(BTNode root)
    {
      int maxLevel=0;
      leftViewHelper(root,0,maxLevel); 
    }
  
  void leftViewHelper(BTNode root,int level,int maxLevel)
  {
    if(root==null)
      return;
    if(level >= maxLevel)
    {
      maxLevel++;
      System.out.print(root.data+" ");
    }
    leftViewHelper(root.left,level+1,maxLevel);
    leftViewHelper(root.right,level+1,maxLevel);
  }
}
class BTNode
{
    int data;
    BTNode left, right;
    BTNode(int d)
    {
      	data= d;
      	left = right = null;
    }
}


