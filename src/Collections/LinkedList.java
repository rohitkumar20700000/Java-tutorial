package Collections;

public class LinkedList<T> {
	Node head;
	class Node{
		T data;
		Node next;
		Node(T val){
			data=val;
			next=null;
		}
		
	}
	LinkedList(){
		head=null;
	}
	public void insertAtBeginning(T val) {
		Node newNode=new Node(val);
		if(head==null) {
			head=newNode;
		}else {
			newNode.next=head;
			head=newNode;
		}
	}
	public void display() {
		Node temp=head;
		while(temp!=null) {
			System.out.print(temp.data+" ");
			temp=temp.next;
		}
	}
	public void insertAtPos(int pos,T val) {
		if(pos==0) {
			insertAtBeginning(val);
			return;
		}
		Node newNode=new Node(val);
		Node temp=head;
		for(int i=1;i<pos;i++) {
			temp=temp.next;
			if(temp==null) {
//				System.out.println("Invalid Position");
//				return;
				throw new IllegalArgumentException("Invalid Position"+pos);
			}
		}
		newNode.next=temp.next;
		temp.next=newNode;		
	}
	public void deleteAtPos(int pos) {
		if(head==null) {
			throw new IndexOutOfBoundsException("List is empty");
		}
		if(pos==0) {
			head=head.next;
		}
		Node temp=head;
		Node prev=null;
		for(int i=0;i<=pos;i++) {
			prev=temp;
			
			temp=temp.next;
		}
		prev.next=temp.next;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Integer> list = new LinkedList<Integer>();
		list.insertAtBeginning(9);
		list.insertAtBeginning(5);
		list.display();
		System.out.println(" ");
		list.insertAtPos(1,10);
		
		list.display();
		

	}

}
