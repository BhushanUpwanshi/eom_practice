package com.app.eom_practice;

import java.util.HashSet;
import java.util.Stack;

public class LinkedList {
	private Node head;
	private int length;

	public LinkedList() {
		this.head = null;
		this.length = 0;
	}

	public boolean insert(int data) {
		Node newNode = new Node(data);
		if (newNode == null)
			return false;

		if (head == null) {
			head = newNode;
			length++;
			return true;
		}
		Node temp = head;
//		if(head.getData()==data)
//			return false;

		while (temp.getNext() != null) {
			temp = temp.getNext();
//			if(temp.getData()==data)
//				return false;
		}
		temp.setNext(newNode);
		length++;
		return true;
	}

	public void display() {
		Node temp = head;

		while (temp != null) {
			System.out.print(temp.getData() + " ");
			temp = temp.getNext();
		}
		System.out.println();
	}

//	1.Java Program To Merge A Linked List Into Another Linked List At Alternate Positions
	public static LinkedList merge(LinkedList l1, LinkedList l2) {
		LinkedList l3 = new LinkedList();

		Node temp1 = l1.head;
		Node temp2 = l2.head;
		while (temp1 != null || temp2 != null) {
			if (temp1 != null) {
//				System.out.print(temp1.getData()+" ");
				l3.insert(temp1.getData());
				temp1 = temp1.getNext();
			}
			if (temp2 != null) {
//				System.out.print(temp2.getData()+" ");
				l3.insert(temp2.getData());
				temp2 = temp2.getNext();
			}
		}
		return l3;
	}

//	2.How do you find the middle element of a singly linked list in one pass? 
	public void middle() {
		Node temp = head;
		Stack<Integer> stk = new Stack<Integer>();
		while (temp != null) {
			stk.push(temp.getData());
			temp = temp.getNext();
		}
//		Stack<Integer> stk1=new Stack<Integer>();
		Stack<Integer> stk2 = new Stack<Integer>();
//		System.out.println("stk.size() "+stk.size()+" stk2.size() "+stk2.size());
		while (stk2.size() < stk.size())
			stk2.push(stk.pop());
//		System.out.println("stk.size() "+stk.size()+" stk2.size() "+stk2.size());
		if (stk2.size() == stk.size()) {
			System.out.println("Middle Element :" + stk.pop() + " and " + stk2.pop());
		} else
			System.out.println("middle element is : " + stk2.pop());
	}

	public void middle1() {
		Node temp = head;
		Stack<Integer> stk = new Stack<Integer>();
		Stack<Integer> stk2 = new Stack<Integer>();

		while (temp != null) {
			stk.push(temp.getData());
			temp = temp.getNext();
		}

		while (stk.size() > stk2.size())
			stk2.push(stk.pop());

		if (stk.size() == stk2.size())
			System.out.println("middle elements are : " + stk.pop() + " and " + stk2.pop());
		else
			System.out.println("middle element is : " + stk2.pop());
	}

//	3.How do you reverse a singly linked list without recursion? 
	public static void revR(Node temp) {
		if (temp == null)
			return;
		revR(temp.getNext());
		System.out.print(temp.getData() + " ");
	}

	public void reverse() {
		Node temp = head;
		revR(temp);
		System.out.println();
	}

