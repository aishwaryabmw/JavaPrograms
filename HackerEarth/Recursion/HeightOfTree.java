import java.util.*;

class HeightOfTree {
    
    public static int treeHeight(int arr[],int index)
    {
        
        	if(arr[index]==-1)
        		return 1;
        	
        	return 1+treeHeight(arr,arr[index]);
        
    }
	public static void main (String[] args) {
	    int  tc=0;
	    Scanner sc=new Scanner(System.in);
	    tc=sc.nextInt();
	    while(tc>0)
	    {
	    	int height=0,max=0;
	        int len=sc.nextInt();
	        int arr[]=new int[len];
	        for(int i=0;i<len;i++)
	         arr[i]=sc.nextInt();
	        if(len>0)
	        for(int i=0;i<len;i++)
	        {
	        	height=treeHeight(arr,i);
	        	if(max<height)
	        		max=height;
	        }
	        System.out.println(max);
	        tc--;
	    }
	}
}
