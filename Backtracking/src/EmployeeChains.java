import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;
public class EmployeeChains {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
         while(t--!=0){
            int n = sc.nextInt();
            if(n==0) return;
            HashMap<Integer,List<Integer>> map = new HashMap<>();
            int ceo=0;
            for(int i=0;i<n;i++)
            {
            	int key=sc.nextInt();
            	int value=sc.nextInt();
				if(i==0) 
            		ceo=key;
            	map.putIfAbsent(key, new ArrayList<Integer>());
            	map.get(key).add(value);
            }
         
            int p[]=new int[100000];
            printEmployeeChains(map,ceo,p,0);
         }
	}
	static void printEmployeeChains(HashMap<Integer,List<Integer>> map,int emp,int p[],int pi)
	{
		p[pi]=emp;
		if(!map.containsKey(emp))
		{
			for(int i=0;i<=pi;i++)
			{
				System.out.print(p[i]+" ");
			}
			System.out.println();
			return;
		}
		for(int i=0;i<map.get(emp).size();i++)
			printEmployeeChains(map,map.get(emp).get(i),p,pi+1);
	}
}
