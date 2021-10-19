package variablesDatosOperadores;

import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int num = 4;
        int op = ((num + 1)* num + 2)* num + 3;


        System.out.println("(" + num + " + 1)* " + num + " + 2 )* " + num + " + 3" + " = " + op);

    }
}
