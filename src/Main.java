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
            List<Integer> numbersWithLinear = PrimeNumber.linearPrimeNumbers(upperLimit);
            System.out.println("Algoritmo Linear: " + numbersWithLinear);
            List<Integer> numbersWithRecursive = PrimeNumber.recursivePrimeNumbers(upperLimit);
            System.out.println("Algoritmo Recursivo: " + numbersWithRecursive);
        } catch (InputMismatchException exception) {
            System.out.println("Digite um numero inteiro!");
        } catch (IllegalArgumentException exception) {
            System.out.println(exception.getMessage());
        }

        sc.close();
    }
}
