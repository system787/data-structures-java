package adt;

/**
 * Created by vincenthoang on 6/19/17.
 */
public class Counter {
    String mStr;
    int mValue;

    public Counter(String str) {
        mStr = str;
    }

    public void increment() {
        increment(1);
    }

    public void increment(int x) {
        for (int i = 0; i < x; i++) {
            mValue++;
        }
    }

    public int getCurrentValue() {
        return mValue;
    }

    @Override
    public String toString() {
        return String.valueOf(mValue);
    }
}
