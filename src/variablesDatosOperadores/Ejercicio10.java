package variablesDatosOperadores;

import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Número: ");

        int n = teclado.nextInt();
        int fin = n/10;

        System.out.println("Decenas: " + fin);

    }
}
