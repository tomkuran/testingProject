package _04_inheritance;

import org.assertj.core.api.Assertions;
import org.testng.annotations.Test;

import static org.assertj.core.api.Assertions.*;

public class CarTest_final {

    private int stubbedTemp = 155;

    @Test
    public void testGetEngineTemperature() {
        // arrange
        EngineStub engineStub = new EngineStub(stubbedTemp);
        Car car = new Car(engineStub);

        // act
        int temp = car.getEngineTemperature();

        //assert
        assertThat(temp).isEqualTo(stubbedTemp);
    }
}