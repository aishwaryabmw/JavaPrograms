
public class SelectionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int num[]= {59,2,3341,5,1},temp;
			for(int i=0;i<num.length;i++)
			{
				for(int j=i+1;j<num.length;j++)
				{
					if(num[i]>num[j])
					{
						temp=num[i];
						num[i]=num[j];
						num[j]=temp;
					}
				}
			}
			for(int i=0;i<num.length;i++)
			System.out.println(num[i]);
	}

}
