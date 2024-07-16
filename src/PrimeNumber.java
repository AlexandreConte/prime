import java.util.ArrayList;
import java.util.List;

public abstract class PrimeNumber {

    public static List<Integer> linearPrimeNumbers(int upperLimit) {
        if (upperLimit < 2) {
            throw new IllegalArgumentException("O numero fornecido deve ser maior do que 1");
        }
        List<Integer> primeNums = new ArrayList<Integer>();
        int curr = 2;
        while (curr != upperLimit) {
            if (isPrime(curr)) {
                primeNums.add(curr);
            }
            curr++;
        }
        return primeNums;
    }

    public static List<Integer> recursivePrimeNumbers(int upperLimit) {
        List<Integer> primeNums = new ArrayList<Integer>();
        if (upperLimit >= 2) {
            primeNums.addAll(recursivePrimeNumbers(upperLimit - 1));
            if (isPrime(upperLimit)) {
                primeNums.add(upperLimit);
            }
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
