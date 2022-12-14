package bucles2;

import java.util.Scanner;

public class ej_14 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Introduce un numero: ");
        int n = scan.nextInt();

        int nCol = 1, nAst = 1;

        nCol=(2*n)-1;

        for(int i =0; i<n; i++){

            for(int j = 0; j<((nCol-nAst)/2); j++){//los espacios sigue la funcion nCol-nNum, y partido por 2 para la mitad
                System.out.print("  ");
            }
            for(int j = 0; j<nAst; j++){
                System.out.print("* ");
            }

            System.out.println();
            nAst+=2;                //incrementamos en 2 el nNum pq se le añaden 2 asteriscos, uno a cada lado

        }


    }
}
