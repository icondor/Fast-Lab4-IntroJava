/**
 * Created by andreea on 24.03.2017.
 */
import java.util.Scanner;
public class treimic {
    public static void main(String[] args) {
        int x,y,z;
        System.out.println( " Introduceti trei numere intregi: ");

        Scanner in= new  Scanner(System.in);
        x = in.nextInt();
        y = in.nextInt();
        z = in.nextInt();

        if( x<y &&  x<z)
            System.out.println( "Primul numar este cel mai  mic. ");
        else if( y<x && y < z)
            System.out.println( " Al doilea numare este cel mai mic.");
        else if (z<x && z<y)
        System.out.println( " Am treilea numar este cel mai mic. ");
        else
            System.out.println( " Numerele introduse sunt egale. ");

    }
}
