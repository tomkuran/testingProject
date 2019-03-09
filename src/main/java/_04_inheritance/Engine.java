package _04_inheritance;

public class Engine {

    public int getEngineTemperature() {
        // lets pretend we cannot use it in test scope
        throw new UnsupportedOperationException();
    }

    public int getRevs() {
        return 1200;
    }
}
