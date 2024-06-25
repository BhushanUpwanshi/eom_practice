package com.app.eom_practice;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList l1=new LinkedList();
//		l1.insert(100);
		l1.insert(60);
		l1.insert(40);
		l1.insert(30);
		
		int i=200;
		while(i<300) {
			l1.insert(i);
			i+=10;
		}
		
		l1.display();
		LinkedList l2=new LinkedList();
		i =300;
		while(i<400) {
			l2.insert(i);
			i+=10;
		}
		l2.display();
		
		LinkedList l3=LinkedList.merge(l1, l2);
		System.out.println("---------------");
		l3.display();
		
		l1.middle();
		l2.middle();
		l3.middle();
		System.out.println("---------------");
		l1.middle1();
		l2.middle1();
		l3.middle1();
		System.out.println("---------------");
		l1.display();
		l1.reverse();
		
		LinkedList.rev(l1);
		LinkedList l5=new LinkedList();
		l5.insert(60);
		l5.insert(40);
		l5.insert(30);
		l5.insert(200);
		l5.insert(60);
		l5.insert(40);
		l5.insert(30);
		l5.insert(200);
		System.out.println("---------------");
		l5.display();
		System.out.println("No dups : ");
		LinkedList l4= LinkedList.noDups(l5);
		l4.display();  
		
		l4.lingth();
		l5.lingth();
		
		LinkedList l6 = new LinkedList();
		l6.insert(1);
		l6.insert(2);
		l6.insert(2);
		l6.insert(4);
		l6.insert(4);
		l6.insert(6);
		l6.insert(8);
		l6.noDupSort();
		
		LinkedList l7 = new LinkedList();
		l7.insert(3);
		l7.insert(5);
//		l7.insert(7);
//		l7.insert(9);
		l7.insert(5);
		l7.insert(3);

		System.out.println("---------------");
		l1.thierLast();
		l5.thierLast();
		l5.display();
		l5.delLastNth(6);
		l5.display();
		
		LinkedList.mergeSorted(l6, l7);
		System.out.println("---------------");
		l6.display();
		l6.addMiddle(new Node(20));
		l6.display();
		System.out.println("---------------");
		l7.display();
//		l7.addMiddle(new Node(20));
		l7.display();
		
		System.out.println("---------------");
		l3.display();
		l3.lessThanX(230);
		System.out.println("---------------");
		l6.display();
		l6.removeElem(4);
		l7.display();		
		l7.isPalindrome();
		l6.isPalindrome();
	}

}
