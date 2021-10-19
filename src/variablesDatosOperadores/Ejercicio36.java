package variablesDatosOperadores;

public class Ejercicio36 {
    public static void main(String[] args) {
        byte b = 1;
        short s = 2;
        int i = 3;
        long l = 4L;
        float f = 5F;
        double d = 6;
        char c = 7; // ojo, no pongo 7; 7 es un nº en la tabla ASCII
        boolean bool = true;

        // A continuación, asignamos una variable a todas las demás
        // Empezamos con byte
        s = b; // Todos estos son casting implícito (basta el "=")
        i = b ;
        l = b;
        f = b;
        d = b;
        c = (char) b; // NO impícito, pero puedo hacer casting explícito
       // bool = b; // NO
        b = (byte) s; // Esto es casting explícito, puedes hacer la conversión pero "forzando"
        // Si no funciona el casting implícito, probamos el casting explícito
        // bool = (boolean) b; //NO, ni siquiera admite casting explícito
        long numG = 100_000_000_000_000L;
        //Casting a int
        int num = (int) numG;
        System.out.println(num);

        /* ¿Cómo se el nº máximo que puedo poner en un int?
        System.out.println(Integer.MAX_VALUE); //nº máximo de int
        System.out.println(Integer.MIN_VALUE);// nº mínimo de int */

        // también podemos verlo con
        long varL = Long.MAX_VALUE;
    }
}
