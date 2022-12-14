package relacion_6;

import java.util.Scanner;

public class relacion_6_ej_11 {

    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);

        int mes;

        System.out.println("introduce un número del 1 al 12: ");
        mes = scan.nextInt();

        if(mes <= 12 && mes >0){
            if(mes==1){
                System.out.println("enero");
            }else if(mes==2){
                System.out.println("febrero");
            }else if(mes==3){
                System.out.println("marzo");
            }else if(mes==4){
                System.out.println("abril");
            }else if(mes==5){
                System.out.println("mayo");
            }else if(mes==6){
                System.out.println("junio");
            }else if(mes==7){
                System.out.println("julio");
            }else if(mes==8){
                System.out.println("agosto");
            }else if(mes==9){
                System.out.println("septiembre");
            }else if(mes==10){
                System.out.println("octubre");
            }else if(mes==11){
                System.out.println("noviembre");
            }else if(mes==12){
                System.out.println("diciembre");
            }
        }else{
            System.out.println("numero incorrecto");
        }

    }
}
