package bucles2;

import java.util.Scanner;

public class ej_15 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Introduce un numero: ");
        int n = scan.nextInt();

        //Versión enunciado

        int nCol = 1;

        for (int i = 0; i < n - 1; i++) {//el número de asteriscos que voy a imprimir es siempre impar, por loq hayo los n primeros impares
            nCol += 2;
        }
        int nAst = nCol;

        for (int i = 1; i <= n; i++) {

            for (int j = 0; j < ((nCol - nAst) / 2); j++) {//los espacios sigue la funcion nCol-nNum, y partido por 2 para la mitad
                System.out.print("  ");
            }
            for (int j = 0; j < nAst; j++) {
                System.out.print("* ");
            }


            System.out.println();
            nAst -= 2;                //decrementamos en 2 el nNum pq se le añaden 2 espacios, uno a cada lado

        }

        /* //versión ejemplo

        int nAst=n, nEspacios=0;

        for(int i =0; i<n; n-=2){

            for(int j=0; j<(nEspacios/2);j++){
                System.out.print("  ");
            }
            for(int j=0; j<nAst;j++){
                System.out.print("* ");
            }
            for(int j=0; j<(nEspacios/2);j++){
                System.out.print("  ");
            }
            nAst-=2;
            nEspacios+=2;
            System.out.println();

        }

        */
    }

}

