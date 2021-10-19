package variablesDatosOperadores;

import java.util.Scanner;

public class Ejercicio18 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Temperatura en cº:");
        double centígrados = teclado.nextDouble();

        System.out.println("Reamur = " + (centígrados * 0.8));
        System.out.println("Fahrenheit = " + (centígrados * 9/5)+32);
        System.out.println("Kelvin = " + (centígrados + 273));

    }
}
