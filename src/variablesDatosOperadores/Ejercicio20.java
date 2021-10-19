package variablesDatosOperadores;

import java.util.Scanner;

public class Ejercicio20 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        double num = teclado.nextDouble();
        double num2 = teclado.nextDouble();
        double num3 = teclado.nextDouble();
        double num4 = teclado.nextDouble();

        double suma = num + num2 + num3 + num4;
        double media = suma/4;

        System.out.println("La suma de los 4 valores numéricos es = " + suma);
        System.out.println("La media de los 4 valaores numéricos es = " + media);



    }
}
