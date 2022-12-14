package bucles3;

import java.util.Scanner;

public class ej_7 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("numero de inicio de la cuenta atras :");
        int n = scan.nextInt();

        while(n>=0){
            System.out.println(n);
            n--;
        }

    }
}
