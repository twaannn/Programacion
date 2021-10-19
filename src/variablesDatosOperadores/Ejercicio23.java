package variablesDatosOperadores;

import java.util.Scanner;

public class Ejercicio23 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Número:");
        double num = teclado.nextDouble();

        System.out.println("Porcentaje: ");
        double per = teclado.nextDouble();

        System.out.println(per + "%");

        double decin = (num * per)/100;
        double decfin = num - decin;
        double inc = num + decin;

        System.out.println("El número escrito en incremento pasa a ser --> " + inc);
        System.out.println("El número escrito en decremento pasa a ser --> " +decfin );

    }
}
