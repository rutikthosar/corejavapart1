package collectionFrame;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class QueueDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<Integer> q = new LinkedList<>();
		System.out.println("Poll method "+q.poll());
		q.add(20);
		q.add(21);
		q.add(23);
		System.out.println("Elements :"+q);
		System.out.println("Poll Method :"+q.poll());
		System.out.println("Peek Method :"+q.peek());
		System.out.print("Queue traversing using Iterator: ");
		Iterator itr = q.iterator();
		while(itr.hasNext()) {
			System.out.print(itr.next()+" ");
		}
		
	}

}
