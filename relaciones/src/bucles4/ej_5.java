package bucles4;

import java.util.Scanner;

public class ej_5 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("de numeros que quieres :");
        int n = scan.nextInt(),res=1;

        for(int i = 0; i<n; i++){
            res*=2;
            System.out.print(res+", ");

        }

    }
}
