package Collections;

import java.util.*;

public class QueueDemo {

	public static void main(String[] args) {
		Queue<Integer>q1=new PriorityQueue();
		q1.add(10);
		q1.add(20);//adds ele n when queue is full throws exception
		q1.offer(45);//adds ele n when queue is full returns false
		q1.add(30);
		q1.add(40);
		System.out.println(q1);
		System.out.println(q1.peek());//returns head ele n when queue is full returns null
		System.out.println(q1.element());//returns head ele n when queue is full throws exception
		System.out.println(q1.poll());//returns and remove head ele n when queue is full returns null
        System.out.println(q1.remove());//returns and remove head ele n when queue is full throws exception
		System.out.println(q1);
        System.out.println(q1);
	}

}