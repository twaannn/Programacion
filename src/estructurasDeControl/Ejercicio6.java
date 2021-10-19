package estructurasDeControl;

import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Nº de tazas");
        int tazas = teclado.nextInt();

        System.out.println("Fin de semana True/False");
        boolean finde = teclado.nextBoolean();

        boolean exito = teclado.nextBoolean();

        if (finde) {
            if (tazas >= 15 && tazas <= 25) {
                exito = true;
            } else {
                exito = false;
            }
        }
        System.out.println(exito);
    }
}