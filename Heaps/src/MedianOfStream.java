import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;

public class MedianOfStream {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int tc = sc.nextInt();
		while(tc--!=0)
		{
		int n = sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
			a[i]=sc.nextInt();
			getMedians(a);
		}
		System.out.println();
	}

	 static void getMedians(int[] a) {
		 PriorityQueue<Integer> min = new PriorityQueue<>();
		 PriorityQueue<Integer> max = new PriorityQueue<>(new Comparator<Integer>() {
			 public int compare(Integer a,Integer b) {
				 return -1*a.compareTo(b);
			 }
		 });
		 double m[]=new double[a.length];
		 for(int i=0;i<a.length;i++)
		 {
			 if(i>=1)
		 addToHeap(m[i-1],a[i],min,max);
			 else
		addToHeap(0,a[i],min,max);
		 balanceHeap(min,max);
		 m[i] = getMedianOfStream(min,max);
		 }
		 for(int i=0;i<a.length;i++)
		 {
			 System.out.printf("%.2f",m[i]);
			 System.out.print(" ");
		 }
		 System.out.println();
	}
	 
	 static double getMedianOfStream(PriorityQueue<Integer> min, PriorityQueue<Integer> max) {
		 if(min.size()==max.size())
			 return ((double)min.peek()+max.peek())/2;
		 if(min.size()>max.size())
			 return min.peek();
		 else 
			 return max.peek();
	}
	 
	 static void addToHeap(double currMedian,int num, PriorityQueue<Integer> min, PriorityQueue<Integer> max) {
		  if(min.size()==0 || num>currMedian)
			  min.add(num);
		  else
			  max.add(num);
	}

	   static void balanceHeap(PriorityQueue<Integer> min, PriorityQueue<Integer> max) {
		if(max.size() - min.size()>=2)
			min.add(max.poll());
		else if(min.size()-max.size()>=2)
			max.add(min.poll());
	}

	

	
}
