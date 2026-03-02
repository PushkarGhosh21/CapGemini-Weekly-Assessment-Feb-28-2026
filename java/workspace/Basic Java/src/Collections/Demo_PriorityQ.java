package Collections;

import java.util.PriorityQueue;

public class Demo_PriorityQ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PriorityQueue<Integer>pq=new PriorityQueue<>();
		pq.offer(100);
		pq.offer(-600);
		pq.offer(0);
		pq.offer(250);
		System.out.println(pq);
		System.out.println(pq.poll());
		System.out.println(pq);
		System.out.println(pq.poll());
		System.out.println(pq);
		System.out.println(pq.poll());
		System.out.println(pq);
		System.out.println(pq.poll());
		System.out.println(pq);
		

	}

}
