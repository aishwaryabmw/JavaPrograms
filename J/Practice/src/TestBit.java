import java.io.*;
import java.lang.*;

class TestBit {
    
   static void printRepeatedAndMissingElement(int arr[]) {
	int xor=0;	
  int sum = (arr.length)*(arr.length+1)/2;
  int sumArr=0;
  for(int i=1;i<=arr.length;i++)
    {
      xor=xor^(arr[i-1])^(i);
    	sumArr+=arr[i-1];
    }
  int m = (xor&(-xor));
  int n1=0,n2=0;
  for(int i=0;i<=arr.length-1;i++)
    {
          if(((arr[i])^m)==0)
          {
            n1=(n1^arr[i]);
          
          }
    	else
    	{
            n2=(n2^arr[i]);
          
    	}
    }
  for(int i=1;i<=arr.length;i++)
  {
    if((i&m)==0)
      n1^=i;
    else
      n2^=i;
  }
  
    
  if(sum==(sumArr+n1-n2))
    System.out.println(n2 +" " +n1);
  else
    System.out.println(n1 +" " +n2);
    
    
}
	public static void main (String[] args) {
	    int a[]={3,1,2,5,3};
	    printRepeatedAndMissingElement(a);
	}
}