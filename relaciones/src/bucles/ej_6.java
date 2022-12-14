package bucles;

import java.util.Scanner;

public class ej_6 {

    public static void main(String[] args) {

        int n;

        Scanner scan = new Scanner(System.in);

        System.out.print("Introduce un numero: ");
        n = scan.nextInt();

        if(n != 0){
            for(int i = 0; i<n-1 && n>1; i++ ){
                System.out.print("0 ");
            }
            System.out.println("1");
        }

    }
}
