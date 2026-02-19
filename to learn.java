import java.util.*;
class Node {
	int data;
	Node prev;
	Node next;
	Node(int data) {
		this.data = data;
		prev=null;
		next=null;
	}

}

class Doublylinkedlist {
	Node head=null;
	Node tail=null;
	int size=0;

	void addatlast(int data) {
		Node newnode = new Node(data);
		size++;
		if(head==null) {
			head=tail=newnode;
		}
		else {
			newnode.prev=tail;
			tail.next=newnode;
			tail=newnode;
		}

	}

	void deleteatlast() {
		if(head==null) {
			System.out.println("There is no element to delete");
			return;
		}

		if(head==tail) {
			head=tail=null;
			System.out.println("All data deleted");
		}
		else {
			tail=tail.prev;
			tail.next=null;
		}
		size--;
	}
	void display() {
		Node temp = head;
		if(head==null) {
			System.out.println("There is no element to print");
			return;
		}
		while(temp!=null) {
			System.out.print(temp.data+" ");
			temp=temp.next;
		}
		System.out.println();

	}
}
public class Main {
	public static void main(String[] args) {
		Doublylinkedlist d = new Doublylinkedlist();
		d.addatlast(30);
		d.addatlast(40);
		d.display();
		d.deleteatlast();
		d.display();
		d.deleteatlast();
		d.display();
	}
}

import java.util.*;
class Node {
	int data;
	Node next;
	Node(int d) {
		data=d;
		next=null;
	}
}
class singlylinkedlist {
	int size=0;
	Node head=null;
	Node tail=null;
	void add(int data) {
		Node newnode = new Node(data);
		size++;
		if(head==null) {
			head=tail=newnode;
		}
		else {
			tail.next=newnode;
			tail=newnode;
		}
	}

	void deleteatlast() {
		if(head==null) {
			System.out.println("No element to delete");
			return;
		}
		Node temp=head;
		while(temp.next!=tail) {
			temp=temp.next;
		}
		tail=temp;
		tail.next=null;
		size--;

	}

	void deleteatbeg() {
		if(head==null) {
			System.out.println("No element to delete");
			return;
		}
		head = head.next;
		size--;
	}

	void deleteatpos(int pos) {
		if(pos<=0 || pos>size) {
			System.out.println("please enter a valid pos");
			return;
		}
		if(pos==1) {
			deleteatbeg();
			return;
		}
		if(pos==size) {
			deleteatlast();
			return;
		}

		Node temp = head;
		for(int i=1; i<pos-1; i++) {
			temp=temp.next;
		}
		Node temp1=temp.next;
		temp.next = temp1.next;
		size--;

	}



	void display() {
		Node temp = head;
		while(temp!=null) {
			System.out.print(temp.data+" ");
			temp = temp.next;
		}
		System.out.println();
	}
}
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		singlylinkedlist s  = new singlylinkedlist();
		s.add(10);
		s.add(20);
		s.add(30);
		s.add(40);
		s.display();
		s.deleteatlast();
		s.display();
		s.deleteatbeg();
		s.display();
		s.deleteatpos(9);
		s.display();

	}
}

import java.util.*;
class Node {
	int data;
	Node prev;
	Node next;
	Node(int data) {
		this.data = data;
		prev=null;
		next=null;
	}
}

class Doublylinkedlist {
	Node head=null;
	Node tail=null;
	int size=0;

	void addatlast(int data) {
		Node newnode = new Node(data);
		size++;
		if(head==null) {
			head=tail=newnode;
		}
		else {
			newnode.prev=tail;
			tail.next=newnode;
			tail=newnode;
		}

	}

	void search(int d) {
		if(head==null) {
			System.out.println("There is no data to search");
			return;
		}
		Node temp=head;
		while(temp!=null) {
			if(temp.data==d) {
				System.out.println("Data found");
				return;
			}
			temp=temp.next;
		}
		System.out.println("There is no data");
	}
	void updation(int pos,int d) {
		if(pos<=0 || pos>size) {
			System.out.println("Invalid pos");
			return;
		}
		if(pos==1) {
			head.data=d;
			return;
		}
		if(pos==size) {
			tail.data=d;
			return;
		}
		Node temp = head;
		for(int i=1; i<pos; i++) {
			temp=temp.next;
		}
		temp.data=d;

	}
	
		void display() {
		Node temp = head;
		if(head==null) {
			System.out.println("There is no element to print");
			return;
		}
		while(temp!=null) {
			System.out.print(temp.data+" ");
			temp=temp.next;
		}
		System.out.println();

	}
}
public class Main {
	public static void main(String[] args) {
		Doublylinkedlist d = new Doublylinkedlist();
		d.addatlast(10);
		d.addatlast(20);
		d.addatlast(30);
		d.addatlast(40);
// 		d.search(90);
		d.updation(2,200);
		d.display();
	}
}








