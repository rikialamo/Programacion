package bucles;

import java.util.Scanner;

public class ej_7 {

    public static void main(String[] args) {

        int n;

        Scanner scan = new Scanner(System.in);

        System.out.print("Introduce un numero: ");
        n = scan.nextInt();

        if(n != 0 && n>1){

            for(int i = 1; i<=n; i++ ){

                System.out.print("0 ");

                if((i*2)==n || (i*2)+1==n){

                    System.out.print("1 ");
                    i++;

                }
            }
        }

    }
}