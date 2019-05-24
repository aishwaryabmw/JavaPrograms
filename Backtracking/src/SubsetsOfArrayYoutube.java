import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;
public class SubsetsOfArrayYoutube  {
	public static void main(String args[])
    {
    	Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
         while(t--!=0){
            int n = sc.nextInt();
            if(n==0) return;
            Map<Integer,Integer> map = new TreeMap<Integer,Integer>();
            for(int i=0;i<n;i++)
            {
            	int key=sc.nextInt();
            	if(map.get(key)==null)
            		map.put(key, 0);
            	map.put(key, 1+map.get(key));
            }
            int arr[]=new int[map.size()];
            int count[]= new int[map.size()];
            int idx=0;
            for(Map.Entry<Integer, Integer> entry :map.entrySet())
            {
            	arr[idx]= entry.getKey();
            	count[idx]=entry.getValue();
            	idx++;
            }
            int[] res=new int[n];
            genArrayPerm(arr,res,count,0,0);
            System.out.println();
         }
    }
    static void genArrayPerm(int arr[],int res[],int count[],int len,int pos)
    {
        for(int i=pos;i<arr.length;i++)
        {
        	if(count[i]==0)
        		continue;
        	res[len]=arr[i];
        	count[i]--;
        	for(int j=0;j<=len;j++)
            	System.out.print(res[j]);
            System.out.println();
        	genArrayPerm(arr,res,count,len+1,i);
        	count[i]++;
        }
    }
}

