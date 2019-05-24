import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;
class PrintAllNStrings {
	static List<String> ans;
    static  List<String> genBinaryNumbers(int nBits)
    {
        ans=new ArrayList<>();
        ans=genBinaryNumbersHelper(nBits,"",ans);
        return ans;
    }
    static List<String> genBinaryNumbersHelper(int n,String str,List<String> list)
    {
        if(str.length()==n )
        {
        	list.add(str);
            return list;
        }
        for(int i=0;i<=1;i++)
        {
        	String newPrefix =str+i;
        	genBinaryNumbersHelper(n,newPrefix,list);
        }
        return list;
    }
    public static void main(String args[])
    {
    	Scanner sc=new Scanner(System.in);
    	int tc=sc.nextInt();
    	while(tc--!=0)
    	{
    		int n=sc.nextInt();
	        genBinaryNumbers(3);
	        System.out.println();
    	}
    }
}