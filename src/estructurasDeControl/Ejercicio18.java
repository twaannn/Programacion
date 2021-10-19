package estructurasDeControl;

import java.util.Random;

public class Ejercicio18 {
    public static void main(String[] args) {
        Random rnd = new Random();
        char c = (char) ('a' + rnd.nextInt(26));

        System.out.println("Carácter aleatorio generado -> " + c);

        if ( c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
            System.out.println("Es vocal");
        } else {
            System.out.println("Es consonante");
        }
    }
}

