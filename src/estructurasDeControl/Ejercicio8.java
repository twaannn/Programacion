package estructurasDeControl;

import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Eres culpable, sí o no?");
        String culpable = teclado.next();

        if (culpable.equals("sí") ) { // con String las comparaciones se hacen con el método ".equals()"
            System.out.println("A la cárcel");
        } else if (culpable.equals("no") ) {
            System.out.println("A casa");
        } else {
            System.out.println("Respuesta incorrecta");
        }

    }
}
