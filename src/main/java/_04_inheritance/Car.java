package _04_inheritance;

public class Car {
    private Engine engine;

    public Car(Engine engine) {
        this.engine = engine;
    }

    public int getEngineTemperature(){
        return engine.getEngineTemperature();
    }
}
