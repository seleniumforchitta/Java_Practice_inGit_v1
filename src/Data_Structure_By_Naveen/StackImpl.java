package Data_Structure_By_Naveen;

public class StackImpl {
	
	int size;
	int arr[];
	int top;
	
	StackImpl(int size)
	{
		this.size = size;
		this.arr = new int[size]; // Integer Array
		this.top = -1;
	}
	
	//The time complexity for all the operation here : O[1] - because you need to perform one single operation, 
	//there is no for loop here.
	
	
	public void push(int element)
	{
		if(!this.isFull())
		{
			top++;
			arr[top]=element;
			System.out.println("pushed element : "+element);
		}
		else
		{
			System.out.println("Stack is Full now");
		}
	}
	
	public int pop()
	{
		if(!isEmpty())
		{
			int returnTop = top;
			top--;
			System.out.println("popped element : "+arr[returnTop]);
			return arr[returnTop];
		}
		else
		{
			System.out.println("Stack is Empty");
			return -1;
		}
	}
	
	public int peek()
	{
		if(!this.isEmpty())
		{
			return arr[top];
		}
		else 
		{
			System.out.println("Stack is Empty");
			return -1;
		}
	}
	
	public boolean isEmpty()
	{
		return (top == -1);
	}
	
	public boolean isFull()
	{
		return (size-1 == top);
	}
	

	public static void main(String[] args) {
		
		StackImpl stackImpl = new StackImpl(10);
		stackImpl.pop();
		System.out.println("-------------------");
		System.out.println(stackImpl.peek());
		stackImpl.push(100);
		stackImpl.push(200);
		stackImpl.push(300);
		stackImpl.push(400);
		System.out.println("-------------------");
		System.out.println(stackImpl.peek());
		stackImpl.pop();
		stackImpl.pop();
		stackImpl.pop();
		System.out.println("-------------------");
		System.out.println(stackImpl.peek());
		System.out.println("-------------------");
		System.out.println(stackImpl.isEmpty());
		System.out.println(stackImpl.isFull());
	}

}
