import java.util.Scanner;

public class RemoveDuplicates 
{ 
    
    static int removeDuplicates(int arr[]) 
    { 
        int j=0;
        for(int i=0;i<arr.length-1;i++)
        {
        	if(arr[i]!=arr[i+1])
        		arr[j++]=arr[i];
        }
        arr[j++] = arr[arr.length-1]; 
        return j;
    } 
      
    public static void main (String[] args)  
    { 
		Scanner sc=new Scanner(System.in);
        int tc=sc.nextInt(); 
        while(tc>0)
        {
        	int n=sc.nextInt();
        	int arr[] = new int[n]; 
        	for (int i=0; i<n; i++) 
        		arr[i]=sc.nextInt();
	        n = removeDuplicates(arr); 
	        for (int i=0; i<n; i++) 
	           System.out.print(arr[i]+" "); 
	        System.out.println(); 
	        tc--;
        }
    } 
}