

import java.util.Scanner;
public class BeingZeroGraph {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int ne = sc.nextInt();
		sc.nextLine(); // Discard newline after ne
		String n1, n2;
		
		
		PrintGraphStringVertices g = new PrintGraphStringVertices(200);
		
		for(int i=0;i<ne;i++)
		{
			String inp[] = sc.nextLine().split(" ");
			n1 = inp[0];
			n2 = inp[1];
			//System.out.printf("INSERT EDGE BETWEEN %s and %s\n", n1, n2);
			g.insertEdge(n1, n2);
		}
		g.printGraph();
	}
}
