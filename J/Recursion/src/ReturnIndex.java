import java.util.Scanner;
public class ReturnIndex {
	public static int IndexReturn(int arr[],int idx,int k)
    {
    	if(idx==arr.length)
    		return -1;
    	if(arr[idx]==k)
    		return idx;
    	return IndexReturn(arr,idx+1,k);
    }
	
    public static void main (String[] args) {
 	    int n;
 	   Scanner sc= new Scanner(System.in);
 	   int tc=sc.nextInt();
 	    
 	    while(tc>0)
 	    {
 	     n=sc.nextInt();
 	 	 int arr[]=new int[n];
         for(int i=0;i<n;i++)
             arr[i]=sc.nextInt();
         int findN;
         findN=sc.nextInt();
         int findNum[]=new int[findN];
         for(int i=0;i<findN;i++)
         {
         	findNum[i]=sc.nextInt();
         	int index = IndexReturn(arr,0,findNum[i]);
         	System.out.print(index+" ");
         }
         System.out.println();
         tc--;
 	    }
    }
 
}    
        
        
        
        
        
        
        
        
        
   