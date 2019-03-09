package _04_inheritance;

public class EngineStub extends Engine{

    private int temperature;

    public EngineStub(int temperature) {
        this.temperature = temperature;
    }

    @Override
    public int getEngineTemperature() {
        return this.temperature;
    }
}
