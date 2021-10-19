package variablesDatosOperadores;

import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Nueces:");
        int nueces= teclado.nextInt();

        System.out.println("Ardillas:");
        int ardillas = teclado.nextInt();

        int division = nueces/ardillas;
        int resto = nueces%ardillas;

        System.out.println(nueces + "/" + ardillas + " = " + division + "  --> A cada ardilla le tocan " + division + " nueces.");
        System.out.println("El resto de la división es " + resto + " --> Sobran " + resto + " nueces.");



    }
}
