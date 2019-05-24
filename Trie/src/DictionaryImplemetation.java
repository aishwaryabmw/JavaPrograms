
//public class DictionaryImplemetation
import java.util.*;
class DictionaryImplemetation
{
  	void PUT(TrieNode root, String key, String value)
    {
		for(int i=0;i<key.length();i++)
        {
          int idx = key.charAt(i)-'a';
          if(root.next[idx]==null)
            root.next[idx]= new TrieNode();
          root=root.next[idx];
        }
      root.isEOW = true;
      root.meaning = value;
    }
  	String GET(TrieNode root, String key)
    {
      for(int i=0;i<key.length();i++)
      {
        int idx = key.charAt(i)-'a';
          root=root.next[idx];
      }
		return root.meaning;
    }
  	boolean CHECK(TrieNode root, String key)
    {
      for(int i=0;i<key.length();i++)
      {
        int idx = key.charAt(i)-'a';
        if(root.next[idx]==null)
          return false;
          root=root.next[idx];
      }
      if(root.isEOW)
		return true;
      else return false;
    }
  	boolean ISPREFIX(TrieNode root, String key)
    {
      for(int i=0;i<key.length();i++)
      {
        int idx = key.charAt(i)-'a';
        if(root.next[idx]==null)
          return false;
          root=root.next[idx];
      }
		return true;
    }  
  	void REMOVE(TrieNode root, String key)
    {
      for(int i =0;i<key.length();i++)
      {
        int idx = Character.toLowerCase(key.charAt(i)) - 'a';
        if(root.next[idx]==null)
             return;  
        root = root.next[idx];

      }
      root.isEOW = false;
    }
  	
  	void printWordsInTrie(TrieNode root) {
        char path[]=new char[150];
        printWordsInTriehelper(root,path,0);
  		
  	}
      void printWordsInTriehelper(TrieNode root,char path[],int pi)
       {
        if(root.isEOW)
     {
        for(int j=0;j<pi;j++)
                  System.out.print(path[j]);
          System.out.print(" ");
     }
      
            for(int i=0;i<TrieNode.ALPHABET_SIZE;i++)
            {
              if(root.next[i]!=null)
              {
                path[pi]= (char)(i+'a');
                            		printWordsInTriehelper(root.next[i],path,pi+1);
              }
               
              
            }
       }
}
class TrieNode {
	static final int ALPHABET_SIZE = 26;
	boolean isEOW;
        String meaning;
	TrieNode[] next;

	TrieNode() {
		next = new TrieNode[ALPHABET_SIZE]; // All array elements null by default
	}
}
 class Test 
{
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args)
	{
		int tests = sc.nextInt();
        for(int ti=1;ti<=tests;ti++)
        {
          	TrieNode root = new TrieNode();
            int opsCount = sc.nextInt();
          
            DictionaryImplemetation bzmops = new DictionaryImplemetation();
            for(int op=1;op<=opsCount;op++)
            {
                String operation = sc.next();
				String key = sc.next();
   				
              	if(operation.equals("PUT")){
					String value = sc.next();
               		bzmops.PUT(root, key, value);
                }
              	else if(operation.equals("GET"))
               		System.out.printf("%s ", bzmops.GET(root, key));
              	else if(operation.equals("ISPREFIX"))
               		System.out.printf("%b ", bzmops.ISPREFIX(root, key));
              	else if(operation.equals("CHECK"))
               		System.out.printf("%b ", bzmops.CHECK(root, key));
              	else if(operation.equals("REMOVE"))
               		bzmops.REMOVE(root, key);
            }
            System.out.println();
        }
	}
}
