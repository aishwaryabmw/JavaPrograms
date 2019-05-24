import java.util.*;
public class MaximunElement {
	
    public static void main(String[] args) {
    	stackOperations();
    }
    static void stackOperations()
    {
    	Scanner sc=new Scanner(System.in);
    	int n = sc.nextInt(); 
    	Stack<Integer> stack = new Stack<Integer>();
    	Stack<Integer> trackStk = new Stack<Integer>();

    	while(n>0)
        {
        	int op=sc.nextInt();
        	switch(op)
        	{
        		case 1:    	int k=sc.nextInt();
        			stack.push(k);
        		        if (stack.size() == 1) 
        		        { 
        		            trackStk.push(k); 
        		            n--;
        		            continue; 
        		        } 
        		   
        		         if (k > trackStk.peek()) 
        		            trackStk.push(k); 
        		        else
        		            trackStk.push(trackStk.peek()); 
        			break;
        		case 2: 
        	        trackStk.pop(); 
        			stack.pop();
        			break;
        		case 3:System.out.print(trackStk.peek()+" ");
        			break;
        	}
        	n--;
        }
    	
    }
}