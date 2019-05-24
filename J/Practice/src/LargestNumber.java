import java.util.*;

class Solution {
    static void largetsNumberFormed(List<String> list)
    {
    	
       Collections.sort(list,new Comparator<String>()
    		{
    	@Override
    	 public int compare(String s1,String s2)
    		{
    			String s1s2=s1 + s2; 
    	        String s2s1=s2 + s1;
    	        return s1s2.compareTo(s2s1) > 0 ? -1:1;
    		}
    		});
   for(String l:list) 
        System.out.print(l);
    }
}

public class LargestNumber {
    public static void main(String args[] ) throws Exception {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        Solution sol = new Solution();
        while(t--!=0){
            int n = sc.nextInt();
            //int[] a=new int[n];
            List<String> list=new ArrayList<String>();
            for(int i=0;i<n;i++)
                list.add(sc.next());
            sol.largetsNumberFormed(list);
            //System.out.println(res);
        }
    }
}


