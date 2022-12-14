package bucles2;

import java.util.Scanner;

public class bucles2_fibonacci {

    public static void main(String[] args) {

        Scanner scan  =new Scanner(System.in);

        int n0=0, n1=1, aux;

        System.out.print("introduce en numero de terminos que quieres imprimir: ");
        int n = scan.nextInt();

        if(n==1){
            System.out.print("0");
        }else if(n<=2){
            System.out.print("0, 1");
        }else {
            System.out.print("0, 1, ");
            for (int i = 0; i < n - 2; i++) {
                System.out.print((n0 + (n1)) + ", ");
                aux = n1;
                n1 = n0 + (n1);
                n0 = aux;
            }
        }

    }
}
