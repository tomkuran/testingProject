package _02factorial;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatExceptionOfType;
import static org.testng.Assert.assertTrue;

public class MyFactorialTest_final {

    @Test(dataProvider = "testData")
    public void testRecursive(int x, long result) {
        assertTrue(new MyFactorial().recursive(x) == result);
    }

    @Test(dataProvider = "testData")
    public void shouldCalculateFactorialUpTo20(int x, long result) {
        assertThat(new MyFactorial().recursive(x)).as("Checking expected factorial value").isEqualTo(result);
    }

    @Test(expectedExceptions = {IllegalArgumentException.class})
    public void shoudlThrowIllegalArgException() {
        new MyFactorial().recursive(-1);
    }

    @Test
    public void shoudlThrowIllegalArgExceptionWithMessage() {
        assertThatExceptionOfType(IllegalArgumentException.class)
                .as("Expecting to throw Illegal Arg if parameter smaller than 0")
                .isThrownBy(() -> {
                    new MyFactorial().recursive(0);
                })
                .withMessage("Argument smaller than 0");
    }

    @DataProvider
    public static Object[][] testData() {
        return new Object[][]{
                new Object[]{0, 1},
                new Object[]{1, 1},
                new Object[]{20, 2432902008176640000L}
        };
    }
}