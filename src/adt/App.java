package adt;

/**
 * Created by vincenthoang on 6/19/17.
 */
public class App {
    public static void main(String[] args) {
        Counter myCounter = new Counter("myCounter");
        myCounter.increment(4);

        System.out.println(myCounter.getCurrentValue());
    }
}
