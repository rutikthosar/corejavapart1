package collectionFrame;

import java.util.Stack;

public class StackDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer> s = new Stack<Integer>();
		s.push(7);
		s.push(9);
		s.push(16);
		s.push(21);
		s.push(46);
		s.push(69);
		System.out.println("Elements: "+s);
		s.pop();
		System.out.println("After performing pop: "+s);
		System.out.println("Head: "+s.peek());
		if(s.isEmpty()) {
			System.out.println("True");
		}
		else {
			System.out.println("False");
		}
	}

}
