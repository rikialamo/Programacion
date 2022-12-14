package bucles2;

import java.util.Scanner;

public class ej_20 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int MCD=0;

        System.out.print("Introduce el 1º numero: ");
        int n1 = scan.nextInt();
        System.out.print("Introduce el 2º numero: ");
        int n2 = scan.nextInt();

        for(int i =2; i<=n1 && i<=n2;i++){
            if((n1%i)==0 && (n2%i)==0){
                MCD=i;
            }
        }

        if(MCD !=0) {
            System.out.println("El MCD es: " + MCD);
        }else{
            System.out.println("No hay MCD");
        }

    }
}
