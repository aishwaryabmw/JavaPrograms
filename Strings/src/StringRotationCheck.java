import java.util.Scanner;

public class StringRotationCheck{
 static boolean isRotation(String str1, String str2) 
 {
     return (str1.length() == str2.length()) && 
            ((str2+str2).contains(str1) ); 
 } 
 public static void main (String[] args) 
 { 
	 Scanner sc = new Scanner(System.in);
     int t=sc.nextInt();
	 while(t--!=0){
         String str1  = sc.next();
         String str2  = sc.next();
     if (isRotation(str1, str2)) 
         System.out.println("TRUE"); 
     else
         System.out.println("FALSE"); 
	 }
 } 
} 