package ds.stack;

/**
 * Created by vincenthoang on 6/20/17.
 */
public class CharStack {
    private int maxSize;
    private char[] stackArray;
    private int top;

    public CharStack(int size) {
        maxSize = size;
        stackArray = new char[maxSize];
        top = -1; // There is nothing on "top of the stack" right now. Indexes start at 0 (first item in the stack)
    }

    public void push(char j) {
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

    public char pop() {
        if (!isEmpty()) {
            return stackArray[top--];
        }
        System.out.println("Stack is empty");
        return '0';
    }

    public long peek() {
        if (!isEmpty()) {
            return stackArray[top];
        }
        System.out.println("Stack is empty");
        return '0';
    }

    public boolean isEmpty() {
        return (top == -1);
    }

    public boolean isFull() {
        return (maxSize - 1 == top);
    }

}
