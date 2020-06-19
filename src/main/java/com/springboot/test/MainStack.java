package com.springboot.test;

class Stack {
	static final int MAX=1000;
	int top;
	int a[]=new int[MAX];
	
	Stack() {
		top=-1;
	}
	
	boolean isEmpty() {
		return (top<0);
	}
	
	boolean push(int x) {
		if(top>=(MAX-1)) {
			return false;
		}
		else {
			a[++top] =x;
			System.out.println("Pushed into stack");
			return true;
		}
	}
	int pop() {
		if(top<0) {
			System.out.println("Stack Underflow");
			return 0;
		}else {
			int x=a[top--];
			System.out.println(x);
			return x;
		}
	}
	int peek() {
		if(top<0) {
			System.out.println("Stack is underflow");
			return 0;
		}else {
			int x =a[top];
			return x;
		}
	}
}

public class MainStack {

	public static void main(String[] args) {
		Stack s = new Stack();
		s.push(5);
		s.push(6);
		s.push(7);
		s.pop();
		System.out.println("peek vale "+s.peek());
		System.out.println("isEmpty "+s.isEmpty());
	}
}
