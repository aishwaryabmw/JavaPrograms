import java.util.Scanner;

public class RecursiveMarbles {

	public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while(tc--!=0)
        {
            int n= sc.nextInt();
            System.out.println(winner(n,"ABHAY"));
        }
    }

	private static String winner(int n,String turn) {
		
		if(n<0)
		return turn;
		
		if(n>=5)
		{
			if(turn=="ABHAY")
			turn = winner(n-1,"BHARAT");
			else
				turn = winner(n-1,"ABHAY");
		}
		
		return turn;
		
	}
}
