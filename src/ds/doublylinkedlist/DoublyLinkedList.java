package ds.doublylinkedlist;

/**
 * Created by vincenthoang on 6/22/17.
 */
public class DoublyLinkedList {
    private Node first;
    private Node last;

    public DoublyLinkedList() {
        first = null;
        last = null;
    }

    public boolean isEmpty() {
        return (first == null);
    }

    public void insertFirst(int data) {
        Node newNode = new Node();
        newNode.data = data;

        if (isEmpty()) {
            last = newNode;
        }

        first.previous = newNode;
        newNode.next = first;
        first = newNode;
    }

    public void insertLast(int data) {
        Node newNode = new Node();
        newNode.data = data;

        if (isEmpty()) {
            first = newNode;
        }
        last.next = newNode;
        newNode.previous = last;
        last = newNode;
    }

    // assume non-empty list (although I may still add defensive measures)
    public Node deleteFirst() {
        Node temp = first;
        if (first.next == null) { // this means there is only one item in the list
            last = null;
        } else {
            first.next.previous = null; // point the first node to null
        }
        first = first.next; // reassign the reference of the first node to the next node in the list
        return temp;
    }

    // assume non-empty list
    public Node deleteLast() {
        Node temp = last;
        if (last.previous == null) {
            first = null;
        } else {
            last.previous.next = null;
        }
        last = last.previous;
        return temp;
    }

    // assume non-empty list
    public boolean insertAfter(int key, int data) {
        Node current = first;
        while (current.data != key) {
            current = current.next;
            if (current == null) { // key does not exist within linked list
                return false;
            }
        }

        Node newNode = new Node();
        newNode.data = data;

        if (current == last) {
            current.next = null;
            last = newNode;
        } else {
            newNode.next = current.next;
            current.next.previous = newNode;
        }
        newNode.previous = current;
        current.next = newNode;

        return true;
    }
}
