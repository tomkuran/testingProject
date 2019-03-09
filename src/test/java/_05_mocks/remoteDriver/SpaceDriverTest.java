package _05_mocks.remoteDriver;

import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import service.ISizeService;
import shapes.Pair;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.when;

public class SpaceDriverTest {

    @Mock
    private ISizeService sizeService;

    @InjectMocks
    private SpaceDriver spaceDriver;

    @BeforeMethod
    public void init() {
        MockitoAnnotations.initMocks(this);
        when(sizeService.getSize()).thenReturn(new Pair(1, 2));
    }

    @Test
    public void testGetWidth() {
        assertThat(spaceDriver.getWidth()).isEqualTo(1);
    }

    @Test
    public void testGetHeight() {
        assertThat(spaceDriver.getHeight()).isEqualTo(2);
    }
}