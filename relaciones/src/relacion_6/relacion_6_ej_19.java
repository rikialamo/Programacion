package relacion_6;

import java.util.Scanner;

public class relacion_6_ej_19 {

    public static void main(String[] args) {

        int total, h, m;

        Scanner scan = new Scanner(System.in);

        System.out.println("Introduce el numero de hombres: ");
        h = scan.nextInt();
        System.out.println("Introduce el numero de mujeres: ");
        m = scan.nextInt();

        total = h+m;
        System.out.println("El porcentaje de hombres es: "+((h*100)/total));
        System.out.println("El porcentaje de mujeres es: "+((m*100)/total));

    }
}
