import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
public class PrintFrequencies {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
         while(t--!=0){
            int n = sc.nextInt();
            if(n==0) return;
            Map<Integer,List<Integer>> map = new LinkedHashMap<Integer,List<Integer>>();
            for(int i=0;i<n;i++)
            {
            	int num=sc.nextInt();
            	int key=num;
            	if(map.get(key)==null)
            	{
            		map.put(key, new ArrayList<Integer>());
            	}
            	//map.putIfAbsent(num, new ArrayList<Integer>());
            	map.get(num).add(num);
            	
            }
            Set<Integer> keys= map.keySet(); 
            for(Integer key:keys)
            	System.out.print(key + ":"+map.get(key).size()+" ");
            System.out.println();
	}
       
	}
}
