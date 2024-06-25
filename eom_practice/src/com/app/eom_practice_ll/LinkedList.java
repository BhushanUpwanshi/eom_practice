package com.app.eom_practice_ll;

public class LinkedList {
	private Node head;
	private Node tail;
	private int length;
	public LinkedList() {
		this.head = null;
		this.length = 0;
		
	}
	
	public boolean insert(int data) {
		Node newNode=new Node(data);
		if(newNode==null) {
			return false;
		}
		if(head==null) {
			this.head= newNode;
			length++;
			return true;
		}
		if(head.getData()==data) {
			return false;
		}
		
		Node temp=head;
		while(temp.getNext()!=null) {
			temp=temp.getNext();
			if(temp.getData()==data)
				return false;
		}
		temp.setNext(newNode);
		length++;
		return true;
	}
	
	public void display() {
		Node temp=head;
		while(temp!=null) {
			System.out.print(temp.getData()+" ");
			temp=temp.getNext();
		}
		System.out.println();
	}
	
	public void inserAt(int pos,int data) {
		Node temp=head;
		Node prev=head;
		
		for(int i=0;i<pos;i++) {
			
		}
	}
}
