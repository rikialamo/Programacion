package relacion_6;

import java.util.Scanner;

public class relacion_6_ej_7 {

    public static void main(String[] args) {


        int[] n = new int[6];
        int[] premio = {1, 3, 10, 20, 33, 40};
        int cont;
        boolean b = true;

        Scanner scan = new Scanner(System.in);

        for (cont = 0; cont < 6; cont++) {

            System.out.println("Introduce el º" + (cont + 1) + " numero:");
            n[cont] = scan.nextInt();
        }
        cont = 0;

        while (cont < 6 && b == true) {

            if (n[cont] != premio[cont]) {
                b = false;
            } else{
                cont++;
            }
        }

        if (b) {
            System.out.println("¡¡¡BOLETO GANADOR!!!");
        } else {
            System.out.println("Más suerte la próxima vez");
        }

    }
}
