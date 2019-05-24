import java.util.*;
public class AlphabetOrder 
{
	public static void main(String[] args)
    {
		Scanner sc = new Scanner(System.in);
      int tc =sc.nextInt();
      while(tc--!=0)
      {
        int n = sc.nextInt();
        HashMap<Character,Character> h = new LinkedHashMap<>();
        for(int i = 0;i<n;i++)
        {
          String s = sc.next();
          char c[] = s.toCharArray();
          for(int j=0;j<c.length;j++)
          {
            if(!h.containsKey(c[j]))
            {
              h.put(c[j],c[j]);
            }
          }
        }
        
        for(Character c: h.keySet())
        	System.out.print(h.get(c)+" ");
        System.out.println();
      }
	}
}