package relacion_6;

import java.util.Scanner;

public class relacion_6_ej_9 {

    public static void main(String[] args) {

        int a;

        Scanner scan = new Scanner(System.in);

        System.out.println("introduce el primer numero: ");
        a= scan.nextInt();

        if(a%2 == 0){
            System.out.println("es par");
        }else{
            System.out.println("es impar");
        }

    }
}
