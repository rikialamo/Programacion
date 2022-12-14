package CorreTimmy;

import java.util.Scanner;

public class main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int x = 1, y = 1, i , j;
        String mov;
        boolean fin =false;

        do {

            for (i = 0; i <= 19; i++) {
                for (j = 0; j <= 19; j++) {
                    if (i == x && j == y) {
                        System.out.print("T ");
                    } else if (i == 18 && j == 18) {
                        System.out.print("H ");
                    } else if (i == 0 || j == 0 || i == 19 || j == 19) {
                        System.out.print("* ");
                    } else {
                        System.out.print("  ");
                    }
                }
                System.out.println();
            }


            System.out.print("\nindica la direccion a moverte: ");
            mov = scan.next();

            if (mov.equalsIgnoreCase("N")) {
                x--;
            } else if (mov.equalsIgnoreCase("S")) {
                x++;
            } else if (mov.equalsIgnoreCase("E")) {
                y++;
            }else if (mov.equalsIgnoreCase("stop")){
                fin=true;
            }else{
                y--;
            }
            System.out.println();

            if(x == 0 || x == 19 || y == 0 || y == 19 || (x == 18 && y == 18)){
                fin=true;
            }


        } while ( !fin);

        if((x == 18 && y == 18)){

            System.out.println("Felicidades, has salvado a Timmy");

        }else{
            System.out.println("Lo siento, Timmy ha muerto");
        }

    }
}

