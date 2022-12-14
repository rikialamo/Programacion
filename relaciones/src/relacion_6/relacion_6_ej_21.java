package relacion_6;

import java.util.Scanner;

public class relacion_6_ej_21 {

    public static void main(String[] args) {

        int x, y;

        Scanner scan = new Scanner(System.in);

        System.out.println("Introduce el primer numero: ");
        x = scan.nextInt();
        System.out.println("Introduce el segundo numero: ");
        y = scan.nextInt();

        if(x<y){
            System.out.println(x+", "+y);
        }else if(y<x){
            System.out.println(y+", "+x);
        }else{
            System.out.println(x+" = "+y);
        }

    }
}
