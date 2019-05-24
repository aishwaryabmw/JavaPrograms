/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class SecondmostRepeating {
	public static void main (String[] args) {
		//code
		Scanner sc = new Scanner(System.in);
		int tc = sc.nextInt();
		HashMap<String,Integer> h = new HashMap<>();
		while(tc-->0)
		{
		    int n = sc.nextInt();
		    for(int i=0;i<n;i++)
		    {
    		    String s = sc.next();
    		    
    		    if(!h.containsKey(s))
    		        h.put(s,1);
    		    else
    		    	h.put(s,h.get(s)+1);
		    }
		    int max1=-1,max2=-1;
		    //Set<String> keys= map.keySet();
		    String k="",k1="";
           // for(String key:keys)
            for (Map.Entry<String, Integer> entry : h.entrySet()) 
            {
                if(entry.getValue()>max1)
                {
                    max2=max1;
                    k1=k;
                    max1=entry.getValue();
                    k=entry.getKey();
                }
            }
            	System.out.println(h.get(k1));
		    
		    
		}
	}

	
}