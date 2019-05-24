import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

class PairSumCount 
{ 
    
    static int getPairsCount(int arr[], int sum) 
    { 
        HashMap<Integer, Integer> hm = new HashMap<>(); 
        for (int i=0; i<arr.length; i++){ 
            if(!hm.containsKey(sum-arr[i])) 
            	
                hm.put(arr[i],-1); 
            else 
            	hm.put(sum-arr[i],arr[i]);
        }
        Set<Integer> keys= hm.keySet();
		int count=0;
        for(Integer key:keys)
        {
        	if(key+hm.get(key)==sum)
        	count++;
        }
        return count;
    }
    public static void main(String[] args) { 
    	Scanner sc=new Scanner(System.in);
        int sum,n,tc;
        tc=sc.nextInt();
        while(tc>0)
        {
        n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
        	arr[i]=sc.nextInt();
        sum=sc.nextInt();
        int count= getPairsCount(arr,sum);
        System.out.println(count);
        tc--;
        }
    }
}