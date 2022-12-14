package relacion_6;

import java.util.Scanner;

public class relacion_6_ej_15 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        float temp;

        System.out.println("Introduce la temperatura del dia: ");
        temp = scan.nextFloat();

        if(temp <= 10 ){
            System.out.println("hace frio");
        }else if(temp < 10 && temp <= 20){
            System.out.println("esta nublado");
        }else if(temp < 20 && temp <= 30){
            System.out.println("esta caluroso");
        }else{
            System.out.println("hace calor tropical");
        }

    }
}
