import java.util.Scanner;
public class IsStringRotation {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
         while(t--!=0){
            String str  = sc.next();
            String rotStr  = sc.next();
            int k=0;
            if(rotStr.length()!=str.length())
            	{
                	System.out.println("FALSE");
            		return;
            	}
            if(str.length()==0) return;
            int i=0;
            for(int j=0;i<str.length();j=(j+1)%str.length())
            {
            	if(i==0 && str.charAt(0)==rotStr.charAt(j))
            	{
            		i++;
            		k++;
            		continue;
            	}
            	if(i>0) 
            	{
            		if(str.charAt(i)==rotStr.charAt(j))
            		{
            		k++;
            		i++;
            		}
            		else
                		break;
              	
            	}
            	if(i==0&&j==str.length()-1)
            		break;
            }
            if(k==str.length())
            System.out.println("TRUE");
            else
                System.out.println("FALSE");
	}
         sc.close();
	}
}