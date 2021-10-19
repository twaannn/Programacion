package estructurasDeControl;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Edad: ");
        int edad = teclado.nextInt();

        System.out.println("Nivel de estudios: ");
        int ne = teclado.nextInt();

        System.out.println("Ingresos: ");
        int ing = teclado.nextInt();

        boolean jasp = ((edad <= 28) && (ne > 3)) || ((edad < 30) && (ing > 28000));

        if (jasp) {
            System.out.println("True");
        } else  {
            System.out.println("False");
        }
    }
}
