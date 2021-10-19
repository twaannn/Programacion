package estructurasDeControl;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;

public class Ejemplo15switch {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("¿Qué lenguaje estás estudiando?\na. Java\nb. Kotlin\nc. Scala\nd. Python");
        char opcion = teclado.next() .charAt(0); //para recoger por teclado variables tipo char

        switch (opcion){
            case 'a':
                System.out.println("Correcto");
                break;
            case 'b':
            case 'c':
            case 'd':
                System.out.println("Incorrecto");
                break;
            default:
                System.out.println("Respuesta incorrecto");
        }
    }
}
