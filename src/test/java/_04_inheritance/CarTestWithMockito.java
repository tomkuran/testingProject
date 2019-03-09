package _04_inheritance;

import org.assertj.core.api.Assertions;
import org.testng.annotations.Test;

import static org.mockito.Mockito.*;

public class CarTestWithMockito {

    private Engine engineStub = spy(Engine.class);

    //private Engine engineMock = mock(Engine.class);

    @Test
    public void shouldReturnTemperature() {
        // arrange
        when(engineStub.getEngineTemperature()).thenReturn(99);

        //doReturn(99).when(engineStub).getEngineTemperature();
        Car car = new Car(engineStub);

        // act
        int temp = car.getEngineTemperature();

        // assert
        Assertions.assertThat(engineStub.getRevs()).isEqualTo(1200);
        Assertions.assertThat(temp).isEqualTo(99);
    }
}
