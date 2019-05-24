import java.util.Scanner;
public class LowestCommonAncestor {
	static int count = 0;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a= sc.nextInt();
		int b= sc.nextInt();
		Node root = new Node(1);
		root.right = new Node(2);
		root.right.right = new Node(4);
		root.right.right.right = new Node(5);
		root.right.right.left = new Node(3);
		Node n = lca(root, a, b);
		if(count==2)
		System.out.println(n.data);
		else
			System.out.println("NULL");
	}
	static Node lca(Node root,int a,int b)
	{
		return lcaH(root,a,b);
	}
	
	 static Node lcaH(Node root,int a,int b)
	{
		if(root==null)
			return null;
		Node leftLca =  lca(root.left,a,b);
		Node rightLca =  lca(root.right,a,b);
		if(root.data==a )
		{
			count++;
			return root;
		}
		if( root.data==b)
		{
			count++;
			return root;
		}
		if(leftLca!=null && rightLca!=null)
			return root ;
		return leftLca != null ?  leftLca :  rightLca;
	}
}
class Node 
{
    int data;
    Node left, right;
    Node(int d)
    {
      	data = d;
      	left = right = null;
    }
}