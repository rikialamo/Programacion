package bucles4;

import java.util.Scanner;

public class ej_6 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("de numeros que quieres :");
        int n = scan.nextInt(),op=1;

        for(int i = 0; i<n; i++){
            op+=7;
            System.out.print(op+", ");

        }

    }
}
