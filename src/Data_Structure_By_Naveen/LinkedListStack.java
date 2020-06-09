package Data_Structure_By_Naveen;

public class LinkedListStack {
	
	Node head;
	
	class Node {
		int value;
		Node next;
	}
	
	LinkedListStack() 
	{
		head = null;
	}
	
	//push : Add value to the beginning of the list
	public void push(int value)
	{
		Node extraHead = head; // Head assigned to the extraNode
		head = new Node(); // A new node is created and assigned to head
		head.value = value; // Value that is pased, assigned to head.value
		head.next = extraHead; // & extra node assigned to head.next
		System.out.println(value+" is Pushed to the stack.");
	}
	
	public int pop()
	{
		if(head==null)
		{
			System.out.println("Stack is Empty");
		}
		
		int value = head.value;
		head = head.next;
		return value;
	}
	
	public static void printList(Node head)
	{
		Node temp = head;
		while(temp!=null)
		{
			System.out.println(temp.value+" ");
			temp = temp.next;
		}
	}
	
	public static void main(String[] args) {
		
		LinkedListStack lis = new LinkedListStack();
		//System.out.println(lis.pop());
		
		lis.push(10);
		lis.push(20);
		lis.push(30);
		lis.push(40);
		lis.push(50);
		
		System.out.println("Element removed or popped from the stack is : "+lis.pop());
		System.out.println("Element removed or popped from the stack is : "+lis.pop());
		
		lis.push(60);
		System.out.println("Element removed or popped from the stack is : "+lis.pop());
		
		printList(lis.head); 
		
	}
	
	
	


}
