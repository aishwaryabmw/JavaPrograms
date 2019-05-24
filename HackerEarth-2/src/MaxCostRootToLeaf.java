import java.util.Scanner;

public class MaxCostRootToLeaf {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int tc = sc.nextInt();
		while(tc--!=0)
		{
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
			a[i]=sc.nextInt();
		int cost = maxCostRootToLeaf(a,0);
		System.out.println(cost);
		}
	}
	static int maxCostRootToLeaf(int a[],int idx)
	{
		if(idx>=a.length)
			return 0;
		int child1 = a[idx]+maxCostRootToLeaf(a,4*idx+1);
		int child2 = a[idx]+maxCostRootToLeaf(a,4*idx+2);
		int child3 = a[idx]+maxCostRootToLeaf(a,4*idx+3);
		int child4 = a[idx]+maxCostRootToLeaf(a,4*idx+4);
		return Math.max(child1, Math.max(child2, Math.max(child3, child4)));
	}
}
