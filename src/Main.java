import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um numero para exibir os numeros primos até ele: ");
        int upperLimit;
        try {
            upperLimit = sc.nextInt();
            List<Integer> numbers = PrimeNumber.primeNumbers(upperLimit);
            System.out.println(numbers);
        } catch (InputMismatchException exception) {
            System.out.println("Digite um numero inteiro!");
        } catch (IllegalArgumentException exception) {
            System.out.println(exception.getMessage());
        }

        sc.close();
    }
}
