package relacion_6;

import java.util.Scanner;

public class relacion_6_ej_13_14 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        float precio;

        System.out.println("introduce el precio del producto: ");
        precio = scan.nextFloat();

        System.out.println("el precio con el decuento aplicado es: "+ (precio*0.85));

        //extension del 14

        System.out.println("ha obtenido un descuento de :"+ (precio*0.15));

    }
}
