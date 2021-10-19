package variablesDatosOperadores;

import java.util.Scanner;

public class Ejercicio12 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Número de 3 cifras:");

        int num = teclado.nextInt();

        int centenas = num/100;
        int resto = num%100;

        int decenas = resto/10;

        int uds= resto%10;

        int invertido = uds * 100 + decenas * 10 + centenas;

        System.out.println("Invertido: " + invertido);

    }
}
