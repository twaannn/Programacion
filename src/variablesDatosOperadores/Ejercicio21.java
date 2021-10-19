package variablesDatosOperadores;

import java.util.Scanner;

public class Ejercicio21 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Nota 1ª evaluación Programación:");
        double prog1 = teclado.nextDouble();


        System.out.println("Nota 2ª evaluación Programación:");
        double prog2 = teclado.nextDouble();


        System.out.println("Nota 3ª evaluación Programación:");
        double prog3 = teclado.nextDouble();

        double suma = prog1 + prog2 + prog3;
        double media = suma/3;

        System.out.print("La nota final del módulo de programaciíon es un ");
        System.out.printf("%.2f", media);


    }
}
