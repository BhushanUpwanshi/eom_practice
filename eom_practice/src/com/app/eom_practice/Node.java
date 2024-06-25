package com.app.eom_practice;

public class Node {
	private Node next;
	private int data;
	
	public Node(int data) {
		this.data=data;
		this.next=null;
	}

	public Node getNext() {
		return next;
	}

	public void setNext(Node node) {
		this.next = node;
	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}
	
	
}