	public static void rev(LinkedList l) {
		System.out.println("reverse without recusrssion : ");
		Node temp = l.head;
		Stack<Integer> stk = new Stack<Integer>();
		while (temp != null) {
			stk.push(temp.getData());
			temp = temp.getNext();
		}

		while (!stk.empty()) {
			System.out.print(stk.pop() + " ");
		}
		System.out.println();
	}

//	4.How are duplicate nodes removed in an unsorted linked list? 
	public static LinkedList noDups(LinkedList l1) {
		Node temp = l1.head;
		LinkedList l2 = new LinkedList();
		HashSet<Integer> hs = new HashSet<>();

		while (temp != null) {
			if (!hs.contains(temp.getData())) {
				hs.add(temp.getData());
				l2.insert(temp.getData());
			}
			temp = temp.getNext();
		}
		return l2;
	}

//	5.How do you find the length of a singly linked list? 
	public void lingth() {
		Node temp = head;
//		Stack<Node> s=new Stack<Node>();

		HashSet<Node> hs = new HashSet<Node>();

		while (temp != null) {
			hs.add(temp);
//			s.push(temp);
			temp = temp.getNext();
		}
		System.out.println("Size of list is : " + hs.size());
	}

//	6.How to remove duplicates from a sorted linked list?
	public void noDupSort() {
		Node temp = head;
		while (temp != null) {
//			System.out.print(temp.getData()+" ");

			if (temp.getData() != temp.getNext().getData()) {
				System.out.print(temp.getData() + " ");
			}
			temp = temp.getNext();
			if (temp.getNext() == null) {
				System.out.print(temp.getData() + " ");
				return;
			}
		}
	}

//	7.How do you reverse a linked list? 
	public void reverN() {
		if (head == null || head.getNext() == null) {
			return;
		}

		Node n1 = head;
		Node n2 = n1.getNext();

		while (n2 != null) {
			Node n3 = n2.getNext();
			n2.setNext(n1);
			n1 = n2;
			n2 = n3;
		}
		head.setNext(null);
		head = n1;
	}

//	8.How do you find the third node from the end in a singly linked list? 
	public void thierLast() {
		Node thirdLast = head;
		while (thirdLast.getNext().getNext().getNext() != null) {
			thirdLast = thirdLast.getNext();
		}
		System.out.println("thirdLast" + thirdLast + "thirdLast.getData()" + thirdLast.getData());
	}

//	9.How to remove Nth Node from the end of a linked list? 
	public void delLastNth(int pos) {
		Node last = head;
		Node del = head;
		Node prev = head;

		int len = 0;
		while (last != null) {
			last = last.getNext();
			len++;
		}
		for (int i = 0; i < (len - pos); i++) {
			prev = del;
			del = del.getNext();
		}
		prev.setNext(del.getNext());
	}

//	10.How to merge two sorted linked list? 
	public static void mergeSorted(LinkedList l1, LinkedList l2) {
		Node temp1 = l1.head;
		Node temp2 = l2.head;
		LinkedList l3 = new LinkedList();

		while (temp1 != null || temp2 != null) {
			if (temp1 != null && temp2 != null) {
				if (temp1.getData() < temp2.getData()) {
					l3.insert(temp1.getData());
					temp1 = temp1.getNext();
				} else {
					l3.insert(temp2.getData());
					temp2 = temp2.getNext();
				}
			}
			if (temp1 != null && temp2 == null) {
				l3.insert(temp1.getData());
				temp1 = temp1.getNext();
			}
			if (temp1 == null && temp2 != null) {
				l3.insert(temp2.getData());
				temp2 = temp2.getNext();
			}
		}

		l3.display();
	}

//	11.How to add an element at the middle of the linked list?
	public void addMiddle(Node newNode) {
		Node prev = head;
		Node temp = head;

		for (int i = 0; i < (this.length / 2); i++) {
			prev = temp;
			temp = temp.getNext();
		}
		newNode.setNext(temp);
		prev.setNext(newNode);
	}

//	12.How do you sort a linked list in Java?
	public void sort() {

	}

//	1.Given a linked list and a value x, partition 
//	it such that all nodes less than x come before nodes greater than or equal to x. 

	public void lessThanX(int x) {
		Node temp = head;
		Node prev = head;
		Node newNode = new Node(x);
		Stack<Node> s = new Stack<Node>();
		while (temp != null) {
			if (temp.getData() >= x) {
				prev.setNext(temp.getNext());
				s.push(temp);
			} else
				prev = temp;
			temp = temp.getNext();
		}
		while (!s.empty()) {
//			this.insert(s.pop().getData());
			prev.setNext(s.pop());
			prev = prev.getNext();
			prev.setNext(null);
		}

		this.display();
	}

//	2.How to remove all elements from a linked list of integers 
//	which matches with given value? 
	public void removeElem(int val) {
		Node temp = head;
		Node prev = head;
		if (head.getData() == val) {
			head = head.getNext();
		}
		while (temp != null) {
			if (temp.getData() == val) {
				prev.setNext(temp.getNext());
				temp = temp.getNext();
			} else {
				prev = temp;
				temp = temp.getNext();
			}
		}
		display();
	}

//	3.How to find the node at which the intersection of two singly linked lists begins.

//	4.How to check if a given linked list is a palindrome? 
	public void isPalindrome() {
		Node temp = head;
		Stack<Integer> s = new Stack<Integer>();
		for (int i = 0; i < (length / 2); i++) {
			s.push(temp.getData());
			temp = temp.getNext();
		}
		for (int i = (length / 2); i < length; i++) {
			if (s.pop() != temp.getData()) {
				System.out.println("Not a palindrome : ");
				return;
			}
			temp = temp.getNext();
		}
		System.out.println("Its a palindrome ");
	}

}
