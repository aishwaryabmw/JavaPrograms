import java.util.*;
class PhoneDigitSequence
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		List<String> list =new ArrayList<>();
		char c[]=sc.next().toCharArray();
		char p[] = new char[c.length];
		HashMap<Character,List<Character>> hm = new HashMap<Character,List<Character>>();
		hm.put('2', Arrays.asList('a','b','c'));
		hm.put('3', Arrays.asList('d','e','f'));
		hm.put('4', Arrays.asList('g','h','i'));
		hm.put('5', Arrays.asList('j','k','l'));
		hm.put('6', Arrays.asList('m','n','o'));
		hm.put('7', Arrays.asList('p','q','r','s'));
		hm.put('8', Arrays.asList('t','u','v'));
		hm.put('9', Arrays.asList('w','x','y','z'));
		genAllLetterSequences(hm,c,0,p,0);
		System.out.println();
	}
	
	static void genAllLetterSequences(HashMap<Character,List<Character>> hm ,char c[],int s,char p[],int pi) {
		if(pi>=p.length)
		{
			for(int i=0;i<pi;i++)
			System.out.print(p[i]);
			System.out.print(" ");
			return;
		}
		for(int i=0;i<hm.get(c[s]).size();i++)
		{
			p[pi]=hm.get(c[s]).get(i);
			genAllLetterSequences(hm,c,s+1,p,pi+1);
		}
	}
	/*static List<String> genAllLetterSequences(String digitSeq)
	{
      HashMap<Character,List<Character>> hm = new HashMap<Character,List<Character>>();
		hm.put('2', Arrays.asList('a','b','c'));
		hm.put('3', Arrays.asList('d','e','f'));
		hm.put('4', Arrays.asList('g','h','i'));
		hm.put('5', Arrays.asList('j','k','l'));
		hm.put('6', Arrays.asList('m','n','o'));
		hm.put('7', Arrays.asList('p','q','r','s'));
		hm.put('8', Arrays.asList('t','u','v'));
		hm.put('9', Arrays.asList('w','x','y','z'));
		String str = digitSeq;
		List<String> list =new ArrayList<>();
			for(int m=0;m<hm.get(str.charAt(0)).size();m++)
			{
				list=sequenceOfDigits(list,hm,str,hm.get(str.charAt(0)).get(m),Character.toString(hm.get(str.charAt(0)).get(m)),0);
				
			}
      return list;
		
	}
  static List<String>  sequenceOfDigits(List<String> list,HashMap<Character,List<Character>> hm,String original,char c,String str,int i)
{
	if(str.length()==original.length() || i == (original.length()-1))
	{
		System.out.print(str+" ");
		list.add(str);
		return list;
	}
	for(int j=0; j <hm.get(original.charAt(i+1)).size();j++)
	{
		String s = str +Character.toString(hm.get(original.charAt(i+1)).get(j));
		sequenceOfDigits(list,hm,original,c,s,i+1);
	}
	return list;
}*/
}