package relacion_6;

import java.util.Scanner;

public class relacion_6_ej_24 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int n;

        System.out.println("Introduce un numero");
        n = scan.nextInt();

        if(n%10==0){
            System.out.println("Es múltiplo de 10");
        }else{
            System.out.println("No es múltiplo de 10");
        }

    }
}
