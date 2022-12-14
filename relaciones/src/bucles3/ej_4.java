package bucles3;

import java.util.Scanner;

public class ej_4 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Introduce un numero: ");
        int n = scan.nextInt();

        int i = 1, cont=0;

        while( cont<n){
            if(Math.sqrt(i)==((int)Math.sqrt(i))){
                System.out.print(i+", ");
                cont++;
            }
            i++;
        }
    }
}
