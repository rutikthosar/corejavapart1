package collectionFrame;

import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> ll = new LinkedList<>();
		ll.add("Karjat");
		ll.add("Neral");
		ll.add("Badlapur");
		ll.add("Khopoli");
		ll.add("Kalyan");
		System.out.println(ll);
		ll.add("Shelu");
		System.out.println("After adding the element"+ll);
		String str = ll.get(0);
		System.out.println("Element at index 1:"+str);
		ll.set(2, "Dombivali");
		System.out.println("Updated LinkedList:"+ll);
		

	}

}
