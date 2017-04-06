/**
 * Created by andreea on 30.03.2017.
 */
import java.util.Scanner;

public class Factorial1 {
    public static void main(String[] args) {
        int n, c, fact = 1;

        System.out.println("Calculati factorialul numarului: ");
        Scanner in = new Scanner(System.in);

        n = in.nextInt();

        if (n < 0)
            System.out.println("Numarul intreg:");
        else {
            for (c = 1; c <= n; c++)
                fact = fact * c;

            System.out.println("Factorial of " + n + " is = " + fact);


        }
    }
}