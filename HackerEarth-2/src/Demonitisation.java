import java.util.*;
class demonitisation{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n%100!=0)
        {
        System.out.println("please enter only multiples of 100");
        return;
        }
        else
        noOfNotes(n);
    }
    static void noOfNotes(int n)
    {
        int n1=0,n2=0,n3=0;
        if(n>=2000)
        {
            n1 = n/2000;
            if(n%2000!=0)
            {
                if(n>=500)
                {
                    n2=(n%2000)/500;
                }
                if(n%500!=0)
                {
                    if(n>=100)
                    n3 = (n%2500)/100;
                }
                
            }
        }
        else if(n>=500)
        {
            n2=n/500;
            if(n%500!=0)
                {
                    if(n>=100)
                    n3 = (n%500)/100;
                }
        }
        else
        {
            n3 = n/100;
        }
        System.out.println(n1+","+n2+","+n3);
    }
}