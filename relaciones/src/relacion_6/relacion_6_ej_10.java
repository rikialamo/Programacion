package relacion_6;

import java.util.Scanner;

public class relacion_6_ej_10 {

    public static void main(String[] args) {

        float peso, altura;
        float imc;

        Scanner scan= new Scanner(System.in);

        System.out.println("introduce tu peso(en kgs): ");
        peso = scan.nextFloat();
        System.out.println("introduce tu altura(en m): ");
        altura = scan.nextFloat();

        imc = (float) (peso/(Math.pow(altura, 2)));

        if(imc<25){
            System.out.println("peso ideal");
        }else if(imc>=25 && imc<30){
            System.out.println("tiene sobrepeso");
        }else{
            System.out.println("tiene obesidad");
        }
    }
}
