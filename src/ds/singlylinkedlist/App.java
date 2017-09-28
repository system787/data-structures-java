package ds.singlylinkedlist;

/**
 * Created by vincenthoang on 6/21/17.
 */
public class App {
    public static void main(String[] args) {
        SinglyLinkedList sLinkedList = new SinglyLinkedList();
        sLinkedList.insertFirst(100);
        sLinkedList.insertFirst(50);
        sLinkedList.insertFirst(99);
        sLinkedList.insertFirst(88);
        sLinkedList.insertLast(1);
        sLinkedList.displayList();



        LinkedListB linkedList = new LinkedListB();
        linkedList.insertFirst(100);
        linkedList.insertFirst(50);
        linkedList.insertFirst(99);
        linkedList.insertFirst(88);
        linkedList.insertLast(1);
        linkedList.displayList();

    }
}
