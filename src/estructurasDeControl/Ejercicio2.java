package estructurasDeControl;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Sueldo anual: ");
        float sueldo = teclado.nextFloat();

        if (sueldo > 9000) {
            System.out.println("Debes abonar impuestos");
        } else {
            System.out.println("No tienes que abonar impuestos");
        }
    }
}
