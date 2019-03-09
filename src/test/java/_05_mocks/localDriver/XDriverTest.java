package _05_mocks.localDriver;

import org.testng.annotations.*;
import service.ISizeService;
import shapes.Pair;

import static org.mockito.Mockito.*;
import static org.assertj.core.api.Assertions.*;

public class XDriverTest {

    private ISizeService sizeServiceMock;
    private Pair pair;

    @Factory(dataProvider = "points")
    public XDriverTest(Pair pair) {
        this.pair = pair;
    }

    @DataProvider(name = "points")
    public static Object[][] primeNumbers() {
        return new Object[][]{
                new Object[]{new Pair(10, 12)},
                new Object[]{new Pair(11, 13)}};
    }

    @BeforeMethod
    public void setUp() {
        sizeServiceMock = mock(ISizeService.class);
        when(sizeServiceMock.getSize()).thenReturn(pair);
    }

    @Test
    public void testGetWidth() {
        XDriver xDriver = new XDriver(sizeServiceMock);
        assertThat(xDriver.getWidth()).as("X size check").isEqualTo(pair.getX());
        verify(sizeServiceMock, times(1)).getSize();

    }

    @Test
    public void testGetHeight() {
        XDriver xDriver = new XDriver(sizeServiceMock);
        assertThat(xDriver.getHeight()).as("Y size check").isEqualTo(pair.getY());
        verify(sizeServiceMock, times(1)).getSize();
    }
}