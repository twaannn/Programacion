package variablesDatosOperadores;

import java.util.Scanner;

public class Ejercicio27 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Materia: ALGORITMOS");
        System.out.println("======================");

        System.out.println("Nota obtenida en el 1 parcial:");
        double par1 = teclado.nextDouble();

        System.out.println("Nota obtenida en el 2 parcial");
        double par2 = teclado.nextDouble();

        System.out.println("Nota obtenida en el 3 parcial");
        double par3 = teclado.nextDouble();

        double parfin = (par1 + par2 + par3)/3;

        System.out.print("Nota promedio parciales: ");
        System.out.printf("%.02f", parfin);

        System.out.println();

        System.out.println("Nota examen final:");
        double exfin = teclado.nextDouble();

        System.out.println("Nota trabajo final:");
        double trafin = teclado.nextDouble();

        double partot = parfin * 0.55;
        double extot = exfin * 0.3;
        double tratot = trafin * 0.15;

        double notafinal = partot + extot + tratot;

        System.out.println("Nota final = " + notafinal);
    }
}
