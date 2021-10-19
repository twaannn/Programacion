package variablesDatosOperadores;

import java.util.Scanner;

public class Ejercicio26 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Sueldo base recibido:");
        double sueldo = teclado.nextDouble();

        System.out.println("Porcentaje recibido como comisión por extra de ventas: 10% ");

        System.out.println("Venta 1:");
        double v1 = teclado.nextDouble();

        System.out.println("Venta 2:");
        double v2 = teclado.nextDouble();

        System.out.println("Venta 3:");
        double v3 = teclado.nextDouble();

        double com1 = v1 * 0.1;
        double com1f = v1 + com1;

        double com2 = v2 * 0.1;
        double com2f = v2 + com2;

        double com3 = v3 * 0.1;
        double com3f = v3 + com3;

        double com = com1f + com2f + com3f;

        double sueldofinal = sueldo + com;

        System.out.println("El sueldo base del vendedor es de " + sueldo + "€" );
        System.out.println("El vendedor obtendrá un plus de " + com + "€ en comisiones");
        System.out.println("El sueldo final del vendedor será de " + sueldofinal + "€");


    }
}
