package estructurasDeControl;

import java.util.Scanner;

public class Ejercicio21 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        System.out.println("¿Qué topping quieres para tu helado?");
        System.out.println("===================================");
        System.out.println("1.Topping de Oreo -> 1€\n2.Topping de KitKat -> 1.50€\n3.Topping de brownie -> 0.75€\n4.Topping de lacasitos -> 0.95€");
        char topping = teclado.next().charAt(0);

        switch (topping) {
            case '1':
                System.out.println("Cuesta 2.90€");
                break;
            case '2':
                System.out.println("Cuesta 3.40€");
                break;
            case '3':
                System.out.println("Cuesta 2.65€");
                break;
            case '4':
                System.out.println("Cuesta 2.85€");
                break;
            default:
                System.out.println("No tenemos este topping, lo sentimos");
                System.out.println("El precio del helado sin topping es de 1.90€");


        }

    }
}
