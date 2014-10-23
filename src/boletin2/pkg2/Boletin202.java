//Debe permitir calular el area de un cuadrado con entrada de datos.
package boletin2.pkg2;

import java.util.Scanner;

public class Boletin202 {

    public static void main(String[] args) {
        // Codigo de la aplicación
        float b, h, a;
        //b=base h=altura a=area
        System.out.println("Introduzca sus datos para calcular el area de un Cuadrado");

        System.out.println("Base: ");
        Scanner dato = new Scanner(System.in);
        b = dato.nextFloat();
        System.out.println("altura ");
        h = dato.nextFloat();

        a = b * h;

        System.out.println("Area del cuadrado: " + a);

    }

}
