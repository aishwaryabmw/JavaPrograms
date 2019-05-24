import java.util.*; 
class Test  
{ 
    static void decToBinary(int n) 
    { 
       
        int[] binNum = new int[1000]; 
        int i = 0; 
        while (n > 0)  
        { 
            binNum[i] = n % 2; 
            n = n / 2; 
            i++; 
        } 
        for (int j = i - 1; j >= 0; j--) 
            System.out.print(binNum[j]);
	}		
	public static void main (String[] args)  
    { 
         Scanner sc=new Scanner(System.in);
	int tc=sc.nextInt();
	    int n;
	    while(tc>0)
	    {
	        n=sc.nextInt();
            decToBinary(n); 
			System.out.println();
	        tc--;
	    }
    } 
} 