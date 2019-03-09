package _01primes;

public class CheckIfPrime implements Rule<Integer> {
    public boolean execute(Integer integer) {
        if(integer<=2){
            return false;
        }
        for (int i = 2; i <= Math.sqrt(integer); i++) {
            if (integer % i == 0) {
                return false;
            }
        }
        return true;
    }
}
