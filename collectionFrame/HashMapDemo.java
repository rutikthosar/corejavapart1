package collectionFrame;

import java.util.HashMap;

public class HashMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		hm.put(1, "JSP");
		hm.put(2, "HTML");
		
		hm.putIfAbsent(4, "JAVA");
		System.out.println("Hashmap: "+hm);
		hm.putIfAbsent(3, "Python");
		System.out.println("Updated Hashmap: "+hm);
		System.out.println(hm.containsKey(5));
		hm.replace(1, "Swift");
		System.out.println(hm);

	}

}
