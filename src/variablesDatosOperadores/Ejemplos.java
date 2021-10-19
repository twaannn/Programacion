package variablesDatosOperadores;

import java.util.Scanner;

public class Ejemplos {
    public static void main(String[] args) {
        //Tipos de datos primitivos

        //Nº enteros
        long largo; //Ocupa 64 bits (64/8 = 8 byte) de memoria. Se utiliza para números muy grandes
        int entero; //32 bits => 4 bytes
        short corto; // 16 bits => 2 bytes
        //byte b; // 8 bits

        //Los nº enteros se pueden sumar, restar, multiplicar, dividir

        //División entera
        int a = 25;
        int b = 8;
        int c = a / b; // 3 / es el cociente

        System.out.println(c);
        int resto = a % b; // resto o módulo de la división entera// "%" no es porcentaje, es módulo
        System.out.println(resto);

        //ejemplo pág.6 -> lo hacemos con scanner

        // Primero recogemos los datos
        Scanner teclado = new Scanner(System.in);
        int num1 = teclado.nextInt();
        int num2 = teclado.nextInt();

        // Después operamos con los datos, los procesamos
        int suma = num1 + num2;
        int resta = num1 - num2;
        int producto = num1 * num2;
        int cociente = num1 / num2;
        int restx = num1 % num2;

        // Finalmente, mostramos el resultado
        System.out.println("Suma de: " + num1 + " + " + num2 + " = " + suma);
        System.out.println("Resta de: " + num1 + " - " + num2 + " = " + resta);
        System.out.println("Producto de: " + num1 + " * " + num2 + " = " + producto);
        System.out.println("Cociente de: " + num1 + "/" + num2 + " = " + cociente);
        System.out.println("Resto de: " + num1 + " % " + num2 + " = " + restx);
    }
}
