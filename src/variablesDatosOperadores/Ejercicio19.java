package variablesDatosOperadores;

import java.util.Scanner;

public class Ejercicio19 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("X1:");
        double x1 = teclado.nextDouble();

        System.out.println("Y1:");
        double y1 = teclado.nextDouble();

        System.out.println("X2:");
        double x2 = teclado.nextDouble();

        System.out.println("Y2:");
        double y2 = teclado.nextDouble();

        double op1 = x2 - x1;
        double op2 = op1 * op1;

        double op3 = y2 - y1;
        double op4 = op3 * op3;

        double op5 = op2 + op4;

        System.out.println("Punto 1: " + "A(" + x1 + ", " + y1 + ")");
        System.out.println("Punto 2: " + "B(" + x2 + ", " + y2 + ")");

        System.out.printf("La distancia entre los puntos 1 y 2 es de " + (Math.sqrt(op5)) + " unidades.");
    }
}
