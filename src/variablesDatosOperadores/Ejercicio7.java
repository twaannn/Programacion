package variablesDatosOperadores;

import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Minutos");
        int minutos = teclado.nextInt();

        int horas = minutos / 60;
        int min = minutos % 60;
    }
}
