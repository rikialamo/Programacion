package bucles3;

import java.util.Scanner;

public class ej_5 {

    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);

        System.out.print("Introduce un numero: ");
        int n = scan.nextInt(), sum=0;

        for (int i = 1; i <= n; i++) {
            System.out.print(i);
            sum+=i;
            if(i<n){
                System.out.print("+");
            }else{
                System.out.print("=");
            }
        }
        System.out.print(" "+sum);
    }
}
