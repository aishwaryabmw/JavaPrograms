import java.util.Scanner;
public class KSizeCombinations {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
         while(t--!=0){
            int n = sc.nextInt();
            int a[]=new int[n];
            int length=sc.nextInt();
            if(n==0) return;
            String str="";
            kSizeComb(n,length,1,str,0);
            System.out.println();
         }
	}
	static void kSizeComb(int n,int k,int len,String str,int from)
	{
		if(len>n|| from>=n)
			return;
		for(int i=from;i<len;i++)
		{
			String newStr =str+(i+1);
			if(newStr.length()==k)System.out.print(newStr+" ");
			kSizeComb(n,k,len+1,newStr,from+1);
			newStr=newStr.substring(0, newStr.length()-1);
			kSizeComb(n,k,len+1,newStr,from+1);
		}	
	}
}
