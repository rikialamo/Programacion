package relacion_6;

import java.util.Scanner;

public class relacion_6_ej_1 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int n, n2;

        System.out.println("Introduce 2 números");
        n = scan.nextInt();
        n2 = scan.nextInt();

        if (n<n2){
            System.out.println(n2+" es mayor");
        }else if(n>n2){
            System.out.println(n+" es mayor");
        }else{
            System.out.println("son iguales");
        }

    }
}
