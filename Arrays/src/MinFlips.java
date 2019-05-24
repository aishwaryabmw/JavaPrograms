import java.util.*;
class MinFlips {
	public static void main (String[] args) {
		Scanner sc =  new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0)
		{
		    char c[]=(sc.next()).toCharArray();
		    char first;
		    int ans1=0,ans2=0;
		    first='0';
			    for(int i=0;i<c.length;i=i+2)
			    {
			        if(c[i]!=first)
			        	ans1++;
			    }
			    for(int i=1;i<=c.length-1;i=i+2)
			    {
			        if(c[i]==first)
			        	ans1++;
			    }
		        first='1';
		    	for(int i=0;i<c.length;i=i+2)
			    {
			        if(c[i]!=first)
			        	ans2++;
			    }
			    for(int i=1;i<=c.length-1;i=i+2)
			    {
			        if(c[i]==first)
			        	ans2++;
			    }
		    System.out.println(Math.min(ans1, ans2));
		}
	}
}