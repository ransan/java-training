package stack;

import java.util.Stack;

public class SymbolBalancer {
	public static void main(String[] args) {
		String pattern = "[]";
		if(isValidSymbol(pattern)) System.out.println("Balanced");
		else System.out.println("Not Balanced");
		
	}
	
	private static boolean isValidSymbol(String pattern) {
		Stack<Character> stack = new Stack<>();
		for(int i=0;i<pattern.length();i++) {
			if(pattern.charAt(i) == ')') {
				if(!stack.isEmpty() && stack.peek() == '(') {
					stack.pop();
				} else 
					return false;
			} else if(pattern.charAt(i) == '}') {
				if(!stack.isEmpty() && stack.peek() == '{') {
					stack.pop();
				} else return false;
			} else if(pattern.charAt(i) == ']') {
				if(!stack.isEmpty() && stack.peek() == '[') {
					stack.pop();
				} else return false;
			} else {
				stack.push(pattern.charAt(i));
			}
		}
		if(stack.isEmpty()) return true;
		else return false;
	}
}
