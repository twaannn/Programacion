package estructurasDeControl;

import java.util.Scanner;

public class Ejercicio07 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("¿Eres culpable? True/False");
        boolean culpable = teclado.nextBoolean();
        if (culpable) {
            System.out.println("A la cárcel");
        } else {
            System.out.println("A casa");
        }
    }
}
