package estructurasDeControl;

import java.util.Scanner;

public class Pruebas {
    public static void main(String[] args) {


        // ESTRUCTURA CONDICIONAL

        // PRIMER CASO:
        Scanner teclado = new Scanner(System.in);
        System.out.println("Edad: ");
        int edad = teclado.nextInt();
        if (edad >= 18) {
            System.out.println("Mayor de edad. Adelante");
        }
        System.out.println("Siguiente instrucción tras el 'if'");

        // Puedo poner solo 1 variable booleana
        boolean abierta = true;
        if (abierta) { // abierta == true
            System.out.println("Pasa");
        }
        System.out.println("Después");

        // 2º caso: if - else (2 posibilidades)
        if (edad >= 18) {
            // instrucciones true
            System.out.println("Adelante");
        } else { // edad < 18
            //instrucciones false
            System.out.println("No puedes pasar");
        }
    }
}
