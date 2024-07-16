import java.util.ArrayList;
import java.util.List;

public abstract class PrimeNumber {

    public static List<Integer> primeNumbers(int upperLimit) {
        if (!(upperLimit > 1)) {
            throw new IllegalArgumentException("O numero fornecido deve ser maior do que 1");
        }
        List<Integer> primeNums = new ArrayList<Integer>();
        int curr = 1;
        while (curr != upperLimit) {
            if (isPrime(curr)) {
                primeNums.add(curr);
            }
            curr++;
        }
        return primeNums;
    }

    private static boolean isPrime(int number) {
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                // nao eh primo
                return false;
            }
        }
        return true;
    }
}
