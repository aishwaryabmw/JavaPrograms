import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class DistinctElements {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while(t--!=0){
            int n = sc.nextInt();
          Set<Integer> set=new LinkedHashSet<Integer>();
            for(int i=0;i<n;i++)
                set.add(sc.nextInt());
            for(int i:set)
            	System.out.print(i+" ");
            System.out.println();
        }
	}
}
