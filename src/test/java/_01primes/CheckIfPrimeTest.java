package _01primes;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.testng.Assert.*;

public class CheckIfPrimeTest {

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

    @Test(dataProvider = "primes")
    public void shouldIndicatePrime(int prime) {
        // given
        CheckIfPrime rule = new CheckIfPrime();

        // when
        boolean result = rule.execute(prime);

        //then
        assertTrue(result);
    }

    // @Test
    public void shouldNotIndicatePrime_badImplementation() {
        // given
        List<Integer> notPrimes = Arrays.asList(1, 4, 6);
        CheckIfPrime rule = new CheckIfPrime();

        notPrimes.forEach(
                x -> {
                    // when
                    boolean result = rule.execute(x);

                    //then
                    assertFalse(result);
                }
        );
    }

    @Test(dataProvider = "notPrimes")
    public void shouldNotIndicatePrime(int notPrime) {
        // given
        CheckIfPrime rule = new CheckIfPrime();

        // when
        boolean result = rule.execute(notPrime);

        //then
        assertFalse(result);
    }


}