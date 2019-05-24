import java.util.Scanner;

public class MinCostPalindrome {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
         while(t--!=0){
        	 String s = sc.next();
            int costa  = sc.nextInt();
            int costb  = sc.nextInt();
            System.out.println(minCost(s.toCharArray(),costa,costb,0,s.length()-1,0));
         }
	}

	 static int minCost(char[] c, int costa, int costb,int i,int j,int minCostPal ) {
		if(j<=i)
		{
			if(isPalindrome(c))
				return minCostPal;
			else
				return -1;
		}
		if(c[i]==c[j] && c[i]!='/')
			return minCost(c,costa,costb,++i,--j,minCostPal);
		if(c[i]==c[j] && c[i]=='/')
		{
			if(costa<costb)
			{
				c[i]='a';
				c[j]='a';
				minCostPal = minCostPal + 2*costa;
				return minCost(c,costa,costb,++i,--j,minCostPal);
			}
			else
			{
					c[i]='b';
					c[j]='b';
					minCostPal = minCostPal + 2*costb;
					return minCost(c,costa,costb,++i,--j,minCostPal);
			}
		}
		if(c[i]!=c[j])
		{
			if(c[i]=='/')
				{
						if(c[j]=='a')
						{
							c[i]='a';
						minCostPal = costa+minCostPal;
						}
						else
						{
							c[i]='b';
							minCostPal = costb+minCostPal;
						}
				}
			if(c[j]=='/')
				{
						if(c[i]=='a')
						{
							c[j]='a';
						minCostPal = costa+minCostPal;
						}
						else
						{
							c[j]='b';
							minCostPal = costb+minCostPal;
						}
				}
			return minCost(c,costa,costb,++i,--j,minCostPal);
		}
		return -1;
	}
	 
	 static boolean isPalindrome(char[] c)
	 {
		 
		 
		 StringBuilder s1= new StringBuilder("ab");
		 int i=0;
		 int j = c.length-1;
		 while(i<j)
		 {
			 if(c[i]!=c[j])
			 {
				 return false;
			 }
			 i++;
			 j--;
		 }
		 return true;
	 }
}
