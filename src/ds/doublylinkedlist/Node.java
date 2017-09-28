package ds.doublylinkedlist;

/**
 * Created by vincenthoang on 6/20/17.
 */
public class Node {
    public int data;
    public Node next;
    public Node previous;

    public void displayNode() {
        System.out.println("[ " + data + " ]");
    }
}
