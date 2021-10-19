package estructurasDeControl;

import java.util.Scanner;

public class Ejercicio20 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Nº 1:");
        int n1 = teclado.nextInt();

        System.out.print("Nº 2:");
        int n2 = teclado.nextInt();

        System.out.println("¿Qué operación deseas realizar?");
        System.out.println("+ -> suma\n- -> resta\n* -> multiplicación\n/ -> división");
        char op = teclado.next().charAt(0);

        int suma = n1 + n2;
        int resta = n1 - n2;
        int mult = n1 * n2;
        int div = n1/n2;

        switch (op)  {
            case '+':
                System.out.println(n1 + " + " + n2 + " = " + suma);
                break;
            case '-':
                System.out.println(n1 + " - " + n2 + " = " + resta);
                break;
            case '*':
                System.out.println(n1 + " * " + n2 + " = " + mult);
            case '/':
                System.out.println(n1 + "/" + n2 + " = " + div);

        }
    }
}
