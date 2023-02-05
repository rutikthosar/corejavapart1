package collectionFrame;

import java.util.LinkedList;

public class SearchLinkedListElmt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Integer> ll = new LinkedList<>();
		ll.add(7);
		ll.add(11);
		ll.add(17);
		ll.add(21);
		ll.add(16);
		
		int element = 21;
		int ans = -1;
		for(int i = 0; i<ll.size(); i++) {
			int llElement = ll.get(i);
			if(llElement == element) {
				ans = i;
				break;
			}
		}
		if(ans == -1) {
			System.out.println("Element not found");
		}
		else {
			System.out.println("Element found at index "+ans);
		}

	}

}
