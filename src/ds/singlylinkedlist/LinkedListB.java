package ds.singlylinkedlist;

/**
 * This is a challenge from the end of the SinglyLinkedList lecture
 *
 * The objective of this challenge is to find a more efficient way of inserting at the end of a LinkedList without
 * having to traverse from the beginning all the way to the end
 */
public class LinkedListB {
    public int data;
    private Node first;
    private Node last;

    public LinkedListB() {

    }

    public boolean isEmpty() {
        return (first == null);
    }

    public void insertFirst(int data) {
        Node newNode = new Node();
        newNode.data = data;
        newNode.next = first;
        if (isEmpty()) {
            last = newNode;
        }
        first = newNode;

        // Some assumptions about this method:
        //  - Adding something to the beginning, as long as next != null, will not affect last index
        //  - If next == null, that means there is no following node, so the first node is also the last node (list size of 1)
    }

    public void insertLast(int data) {
        Node newNode = new Node();
        newNode.data = data;
        if (isEmpty()) {
            first = newNode;
        }
        last.next = newNode;


        // Some assumptions about this method:
        //  - If first != null, adding a node at the end will not affect first index
        //  - If first == null, adding a node at all will make that node both the first and the last node
    }

    public Node deleteFirst() {
        Node temp = first;
        first = first.next;
        return temp;
    }

    public Node deleteLast() {
        Node temp = last;
        last = null;
        return temp;
    }

    public void displayList() {
        System.out.println("List (first --> last) ");
        Node current = first;
        while (current != null) {
            current.displayNode();
            current = current.next;
        }
        System.out.println("");
    }
}

