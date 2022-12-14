package relacion_6;

import java.util.Scanner;

public class relacion_6_ej_22 {

    public static void main(String[] args) {

        int x, y, z;

        Scanner scan = new Scanner(System.in);

        System.out.println("Introduce el primer numero: ");
        x = scan.nextInt();
        System.out.println("Introduce el segundo numero: ");
        y = scan.nextInt();
        System.out.println("Introduce el tercer numero: ");
        z = scan.nextInt();



        if (x >= y) {
            if (y >= z) {
                System.out.println(x + ", " + y + ", " + z);
            } else if (x >= z) {
                System.out.println(x + ", " + z + ", " + y);
            } else if (z > x) {
                System.out.println(z + ", " + x + ", " + y);
            }

        } else if (x < y) {
            if (x >= z) {
                System.out.println(y + ", " + x + ", " + z);
            } else if (y >= z) {
                System.out.println(y + ", " + z + ", " + x);
            } else {
                System.out.println(z + ", " + y + ", " + x);
            }
        }

        /*

        int camb;

        if(x>y){
            camb = x;
            x = y;
            y = camb;
        }
        if(y>z){
            camb = y;
            y = z;
            z = camb;
        }
        if(x>y){
            camb = x;
            x = y;
            y = camb;
        }

        System.out.println(x+", "+y+", "+z);


         */
    }
}
