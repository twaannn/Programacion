package variablesDatosOperadores;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Número 1:");
        int num1 = teclado.nextInt();

        System.out.println("Número 2:");
        int num2 = teclado.nextInt();

        System.out.println("Número 3:");
        int num3 = teclado.nextInt();

        System.out.println("Número 4:");
        int num4 = teclado.nextInt();

        int suma = num1 + num2;
        int producto = num3 * num4;

        System.out.println("La suma de " + num1 + " + " + num2 + " es " + suma);
        System.out.println("El producto de " + num3 + " * " + num4 + " es " + producto);
    }
}
