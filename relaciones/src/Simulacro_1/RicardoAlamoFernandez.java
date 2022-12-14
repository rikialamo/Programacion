package Simulacro_1;

import java.util.Scanner;

public class RicardoAlamoFernandez {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int ejercicio;

        do {
            System.out.print("Que ejercicio quiere ejecutar: ");
            ejercicio = scan.nextInt();


            if (ejercicio == 1) {   //ejercicio 1

                System.out.print("Bienvenido al juego de rol, elija el genero de su personaje: ");
                int nGenero = scan.nextInt();
                String genero;

                if (nGenero != 2) {
                    nGenero = 1;
                    genero = "mujer";
                } else {
                    genero = "hombre";
                }

                System.out.println("ha elegido " + genero + " como clase");

                if (nGenero == 1) {
                    System.out.println("1 -> Clase Asesina");
                    System.out.println("2 -> Clase Druida");
                    System.out.println("3 -> Clase Amazona");
                } else {
                    System.out.println("1 -> Clase Buscavidas");
                    System.out.println("2 -> Clase Guerrero");
                    System.out.println("3 -> Clase Mago");
                }

                System.out.print("Elija la clase: ");
                int nClase = scan.nextInt();

                if (nGenero == 1 && nClase == 2) {
                    System.out.println("ha elegido Druida como clase");
                } else if (nGenero == 1 && nClase == 3) {
                    System.out.println("ha elegido Amazona como clase");
                } else if (nGenero == 2 && nClase == 2) {
                    System.out.println("ha elegido Guerrero como clase");
                } else if (nGenero == 2 && nClase == 3) {
                    System.out.println("ha elegido Mago como clase");
                } else if (nGenero == 1) {
                    System.out.println("ha elegido Asesina como clase");
                } else if (nGenero == 2) {
                    System.out.println("ha elegido Buscavidas como clase");
                }

            } else if (ejercicio == 2) {//ejercicio 2

                System.out.println("El propio examen es el menu");

            }else if(ejercicio == 3){//ejercicio 3

                String rojo = "\033[0;31m";
                String amarillo = "\033[0;33m";
                String reset = "\033[0m";

                System.out.println("introduce el tamaño");
                int n = scan.nextInt();

                for(int i = 1; i <= n; i++) {
                    for (int j = 1; j <= i; j++) {

                        if(j != 1 && j != i){
                            System.out.print(amarillo+"* ");
                            System.out.print(reset);
                        }else{
                            System.out.print(rojo+"* ");
                            System.out.print(reset);
                        }

                    }
                    System.out.println();
                }

                for(int i = (n-1); i >= 1; i--) {
                    for (int j = 1; j <= i; j++) {

                        if(j != 1 && j != i){
                            System.out.print(amarillo+"* ");
                            System.out.print(reset);
                        }else{
                            System.out.print(rojo+"* ");
                            System.out.print(reset);
                        }

                    }
                    System.out.println();
                }

                //extra

                System.out.println();
                System.out.println("Extra");
                System.out.println();

                System.out.println("introduce el tamaño");
                n = scan.nextInt();
                int n2=1;

                for(int i = (n-1); i >= 1; i--) {

                    for (int j = 0; j < i; j++) {//espacios
                            System.out.print("  ");

                    }

                    for (int j = 1; j <= n2; j++) {//asteriscos

                        if(j != 1 && j != n2){
                            System.out.print(amarillo+"* ");
                            System.out.print(reset);
                        }else{
                            System.out.print(rojo+"* ");
                            System.out.print(reset);
                        }
                    }
                    n2++;

                    System.out.println();
                }

                n2--;

                for(int i = 1; i <= n; i++) {

                    for (int j = 1; j < i; j++) {

                            System.out.print("  ");

                    }


                    for (int j = 0; j <= n2; j++) {//asteriscos

                        if(j != 0 && j != n2){
                            System.out.print(amarillo+"* ");
                            System.out.print(reset);
                        }else{
                            System.out.print(rojo+"* ");
                            System.out.print(reset);
                        }

                    }

                    n2--;

                    System.out.println();
                }

        }else if(ejercicio ==4){//ejercicio 4



                System.out.print("Has hecho bien el ejercicio 1, 2,4?");
                boolean bool1 =scan.nextBoolean();
                System.out.print("Has intentado el ejercicio 3?");
                boolean bool2 = scan.nextBoolean();
                System.out.print("Has hecho bien el ejercicio 3?");
                boolean bool3 = scan.nextBoolean();
                System.out.print("Te has olvidado del los ejercicios 1 y 2?");
                boolean bool4 = scan.nextBoolean();

                if((bool1 && !bool2) || (bool3 && !bool4)){
                    System.out.println("Felicidades, eres una persona cuerda");
                }else {
                    System.out.println("Lo siento, estas loco");
                }

            }
        }while(ejercicio !=0);

        System.out.println("Examen finalizado");
    }

}
