package examen1;

import java.util.Scanner;

public class joaquin {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        //ejercicio 1

        System.out.print(" ¿Vas a usar TODO el bote rojo para el primer color?");
        boolean rojo1 = scan.nextBoolean();
        System.out.print(" ¿Vas a usar TODO el bote verde para el primer color?");
        boolean verde1 = scan.nextBoolean();
        System.out.print(" ¿Vas a usar TODO el bote azul para el primer color?");
        boolean azul1 = scan.nextBoolean();

        System.out.print(" ¿Vas a usar MEDIO bote rojo para el primer color?");
        boolean medioRojo1 = scan.nextBoolean();
        System.out.print(" ¿Vas a usar MEDIO bote verde para el primer color?");
        boolean medioVerde1 = scan.nextBoolean();
        System.out.print(" ¿Vas a usar MEDIO bote azul para el primer color?");
        boolean medioAzul1 = scan.nextBoolean();

        System.out.print(" ¿Vas a usar TODO el bote rojo para el segundo color?");
        boolean rojo2 = scan.nextBoolean();
        System.out.print(" ¿Vas a usar TODO el bote verde para el segundo color?");
        boolean verde2 = scan.nextBoolean();
        System.out.print(" ¿Vas a usar TODO el bote azul para el segundo color?");
        boolean azul2 = scan.nextBoolean();

        System.out.print(" ¿Vas a usar MEDIO bote rojo para el segundo color?");
        boolean medioRojo2 = scan.nextBoolean();
        System.out.print(" ¿Vas a usar MEDIO bote verde para el segundo color?");
        boolean medioVerde2 = scan.nextBoolean();
        System.out.print(" ¿Vas a usar MEDIO bote azul para el segundo color?");
        boolean medioAzul2 = scan.nextBoolean();

        System.out.println("1 = verde lima o verde claro y 2= azul claro o celeste oscuro: " +
                (((medioRojo1 && verde1 && !azul1 && !medioAzul1) || (!rojo1 && !medioRojo1 && verde1 && medioAzul1)) &&
                        ((!rojo2 && !medioRojo2 && medioVerde2 && azul2) || (!rojo2 && !medioRojo2 && medioVerde2 &&
                                medioAzul2))));

        // ejercicio 2a

        int cont = 0, x, y;

        do {
            System.out.print("Introduce x que tiene que ser >=0: ");
            x = scan.nextInt();
            System.out.print("Introduce y que tiene que ser >=0: ");
            y = scan.nextInt();
        } while (x < 0 && y < 0);

        for (int i = 0; i <= x; i++) {
            for (int j = 0; j <= y; j++) {
                System.out.println("(" + i + ", " + j + ")");
                cont++;
            }
        }
        System.out.println("El contador de iteraciones vale: " + cont);


        //ejercicio 2b

        int cont2 = 0, x2, y2;

        do {
            System.out.print("Introduce x que tiene que ser >=0: ");
            x2 = scan.nextInt();
            System.out.print("Introduce y que tiene que ser >=0: ");
            y2 = scan.nextInt();
        } while (x2 < 0 && y2 < 0);

        for (int i = 0; i <= x2; i++) {
            for (int j = 0; j <= y2; j++) {
                System.out.printf("(%d, %d)", i, j);
                cont2++;
            }
            System.out.println();
        }

        System.out.println("El contador de iteraciones vale: " + cont2);
    }
}
