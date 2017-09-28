package ds.stack;

/**
 * Created by vincenthoang on 6/19/17.
 */
public class Stack {
    private int maxSize;
    private long[] stackArray;
    private int top;

    public Stack(int size) {
        maxSize = size;
        stackArray = new long[maxSize];
        top = -1; // There is nothing on "top of the stack" right now. Indexes start at 0 (first item in the stack)
    }

    public void push(long j) {
        if (!isFull()) {
            top++;
            stackArray[top] = j;
        } else {
            System.out.println("Stack is full");
        }
    }

    /**
     * This is the Udemy course's implementation; below should have the same functionality
     */
    //public long pop() {
    //    int old_top = top;
    //    top--;
    //    return stackArray[old_top];
    //}

    public long pop() {
        if (!isEmpty()) {
            return stackArray[top--];
        }
        System.out.println("Stack is empty");
        return -999;
    }

    public long peek() {
        if (!isEmpty()) {
            return stackArray[top];
        }
        System.out.println("Stack is empty");
        return -999;
    }

    public boolean isEmpty() {
        return (top == -1);
    }

    public boolean isFull() {
        return (maxSize - 1 == top);
    }

}
