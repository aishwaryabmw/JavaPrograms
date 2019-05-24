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
	
	static ListNode reverse(ListNode head)
	{
		ListNode prev = null;
		ListNode curr=head;
		ListNode nxt=curr.next;
		while(nxt!=null)
		{
			curr.next=prev;
			prev=curr;
			curr=nxt;
			nxt=curr.next;
		}
		curr.next=prev;
		return curr;
	}
	static void reverseK(ListNode head,int k,int count)
	{
		if(k==0) return;
			head=reverseKHelper(head,k-1);
		
			printList(head);
			reverseK(head,k-1,count);
		
	}
	static ListNode reverseKHelper(ListNode head,int count)
	{
		ListNode prev = null;
		ListNode curr=head;
		ListNode nxt=curr.next;
		while(count!=0)
		{
			curr.next=prev;
			prev=curr;
			curr=nxt;
			nxt=curr.next;
			count--;
		}
		curr.next=prev;
		return curr;
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
	
	static ListNode findMiddle(ListNode head)
	{
		if(head==null)
		    return head;
			ListNode mid = head;
			ListNode fast = head;
			int count=0;
			  while(fast.next!=null)
			  {
			    if(count%2!=0)
			      mid=mid.next;
			      count++;
			    fast=fast.next;
			    
			  }
			   return mid;
	}
	static void printList(ListNode head)
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
		int n,num;
		while(tc>0)
		{
			ListNode head=null;
			n=sc.nextInt();
			num=n;
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
			//int data=sc.nextInt();
			//head=sll.deleteNode(head, data);
			//ListNode mid=findMiddle(head);
			//System.out.println(mid.data+" = middle noe");
			//head=reverse(head);
			int k = sc.nextInt();
			
				reverseK(head,k,num);
			
			sll.printList(head);
			System.out.println();
			tc--;
		}
		
	}
}
