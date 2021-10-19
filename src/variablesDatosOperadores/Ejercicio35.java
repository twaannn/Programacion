package variablesDatosOperadores;

import java.util.Scanner;

public class Ejercicio35 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int a = teclado.nextInt();
        int b = teclado.nextInt();
        int c = teclado.nextInt();

        System.out.println((a + b == 20) || (a + c ==20) || (b + c == 20));
    }
}
