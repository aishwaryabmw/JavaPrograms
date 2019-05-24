import java.util.Scanner;

public class LongestSubDistChars {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        int n = t;
         while(t--!=0){
            StringBuilder s = new StringBuilder(sc.next());
            printLongestSub(s);
         }
	}

	private static void printLongestSub(StringBuilder s) {
		int i=0;int j=1,k=j-1;
		int maxLen = 1,currMax=1;
		StringBuilder longest = new StringBuilder();
		longest.append(s.charAt(0));
		while(i<s.length() && j<s.length())
		{
			while(k>=0)
			{
			if(s.charAt(k)==s.charAt(j))
			{
				i=j;
				j++;
				//i++;
			}
			else
			{
				currMax = j-i+1;
				if(maxLen<currMax)
				{
					longest.setLength(0);
					longest.append(s, i, j+1);
				}
				else
				{
					longest.append(s.charAt(j));
				}
				j++;
			}
			k--;
			}
			
		}
		System.out.println(longest);
	}
}
