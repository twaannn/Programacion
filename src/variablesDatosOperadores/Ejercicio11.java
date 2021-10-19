package variablesDatosOperadores;

import java.util.Scanner;

public class Ejercicio11 {
    public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);

    System.out.println("Introduce un nº para invertir: ");

    int numero = teclado.nextInt();

    int decenas = numero / 10;
    int unidades = numero % 10;

    int invertido = unidades * 10 + decenas;

    System.out.println("Nº invertido: " + invertido );

    }
}
