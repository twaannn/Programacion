package variablesDatosOperadores;

import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Momento inicial:");
        System.out.println("================");

        System.out.println("Introduce la hora:");
        int hora_i= teclado.nextInt();

        System.out.println("Introduce los minutos:");
        int minutos_i = teclado.nextInt();

        System.out.println("Introduce los segundos:");
        int segundos_i = teclado.nextInt();

        System.out.println("Momento final:");
        System.out.println("==============");

        System.out.println("Introduce la hora:");
        int hora_f= teclado.nextInt();

        System.out.println("Introduce los minutos:");
        int minutos_f = teclado.nextInt();

        System.out.println("Introduce los segundos:");
        int segundos_f = teclado.nextInt();

        int restah = hora_f - hora_i;
        int restam = minutos_f - minutos_i;
        int restas = segundos_f - segundos_i;

        System.out.println("Datos introducidos --> Momento inicial: " + hora_i + ":" + minutos_i + ":" + segundos_i + " Momento final: " + hora_f + ":" + minutos_f + ":" + segundos_f);

        System.out.println("La diferencia entre ambos es: " + restah + ":" + restam + ":" + restas);
    }
}
