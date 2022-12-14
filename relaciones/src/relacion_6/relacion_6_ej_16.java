package relacion_6;

import java.util.Scanner;

public class relacion_6_ej_16 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int i, cont=1;

        System.out.println("introduce un numero entre 0 y 99999");
        i = scan.nextInt();

        if (i>=10){
            i = i/10;
            cont++;
        }
        if (i>=10){
            i = i/10;
            cont++;
        }
        if (i>=10){
            i = i/10;
            cont++;
        }
        if (i>=10){
            i = i/10;
            cont++;
        }
        System.out.println("El numero tiene "+cont+" dígitos");


    }
}
