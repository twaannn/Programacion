package variablesDatosOperadores;

import java.util.Scanner;

public class Ejercicio33 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Nº de 3 cifras:");


        int n1 = teclado.nextInt();
        int n2 = teclado.nextInt();
        int n3 = teclado.nextInt();

        System.out.println((n2 < n1) && (n1 < n3));

    }
}

