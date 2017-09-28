package ds.queue;

/**
 * Created by vincenthoang on 6/20/17.
 */
public class Queue {

    private int maxSize; // initializes the set number of slots
    private long[] queueArray; // slots to main the data
    private int front; // this will be the index position for the element in the front
    private int rear; // index position for the element at the back of the line
    private int nItems; // counter to maintain the number of items in our queue

    public Queue(int size) {
        maxSize = size;
        queueArray = new long[size];
        front = 0; // index position of the first slot of the array
        rear = -1; // there is no item in the array yet to be considered as the last item
        nItems = 0; // no elements in the array yet
    }

    public void insert(long l) {
        if (!isFull()) {
            rear++;
            queueArray[rear] = l;
            nItems++;
        } else {
            System.out.println("Queue is full");
        }
    }

    public void view() {
        System.out.println("[ ");
        for (int i = 0; i < queueArray.length; i++) {
            System.out.println(queueArray[i] + " ");
        }
        System.out.println("]");
    }

    public long remove() { // remove item from the front of the queue
        if (!isEmpty()) {
            long temp = queueArray[front];
            front++;

            if (front == maxSize) {
                front = 0; // we can set front back to the 0th index so that we can utilize the entire array again
            }

            nItems--;
            return temp;
        }
        System.out.println("Queue is empty");
        return -999;
    }

    public long peekFront() {
        return queueArray[front];
    }

    public boolean isEmpty() {
        return (nItems == 0);
    }

    public boolean isFull() {
        return (nItems == maxSize);
    }
}
