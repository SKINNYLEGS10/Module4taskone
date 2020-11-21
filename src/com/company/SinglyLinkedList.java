package com.company;

public class SinglyLinkedList {
    Node head;

    public SinglyLinkedList (Node head) {
        this.head = head;
    }
    public SinglyLinkedList() {
    }

    public void printList() {
        Node node = head;
        while (node != null) {
            System.out.println(node.data);
            node = node.next;
        }
    }

    public void push(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    public void insertAfter(Node previousNode, int data) {
        if (previousNode == null) {
            System.out.println("The given previous node cannot be null");
            return;
        }
        Node newNode = new Node(data);
        newNode.next = previousNode.next;
        previousNode.next = newNode;
    }

    public void append(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = new Node(data);
            return;
        }
        newNode.next = null;
        Node last = head;
        while (last.next != null)
            last = last.next;
        last.next = newNode;
    }

    void deleteNode(int key) {
        Node temporary = head, previous = null;
        if (temporary != null && temporary.data == key) {
            head = temporary.next;
            return;
        }
        while (temporary != null && temporary.data != key) {
            previous = temporary;
            temporary = temporary.next;
        }
        if (temporary == null) return;
        previous.next = temporary.next;
    }

    Node reverse(Node node) {
        Node previous = null;
        Node current = node;
        Node next = null;
        while (current != null) {
            next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }
        node = previous;
        return node;
    }
}


