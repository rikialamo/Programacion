package bucles2;

import java.util.Scanner;

public class ej_4 {

    public static void main(String[] args) {

        int n=0;

        Scanner scan = new Scanner(System.in);


        while(n==0){
            System.out.print("Introduce un numero distinto de 0: ");
            n = scan.nextInt();
        }

        if(n<0){
            System.out.println("Es negativo");
        }else{
            System.out.println("Es positivo");
        }

    }
}
