import java.util.Scanner;

public class ReverseArrayInGroup {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in); 
		 int tc = sc.nextInt();
		while(tc>0)
		{
			int n = sc.nextInt();
	         int a[]=new int[n];
			for(int i=0;i<n;i++)
			{
				a[i]=sc.nextInt();
			}
			int rev=sc.nextInt();
			int temp,j,size,starti=0,endi=0;
			if(n%rev==0)size = (n/rev);
			else size = (n/rev)+1;
			for(int k=0;k<size;k++) {
				endi=starti+rev-1;
				if(endi>=n)
					endi = n-1;
				System.out.println(starti+" starti "+endi);
				j=endi;
							for(int t=starti;t<=endi;t++)
							{
								temp = a[t];
								a[t]=a[j];
								a[j]=temp;
								
								System.out.println("");
								if((endi-starti+1)%2!=0)
								{
									if(t==j)break;
								} else
									{
										if(j==(t+1))break;
									}
								j--;
					    					
							
						     }
				if(endi==(n-1))break;
				starti=endi+1;
						   
						}  
		for(int i=0;i<n;i++)
		{
			
			System.out.print(a[i]+ " ");
			  
		} 
		System.out.println(" ");
		   
		    tc--;
		}
		 

	}

}
