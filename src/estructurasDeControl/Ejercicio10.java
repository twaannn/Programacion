package estructurasDeControl;

import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Nº1: ");
        int a = teclado.nextInt();

        System.out.println("Nº2: ");
        int b = teclado.nextInt();

        System.out.println("Nº3: ");
        int c = teclado.nextInt();

        // Según las posibilidades planteadas las voy probando 1 a 1

        if (a > b && b > c) {
            System.out.println(a + " " + b +  " " + c);
        } else if (a > c && c > b) {
            System.out.println(a + " " + c +  " " + b);
        } else if (b > a && a > c) {
            System.out.println(b + " " + a +  " " + c);
        } else if (b > c && c > a) {
            System.out.println(b + " " + c +  " " + a);
        } else if (c > a && a > b) {
            System.out.println(c + " " + a +  " " + b);
        } else {
            System.out.println(c + " " + b +  " " + a);
        }

    }
}
