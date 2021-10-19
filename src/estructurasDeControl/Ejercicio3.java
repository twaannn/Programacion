package estructurasDeControl;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Nº 1:");
        int n1 = teclado.nextInt();

        System.out.println("Nº 2: ");
        int n2 = teclado.nextInt();

        if (n1 > n2) {
            System.out.println("El nº1 es mayor que el nº2");
        } else {
            System.out.println("El nº2 no es mayor que el nº1");
        }
    }
}
