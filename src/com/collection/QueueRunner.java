package com.collection;

public class QueueRunner {
	public static void main(String[] args) {
		
		Queue q=new Queue();
		
		q.enQueue(5);
		q.enQueue(2);
		q.enQueue(7);
		q.enQueue(3);
		
//		q.deQueue();
//		q.deQueue();
		
		q.enQueue(1);
		q.enQueue(8);
		
		
		System.out.println("is Stack is Full : "+q.isFull());
		System.out.println("is Stack Empty : "+ q.isEmpty());
		
		System.out.println("Size : "+ q.getSize());
		q.show();
		
	}

}
