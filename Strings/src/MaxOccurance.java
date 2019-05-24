import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
public class MaxOccurance {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        int max=0;
         while(t--!=0){
            String str  = sc.next();
            if(str.length()==0) return;
            Map<Character,List<Integer>> map = new LinkedHashMap<Character,List<Integer>>();
            for(int i=0;i<str.length();i++)
            {
            	
            	char key=str.charAt(i);
            	if(map.get(key)==null)
            	{
            		map.put(key, new ArrayList<Integer>());
            	}
            	map.get(key).add(map.get(key).size()+1);
            	
            }
            Set<Character> keys= map.keySet(); 
            for(Character key:keys)
            {
            	if(max<map.get(key).size())
            	{
            		max=map.get(key).size();
            	}
            }
            for(Character key:keys)
            {
            	if(max==map.get(key).size())
            	{
            		System.out.print(key + " "+map.get(key).size()+" ");
            	}
            }
            System.out.println();
	}
         sc.close();
	}
}