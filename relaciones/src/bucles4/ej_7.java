package bucles4;

import java.util.Scanner;

public class ej_7 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("de numeros que quieres :");
        int n = scan.nextInt(),op=1, res=0;

        System.out.print("Ej 6: ");
        for(int i = 0; i<n; i++){
            op*=2;
            res+=op;
        }
        System.out.println(res);

        op=1; res=0;

        System.out.print("Ej 7: ");
        for(int i = 0; i<n; i++){
            op+=7;
            res+=op;
        }
        System.out.println(res);

    }
}
