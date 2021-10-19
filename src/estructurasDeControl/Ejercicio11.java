package estructurasDeControl;

import java.util.Scanner;

public class Ejercicio11 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int año = teclado.nextInt();
        // es un año bisiesto si :
        // es divisible por 4 y no por 100 o es divisible por 400
        if (año % 4 == 0 && año % 100 != 0 || año % 400 == 0 ) {
            System.out.println(año + " es bisiesto.");
        } else {
            System.out.println(año + " no es bisiesto.");
        }
    }
}
