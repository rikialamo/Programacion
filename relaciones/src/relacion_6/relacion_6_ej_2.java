package relacion_6;

import java.util.Scanner;

public class relacion_6_ej_2 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int n;

        System.out.println("Introduce 1 número");
        n = scan.nextInt();

        if (n<0){
            System.out.println(n+" es negativo");
        }else{
            System.out.println(n + " es positivo");
        }
    }
}
