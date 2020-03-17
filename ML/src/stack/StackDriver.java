package stack;

public class StackDriver {
	public static void main(String[] rargs) {
		StackImpl stack = new StackImpl();
		try {
			stack.push(10);
			stack.push(20);
			stack.push(30);
			stack.push(40);
			stack.push(50);
			stack.pop();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println(stack.size());
	}
}
