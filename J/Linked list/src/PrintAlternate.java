import java.util.Scanner;

public class PrintAlternate {
	
	static class ListNode{
		ListNode head;
		int data;
		ListNode next;
		ListNode(int data)
		{
			this.data=data;
		}
	}
	ListNode insertAtEnd(ListNode head,int data)
	{
		ListNode newNode=new ListNode(data);
		if(head==null)
		{
			head=new ListNode(data);
			return head;
		}
		ListNode temp=head;
		while(temp.next!=null)
			temp=temp.next;
		temp.next=newNode;
		return head;
	}
	
	void printList(ListNode temp)
	{
		if (temp==null)return;
		System.out.print(temp.data+" ");
		if(temp.next==null||temp.next.next==null) return;
		printList(temp.next.next);
	}
	
		public static void main(String[] args) {
		PrintAlternate sll= new PrintAlternate();
		Scanner sc=new Scanner(System.in);
		int tc=sc.nextInt();
		while(tc>0)
		{
			ListNode head=null;
			int n=sc.nextInt();
			while(n>0)
			{
				//System.out.println("Enter data");
				int data=sc.nextInt();
				ListNode Node=new ListNode(data);
				head=sll.insertAtEnd(head,data);
				n--;
			}
			sll.printList(head);
			System.out.println();
			tc--;
		}
		
	}
}
