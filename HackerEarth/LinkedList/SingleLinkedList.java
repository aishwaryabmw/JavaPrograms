import java.util.Scanner;
public class SingleLinkedList {
	
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
	ListNode deleteNode(ListNode head,int data)
	{
		if(head==null)
			return head;
		ListNode temp=head;
		ListNode prev=temp;
		while(temp!=null)
		{
			if(temp.data==data)
			{
				if (temp==head)
				{
					 if(temp.next==null)
					head=null;
					 else
					 {
						 head=head.next;
						 temp.next=null;
						 return head;
					 }
				}
				prev.next=null;
				if(temp.next!=null)
				{
					prev.next=temp.next;
					temp.next=null;
				}
				return head;
			}
			else
				if(temp.next!=null)
				{
					prev=temp;
					temp=temp.next;
				}
				else return head;
		}
		return head;
	}
	void printList(ListNode head)
	{
		if(head==null)
		{
			return;
		}
		ListNode temp=head;
		while(temp!=null)
		{
			System.out.print(temp.data+" ");
			temp=temp.next;
		}
								
	}

	public static void main(String[] args) {
		SingleLinkedList sll= new SingleLinkedList();
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
			//sll.printList(head);
			//System.out.println("Enter delete element");
			int data=sc.nextInt();
			head=sll.deleteNode(head, data);
			sll.printList(head);
			System.out.println();
			tc--;
		}
		
	}
}
