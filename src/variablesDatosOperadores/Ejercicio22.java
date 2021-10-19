package variablesDatosOperadores;

import java.util.Scanner;

public class Ejercicio22 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Nota 1ª evaluación Programación:");
        double prog1 = teclado.nextDouble();

        System.out.println("Nota 1ª evaluación Entornos de desarrollo:");
        double ed1 = teclado.nextDouble();

        System.out.println("Nota 1ª evaluación Bases de datos:");
        double bd1= teclado.nextDouble();

        System.out.println("Nota 1ª evaluación Sistemas informáticos:");
        double si1 = teclado.nextDouble();

        System.out.println("Nota 1ª evaluación Lenguaje de marcas:");
        double lm1 = teclado.nextDouble();

        System.out.println("Nota 1ª evaluación FOL :");
        double fol1 = teclado.nextDouble();



        System.out.println("Nota 2ª evaluación Programación:");
        double prog2 = teclado.nextDouble();

        System.out.println("Nota 2ª evaluación Entornos de desarrollo:");
        double ed2 = teclado.nextDouble();

        System.out.println("Nota 2ª evaluación Bases de datos:");
        double bd2= teclado.nextDouble();

        System.out.println("Nota 2ª evaluación Sistemas informáticos:");
        double si2 = teclado.nextDouble();

        System.out.println("Nota 2ª evaluación Lenguaje de marcas:");
        double lm2 = teclado.nextDouble();

        System.out.println("Nota 2ª evaluación FOL :");
        double fol2 = teclado.nextDouble();



        System.out.println("Nota 3ª evaluación Programación:");
        double prog3 = teclado.nextDouble();

        System.out.println("Nota 3ª evaluación Entornos de desarrollo:");
        double ed3 = teclado.nextDouble();

        System.out.println("Nota 3ª evaluación Bases de datos:");
        double bd3= teclado.nextDouble();

        System.out.println("Nota 3ª evaluación Sistemas informáticos:");
        double si3 = teclado.nextDouble();

        System.out.println("Nota 3ª evaluación Lenguaje de marcas:");
        double lm3 = teclado.nextDouble();

        System.out.println("Nota 3ª evaluación FOL :");
        double fol3 = teclado.nextDouble();

        double sumaprog = prog1 + prog2 + prog3;
        double sumaed = ed1 + ed2 + ed3;
        double sumabd = bd1 + bd2 + bd3;
        double sumasi = si1 + si2 + si3;
        double sumalm = lm1 + lm2 + lm3;
        double sumafol = fol1 + fol2 + fol3;

        double mediaprog = sumaprog/3;
        double mediaed = sumaed/3;
        double mediabd = sumabd/3;
        double mediasi = sumasi/3;
        double medialm = sumalm/3;
        double mediafol = sumafol/3;

        double sumatotal = mediaprog + mediaed + mediabd + mediasi + medialm + mediafol;
        double mediatotal = sumatotal/3;



        System.out.println("La media del curso es -->" + Math.round(mediatotal));

    }
}
