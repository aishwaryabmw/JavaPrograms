
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class WordMeaning {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
               
            int n = sc.nextInt();
            Map<String,String> map = new HashMap<String,String>();
            
            for(int i=0;i<n;i++)
            {
            	map.put(sc.next(), sc.next());
            }
            int words=sc.nextInt();
            while(words>0)
            {
            	System.out.println(map.get(sc.next()));
            	words--;
            }
	
	}
}
