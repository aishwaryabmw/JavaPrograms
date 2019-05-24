import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

class MinimumStepsToZero
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
         while(t--!=0){
            int n  = sc.nextInt();
            //System.out.println(minSteps(n));
         }
	}

	 static void minSteps(int n) {
		 
		 //if(n<=2&&n>=0) return n;
		 Node root = new Node(n);
		// int left = 1+ minSteps((n-1));
		 root.left=new Node(n-1);
		 int choice2=0;
		 
		 HashMap<Integer,Integer> map = new HashMap<>();
		 
			//ArrayList<Integer> list = new ArrayList<>();
			int factor=(int) Math.floor(Math.sqrt(n));
			for (int i = factor; i >= 2; i--) 
	        {
	        	if(n%i==0)
	        	{
	                factor = n/i;
	                //choice2= 1+minSteps(factor);
	               // list.add(choice2);
	                map.put(i,choice2);
	        	}
	        }
			int min=Integer.MAX_VALUE;
						
			if(map.size()>0)
			{
				for ( Integer key : map.keySet() ) {
					if(map.get(key)<min)
					{
						min = map.get(key);
						root.right = new Node(key);
					}
				}
			}
		
		/*if(root.right!=null ) 
			return Math.min(root.left.data,root.right.data);
		else 
			return root.left.data;*/
	}

}
class Node
{
	int data;
	Node left;
	Node right;
	Node(int data)
	{
		this.data=data;
	}
}
 