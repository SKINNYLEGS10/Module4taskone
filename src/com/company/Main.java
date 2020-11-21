package com.company;
import java.util.*;
public class Main {

    public static void main(String[] args) {
	SinglyLinkedList sList = new SinglyLinkedList();

	sList.head = new Node(1);
	Node second = new Node(2);
	Node third = new Node(3);
	Node fourth = new Node(4);
	Node fifth = new Node(5);
	Node six = new Node(6);
	Node seven = new Node(7);
	Node eight = new Node(8);
	Node nine = new Node(9);
	Node ten = new Node(10);
	Node eleven = new Node(11);
	Node twelve = new Node(12);
	Node thirteen = new Node(13);
	Node fourthteen = new Node(14);
	Node fifteen = new Node(15);
	Node sixteen = new Node(16);
	Node seventeen = new Node(17);
	Node eighteen = new Node(18);
	Node nineteen = new Node(19);
	Node twenty = new Node(20);
	sList.head.next = second;
	second.next = third;
	third.next = fourth;
	fourth.next = fifth;
	fifth.next = six;
	six.next = seven;
	seven.next = eight;
	eight.next = nine;
	nine.next = ten;
	ten.next = eleven;
	eleven.next = twelve;
	twelve.next = thirteen;
	thirteen.next = fourthteen;
	fourthteen.next = fifteen;
	fifteen.next = sixteen;
	sixteen.next = seventeen;
	seventeen.next = eighteen;
	eighteen.next = nineteen;
	nineteen.next = twenty;
	sList.push(25);
	sList.append(100);
	sList.deleteNode(20);
	sList.insertAfter(eight, 50);
	sList.printList();
	sList.head = sList.reverse(sList.head);
	sList.printList();

    }
}

