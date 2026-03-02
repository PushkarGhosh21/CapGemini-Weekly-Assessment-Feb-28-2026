package Collections;

import java.util.ArrayDeque;
import java.util.Deque;

public class Demo_Dequeue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Deque<Integer>pq=new ArrayDeque<Integer>();
		pq.offerFirst(100);
		pq.offerLast(-600);
		pq.offerLast(0);
		pq.offerFirst(250);
		pq.offer(0);
		System.out.println(pq);
		
		

	}

}
