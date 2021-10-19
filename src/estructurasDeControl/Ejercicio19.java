package estructurasDeControl;

import java.util.Scanner;

public class Ejercicio19 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce un nº del 1 al 7");
        int ds = teclado.nextInt();

        switch (ds){
            case 1:
                System.out.println("Lunes");
                break;
            case 2:
                System.out.println("Martes");
                break;
            case 3:
                System.out.println("Miércoles");
                break;
            case 4:
                System.out.println("Jueves");
            case 5:
                System.out.println("Viernes");
                break;
            case 6:
                System.out.println("Sábado");
            case 7:
                System.out.println("Domingo");
                break;
            default:
                System.out.println("Respuesta incorrecta");
        }
    }
}
