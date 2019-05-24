import java.util.Scanner;

public class CountingTriplet {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int tc=sc.nextInt();
		while(tc--!=0)
		{
			int n = sc.nextInt();
			int k= sc.nextInt();
			int a[]=new int[n];
			int p[]=new int[n-1];
			for(int i=0;i<n;i++)
				a[i]=sc.nextInt();
			Node1 r = new Node1(a[0]);
			for(int i=0;i<n-1;i++)
				p[i]=sc.nextInt();
			
			for(int i=0;i<p.length;i++)
				r = insertInTree(r,a[i+1],p[i]);
			
			System.out.println(triplets(r,k,0));
		}
	}
	static Node1 insertInTree(Node1 root,int a,int parent)
	{
		Node1 par = findParent(root,parent);
		if(par==null)
			par = new Node1(a);
		if(par.left==null)
			par.left=new Node1(a);
		else
			par.right = new Node1(a);
		return root;
	}
	 static Node1 findParent(Node1 root,int p) {
		 if(root==null) return null;
		 if(root.data==p)
			 return root;
		 if(root.data!=p)
		 return findParent(root.left,p);
		 return findParent(root.right,p);
		
	}
	/*private static int countTriplets(Node1 root, int k,int count,int c) {
		if(3==count && k<=0)
			return ++c;
		if(root==null || (3 == count && k>0)) return 0;
		
		
		int left =  countTriplets(root.left,k-root.data,++count,c) ;
		count--;
		int right = countTriplets(root.right,k-root.data,++count,c);
		count--;
		return left+right;
	}*/
	
	 static int triplets(Node1 root,int k,int c)
    {
		if(3==c && k<=0)
			return 0;
      if(root == null || (3 == c && k>0))
        return 0;
      int left_path = triplets(root.left,k-root.data,++c);
      int right_path = triplets(root.right,k-root.data,++c);
     // int left_triplet = triplets(root.left,k-root.data,++c);
      //int right_triplet = triplets(root.right,k-root.data,++c);
      return(1+left_path + right_path  /*+ left_triplet + right_triplet*/); 
    }
}
class Node1
{
    int data;
    Node1 left, right;
    Node1(int d)
    {
      	data = d;
      	left = right = null;
    }
}