package variablesDatosOperadores;

import java.util.Scanner;

public class Ejercicio34 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int n1 = teclado.nextInt();
        int n2 = teclado.nextInt();
        int n3 = teclado.nextInt();

        System.out.println((n1 != n2) && (n1 != n2));
    }
}
