package estructurasDeControl;

import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        String usuarioCorrecto = "user";
        String contraseñaCorrecta = "1234";

        System.out.println("Introduzca el usuario: ");
        String usuario = teclado.nextLine();

        System.out.println("Introduzca la contraseña: ");
        String pw = teclado.nextLine();

        if (usuario.equals(usuarioCorrecto) && pw.equals(contraseñaCorrecta)) {
            System.out.println("Login succesful!");
        } else {
            System.out.println("Usuario o contraseña incorrectos :( ");
        }
    }
}
