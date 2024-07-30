package CollectionsPractice;

import java.util.LinkedList;
import java.util.Queue;

public class queuePractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<Integer> myQueue = new LinkedList<>();
		myQueue.add(1);
		myQueue.offer(2);
		System.out.println(myQueue.offer(3));
		
		System.out.println(myQueue.peek());
		
//		myQueue.peek();
		System.out.println(myQueue);
		
//		myQueue.remove();
		int x = myQueue.poll();
		System.out.println("removed element is "+x);
		
		System.out.println(myQueue);
//		System.out.println(myQueue.isEmpty());
//		System.out.println(myQueue.poll());

	}

}
