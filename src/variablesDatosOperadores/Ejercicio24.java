package variablesDatosOperadores;

import java.util.Scanner;

public class Ejercicio24 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Producto comprado: ");
        String prodnom = teclado.nextLine();

        System.out.println("Unidades del producto compradas: ");
        int uds = teclado.nextInt();

        System.out.println("Precio del producto comprado: ");
        double price = teclado.nextDouble();

        System.out.println("Porcentaje de IVA aplicado sobre el producto");
        double iva1 = teclado.nextDouble();

        System.out.println("Se ha(n) comprado " + uds + " unidad(es) del producto " + prodnom + ", al cual se le aplica un " + iva1 + "% de IVA");

        double siniva = uds * price;
        double iva2 = (siniva * iva1)/100;
        double total = siniva + iva2;

        System.out.println("El precio total a abonar es de " + total + "€");
    }
}
