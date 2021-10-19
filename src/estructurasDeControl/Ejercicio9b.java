package estructurasDeControl;

import java.util.Scanner;

public class Ejercicio9b {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        String usuarioCorrecto = "user";
        String contraseñaCorrecta = "1234";

        System.out.println("Introduzca el usuario: ");
        String usuario = teclado.nextLine();
        if (usuario.equals(usuarioCorrecto)) {
            System.out.println("Introduzca la contraseña:");
            String pw = teclado.nextLine();
            if (pw.equals(contraseñaCorrecta)) {
                System.out.println("Has entrado al sistema");
            } else {
                System.out.println("Contraseña incorrecta");
            }
        } else {
            System.out.println("Usuario incorrecto");
        }
    }
}