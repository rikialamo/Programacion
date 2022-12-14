package bucles;

import java.util.Scanner;

public class ej_21 {

    public static void main(String[] args) {

        int n;
        char c;

        Scanner scan = new Scanner(System.in);

        System.out.print("Introduce un numero: ");
        n = scan.nextInt();
        System.out.print("Introduce una letra: ");
        c= scan.next().charAt(0);

        for(int i = 0; i<n; i++){
            System.out.println(c);
        }

    }
}
