import java.util.*;

public class PrimeProbability{
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        primeProbability(n);
     }
     static void primeProbability(int n)
     {
         int countP = 0;
         for(int i=2;i<=n;i++)
         {
             int f=0;
             for(int j=2;j<=i/2;j++)
             {
                 if(i%j==0)
                 {
                     f++;
                    break;
                 }
             }
             if(f==0)countP++;
         }
         int gcm=1;
         if(countP>0)
          gcm = gcmNums(countP, n-1);
         if(countP==0)
            System.out.println("0/1");
        else
            System.out.println(countP/gcm +"/"+(n-1)/gcm);
            
    }
     static int gcmNums(int a,int b)
     {
        return b == 0 ? a : gcmNums(b, a % b);
     }
}