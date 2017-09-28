package ds.stack;

/**
 * Created by vincenthoang on 6/19/17.
 */
public class App {

    public static void main(String[] args) {

        Stack theStack = new Stack(10);

        for (int i = 1; i <= 11; i++) {
            theStack.push(20*i);
        }

        while (!theStack.isEmpty()) {
            long value = theStack.pop();
            System.out.println(value);
        }

        System.out.println(reverseString("vincent"));
    }

    public static String reverseString(String str) {
        CharStack charStack = new CharStack(str.length());

        for (int i = 0, n = str.length(); i < n; i++) {
            charStack.push(str.charAt(i));
        }

        StringBuilder sb = new StringBuilder();
        while (!charStack.isEmpty()) {
            char value = charStack.pop();
            sb.append(value);
        }

        return sb.toString();
    }

}
