package variablesDatosOperadores;

import java.util.Scanner;

public class Ejercicio13 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Cantidad en €:");
        int cantidad= teclado.nextInt();

        int b500 = cantidad/500;
        int resto = cantidad%500;
        System.out.println("Billetes de 500: " +b500);

        int b200 = resto/200;
        resto = resto%200;
        System.out.println("Billetes de 100: " + b200);
        System.out.println("Resto: " + resto);

        int b100 = resto/100;
        resto = resto%100;
        System.out.println("Billetes de 100: " + b100);
        System.out.println("Resto: " + resto);

        int b50 = resto/50;
        resto = resto%50;
        System.out.println("Billetes de 50: " + b50);
        System.out.println("Resto: " + resto);

        int b20 = resto/20;
        resto = resto%20;
        System.out.println("Billetes de 20: " + b20);
        System.out.println("Resto: " + resto);

        int b10 = resto/10;
        resto = resto%10;
        System.out.println("Billetes de 10: " + b10);
        System.out.println("Resto: " + resto);

        int b5 = resto/5;
        resto = resto%5;
        System.out.println("Billetes de 5: " + b5);
        System.out.println("Resto: " + resto);

        int n2 = resto/2;
        resto = resto%2;
        System.out.println("Monedas de 2: " + n2);
        System.out.println("Resto: " + resto);





    }
}
