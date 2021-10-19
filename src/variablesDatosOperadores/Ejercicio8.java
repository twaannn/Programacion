package variablesDatosOperadores;

import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Segundos: ");
        int seg = teclado.nextInt();

        int horas = seg/3600;

        int minutos =(seg%3600)/60;

        int segundos = (seg%3600)%60;


        System.out.println(seg + " segundos son: " + horas +  " horas, " + minutos + " minutos y " + segundos + " segundos.");
    }
}
