package bucles3;

import java.util.Scanner;

public class ej_3 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int imp=1;

        System.out.print("Introduce un numero: ");
        int n = scan.nextInt();

        for(int i =0; i<n; i++){
            System.out.print(imp+", ");
            imp+=2;
        }
    }
}
