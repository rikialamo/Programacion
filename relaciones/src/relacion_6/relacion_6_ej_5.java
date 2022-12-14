package relacion_6;

import java.util.Scanner;

public class relacion_6_ej_5 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int edad;

        System.out.println("introduce tu edad en años");
        edad = scan.nextInt();

        if(edad<18){
            System.out.println("eres menor de edad");
        }else{
            System.out.println("eres mayor de edad");
            if(edad>=67){
                System.out.println("eres un jubilado");
            }
        }

    }
}
