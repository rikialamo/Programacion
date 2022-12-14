package bucles2;

import java.util.Scanner;

public class ej_19 {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);

        System.out.print("Introduce un numero: ");
        int n = scan.nextInt();

        int rev=0, x, n2=n;

        while(n>0){
            x=n%10;
            rev = (rev*10)+x;
            n/=10 ;
        }
        if(n2==rev){
            System.out.println("Es capicua");
        }else{
            System.out.println("No es capicua");
        }


    }
}
