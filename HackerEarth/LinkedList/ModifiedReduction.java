import java.util.Scanner;
import java.lang.*;
import java.io.*;
class LinkedList
{
	Node head; 

	
	class Node
	{
		int data;
		Node next;
		Node(int d) {data = d; next = null; }
	}

	Node removeandmodify(Node head)
	{
			if(head == null)
			return head;
		Node temp = head;
		while(temp!=null && temp.next!=null)
		{
		int oldNum = temp.data;
		int count =1;
		while(temp.next!=null && temp.data==temp.next.data )
		{
			count++;
			temp=temp.next;
		}
		int newNum = count*oldNum;
		Node newHead = new Node(newNum);
		newHead.next = temp.next;
		head = newHead;
		temp.next = null;
		
		if(head.next!=null)
			if(head.data>head.next.data)
				head = mergeSort(head);
			else if(head.data==head.next.data)
			{
				temp=head;
				continue;
			}
			else {
				temp=temp.next;
						continue;
			}
		temp=head;
		}
		
		return head;
	
	}
	public Node mergeSort(Node h)  
    { 
        if (h == null || h.next == null) 
            return h; 
        Node middle = getMiddle(h); 
        Node nextofmiddle = middle.next; 
        middle.next = null; 
        Node left = mergeSort(h); 
        Node right = mergeSort(nextofmiddle); 
        Node sortedlist = sortedMerge(left, right); 
        return sortedlist; 
    } 
	
	public Node sortedMerge(Node a, Node b)  
    { 
        Node result = null; 
        if (a == null) 
            return b; 
        if (b == null)
        	return a;
        if (a.data <= b.data)  
        { 
            result = a; 
            result.next = sortedMerge(a.next, b); 
        }  
        else 
        { 
            result = b; 
            result.next = sortedMerge(a, b.next); 
        } 
        return result; 
    }
	
	public Node getMiddle(Node h)  
    { 
        if (h == null) 
            return h; 
        Node fast = h.next; 
        Node slow = h; 
        while (fast != null) 
        { 
            fast = fast.next; 
            if(fast!=null) 
            { 
                slow = slow.next; 
                fast=fast.next; 
            } 
        } 
        return slow; 
    }

	public void push(int new_data)
	{
	
		Node new_node = new Node(new_data);

		new_node.next = head;

		
		head = new_node;
	}

	void printList()
	{
		Node temp = head;
		while (temp != null)
		{
		System.out.print(temp.data+" ");
		temp = temp.next;
		} 
		System.out.println();
	}

	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in); 
        int t=sc.nextInt();
        while(t--!=0)
		{	
		LinkedList llist = new LinkedList();
	
        int n=sc.nextInt();
		int []arr;
		arr=new int[n];
		// int k=sc.nextInt();

		for(int i=n-1;i>=0;i--)
		{
		    arr[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++)
		{
			llist.push(arr[i]);
		}
		
		llist.head = llist.removeandmodify(llist.head);

		llist.printList();
		System.out.println(" ");
		}
		
	}
	
}