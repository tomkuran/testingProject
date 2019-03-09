package _02factorial;

public class MyFactorial {
    public long recursive(int x) {
        if (x < 0) {
            throw new IllegalArgumentException("Argument smaller than 0");
        }
        if (x <= 1) {
            return 1;
        } else {
            return x * recursive(x - 1);
        }

    }
}
