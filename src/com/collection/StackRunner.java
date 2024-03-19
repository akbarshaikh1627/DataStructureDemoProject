package com.collection;

public class StackRunner {
	
	public static void main(String[] args) {
		
		Stack nums= new Stack();
		
		nums.push(15);
		nums.push(8);
		nums.push(10);
		nums.push(36);
		nums.push(64);
		//nums.push(85);
		
		System.out.println(nums.pop());
		//System.out.println(nums.peek());
		
		System.out.println("size is " + nums.size());
		nums.show();
	}

}
