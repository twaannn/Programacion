package estructurasDeControl;

import java.util.Scanner;

public class Ejercicio16 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Elige entre:");
        System.out.println("============");
        System.out.println("1 -> Gryffindor");
        System.out.println("2 -> Hufflepuff");
        System.out.println("3 -> Slytherin");
        System.out.println("4 -> Ravenclan");
        System.out.print("Nº escogido: ");
        int n = teclado.nextInt();

        /*if (n == 1) {
            System.out.println("Valentía");
        } else if (n == 2) {
            System.out.println("Lealtad");
        } else if (n == 3) {
            System.out.println("Astucia");
        } else if (n == 4) {
            System.out.println("Intelecto");
        } else {
            System.out.println("No es una casa valida");
        }*/

        switch (n) {
            case 1:
                System.out.println("Valentía");
                break;
            case 2:
                System.out.println("Lealtad");
                break;
            case 3:
                System.out.println("Astucia");
                break;
            case 4:
                System.out.println("Intelecto");
                break;
        }


    }
}
