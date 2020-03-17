package stack;

public class StackImpl {
	protected int capacity;
	public static final int CAPASITY=10;
	int[] stack;
	int top=-1;
	
	public StackImpl() {
		this(CAPASITY);
	}

	public StackImpl(int customCapasity) {
      this.capacity = customCapasity;
      stack  = new int[capacity];
	}
	
	public int size() {
		return top+1;
	}
	
	public void push(int data) throws Exception{
		if(size() == capacity) throw new Exception("Stack is full");
		stack[++top] = data;
	}
	
	public boolean isEmpty() {
		return top < 0;
	}
	
	public int pop() throws Exception {
		int data;
		if(isEmpty()) throw new Exception("Stack is Empty");
		data = stack[top];
		stack[top--]= Integer.MIN_VALUE;
		return data;
	}
}
