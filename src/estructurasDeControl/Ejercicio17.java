package estructurasDeControl;

import java.util.Scanner;

public class Ejercicio17 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("0 - No mover, 1 - Arriba, 2 - Abajo, 3 - Izquierda, 4 - Derecha ");
        System.out.print("Introduce un nº del 0 al 4: ");
        int n = teclado.nextInt();

        /*switch (n) {
            case 0:
                System.out.println("No mover");
                break;
            case 1:
                System.out.println("Mover arriba");
                break;
            case 2:
                System.out.println("Mover abajo");
                break;
            case 3:
                System.out.println("Mover a la izquierda");
                break;
            case 4:
                System.out.println("Mover a la derecha");
                break;
            default:
                System.out.println("¡Error!");
        }
       */
        if (n == 1) {
            System.out.println("Subir");
        } else if (n == 2) {
            System.out.println("Abajo");
        } else if (n == 3) {
            System.out.println("Subir a la izquierda");
        } else if (n == 4) {
            System.out.println("Mover a la derecha");
        } else if (n == 0) {
            System.out.println("No mover");
        } else {
            System.out.println("Respuesta incorrecta");
        }
    }
}
