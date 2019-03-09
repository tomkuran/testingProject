package _01primes;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

public class CheckIfPrimeTest_final {

    @Test(dataProvider = "primes")
    public void ShouldBePrime(Integer i) {
        Rule<Integer> primesRule = new CheckIfPrime();
        assertTrue(primesRule.execute(i));
    }

    @Test(dataProvider = "notPrimes")
    public void ShouldNotBePrime(Integer i) {
        Rule<Integer> primesRule = new CheckIfPrime();
        assertFalse(primesRule.execute(i));
    }

    @DataProvider
    public static Object[][] notPrimes() {
        return new Object[][]{
                new Object[]{1},
                new Object[]{2},
                new Object[]{4},
                new Object[]{9},
                new Object[]{12},
                new Object[]{49}
        };
    }


    @DataProvider
    public static Object[][] primes() {
        return new Object[][]{
                new Object[]{3},
                new Object[]{5},
                new Object[]{7},
                new Object[]{11}
        };
    }
}