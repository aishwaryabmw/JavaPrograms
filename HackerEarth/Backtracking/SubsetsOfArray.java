import java.util.Arrays;
import java.util.Scanner;
public class SubsetsOfArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
         while(t--!=0){
            int n = sc.nextInt();
            int a[]=new int[n];
            if(n==0) return;
            for(int i=0;i<n;i++)
            	a[i]=sc.nextInt();
            Arrays.sort(a);
            String str="";
            printArraySubsets(a,1,str,0);
            System.out.println();
         }
	}
	static void printArraySubsets(int a[],int len,String str,int from)
	{
		if(len>a.length|| from>=a.length)
			return;
		for(int i=from;i<len;i++)
		{
			String newStr =str+" "+ a[i];
			int l=(a[i]+"").length();
			System.out.println(newStr.trim()+" ");
			printArraySubsets(a,len+1,newStr,from+1);
			newStr=newStr.substring(0, newStr.length()-l-1);
			printArraySubsets(a,len+1,newStr,from+1);
		}	
	}
}
