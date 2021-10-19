package variablesDatosOperadores;

import java.util.Scanner;

public class Ejercicio25 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Importe abonado por la compra: ");
        double importe = teclado.nextDouble();

        double disc = (importe * 15)/100;
        double disc2 = importe - disc;

        System.out.println("Descuento del 15% aplicado");
        System.out.println("Precio final de la compra --> " + disc2 + "€");
    }
}
