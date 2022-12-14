package bucles3;

import java.util.Scanner;

public class ej_9 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("de numeros que quieres :");
        int n = scan.nextInt();

        for(int i = 0; i<n; i++){
            System.out.print(((4*i)+3)+" ");
        }

    }
}
