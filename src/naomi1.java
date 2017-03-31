import java.util.Scanner;

/**
 * Created by andreea on 21.03.2017.
 */
public class naomi1 {
    public static void main(String[] args) {
        int a ;
        int b;
        int suma;
        System.out.println( " introduceti 2 numere: ");
        System.out.println();
        Scanner in = new Scanner(System.in);
        a = in.nextInt();
        b =  in.nextInt();
        suma = a + b;
        System.out.println(" suma va fi: " + suma);
    }
}
