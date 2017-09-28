package linkedlists;

/**
 * Created by vincenthoang on 6/20/17.
 */
public class App {

    public static void main(String[] args) {
        Node nodeA = new Node();
        nodeA.data = 4;

        Node nodeB = new Node();
        nodeB.data = 3;

        Node nodeC = new Node();
        nodeC.data = 7;

        Node nodeD = new Node();
        nodeD.data = 8;

        nodeA.next = nodeB;
        nodeB.next = nodeC;
        nodeC.next = nodeD;

        System.out.println(listLength(nodeA));
        System.out.println(listLength(nodeB));
        System.out.println(listLength(nodeC));
    }

    public static int listLength(Node node) {
        int counter = 0;
        if (node != null) {
            counter++;

            while (node.next != null) {
                counter++;
                node = node.next;
            }
        }

        return counter;
    }
}
