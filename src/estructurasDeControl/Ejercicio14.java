package estructurasDeControl;

import java.util.Scanner;

public class Ejercicio14 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Nº de alumnos que van al viaje");
        int alumnos = teclado.nextInt();

        int cny1 = alumnos * 65;
        int cny2 = alumnos * 70;
        int cny3 = alumnos * 95;

        if (alumnos >= 100) {
            System.out.println("El costo por alumno será de 65€");
            System.out.println("Habrá que pagar " + cny1 + "€ a la compañía");
        } else if (alumnos >= 50 && alumnos <= 99) {
            System.out.println("El costo por alumno será de 70€");
        System.out.println("Habrá que pagar " + cny2 + "€ a la compañía");
        }
        if (alumnos >= 30 && alumnos <= 49){
            System.out.println("El costo por alumno será de 95€");
            System.out.println("Habrá que pagar " + cny3 +  "€ a la compañía ");
        } else if (alumnos < 30) {
            System.out.println("El costo será de 4000€");
        }
    }
}
