import java.util.Arrays;
import java.util.Scanner;

public class PairWithSum 

{ 
    
    static boolean removeDuplicates(int arr[],int sum) 
    { 
    	if(arr.length==0 )
            return false;
    	Arrays.sort(arr);
        int j=arr.length-1;
        int i=0;
        while(i<j)        
        {
        	if(arr[i]+arr[j]==sum)
        		return true;
        	else if(arr[i]+arr[j]>sum)
        		j--;
        	else i++;
        	
        }
        return false;
    } 
      
    public static void main (String[] args)  
    { 
		Scanner sc=new Scanner(System.in);
        int tc=sc.nextInt(); 
        while(tc>0)
        {
        	int n=sc.nextInt();
        	int sum=sc.nextInt();

        	int arr[] = new int[n]; 
        	for (int i=0; i<n; i++) 
        		arr[i]=sc.nextInt();
	        System.out.println(removeDuplicates(arr,sum)); 
	        tc--;
        }
    } 
}