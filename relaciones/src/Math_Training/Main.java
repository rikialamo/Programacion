package Math_Training;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int recordAciertos = 0, aciertos, n1, n2, operacion, resultado;
        long recordTiempo = 0, tiempo;
        long startTime= 0, endTime = 0;
        String inicio;

        Scanner scan = new Scanner(System.in);

        System.out.println("Bienvenido a Math Trainig, quiere empezar una partida?");
        inicio = scan.next();

        while(inicio.equalsIgnoreCase ("Si")){

            startTime = System.nanoTime();
            aciertos=0;
            boolean condicion = true;

            System.out.println("Ready, Steady.....GO");

            while(condicion) {

                operacion = (int) (Math.random() * 4);
                n1 = (int) (Math.random() * 101);
                n2 = (int) (Math.random() * 101);

                switch (operacion) {
                    case 0:
                        System.out.println("SUMA");
                        System.out.print(n1 + " + " + n2+"= ");
                        resultado = scan.nextInt();

                        if ((n1 + n2) == resultado) {

                            aciertos++;
                            System.out.println("CORRECTO");

                        }else{

                            endTime = System.nanoTime();
                            condicion = false;

                        }
                        break;
                    case 1:
                        System.out.println("RESTA");
                        System.out.print(n1 + " - " + n2+"= ");
                        resultado = scan.nextInt();

                        if ((n1 - n2) == resultado) {

                            aciertos++;
                            System.out.println("CORRECTO");

                        }else{

                            endTime = System.nanoTime();
                            condicion = false;

                        }
                        break;
                    case 2:
                        System.out.println("MULTIPLICACION");
                        System.out.print(n1 + " * " + n2+"= ");
                        resultado = scan.nextInt();

                        if ((n1 * n2) == resultado) {

                            aciertos++;
                            System.out.println("CORRECTO");

                        }else{

                            endTime = System.nanoTime();
                            condicion = false;

                        }
                        break;
                    case 3:
                        System.out.println("DIVISION ENTERA");

                        if(n2==0){
                            n2++;
                        }

                        System.out.print(n1 + " / " + n2+"= ");
                        resultado = scan.nextInt();

                        if ((n1 / n2) == resultado) {

                            aciertos++;
                            System.out.println("CORRECTO");

                        }else{

                            endTime = System.nanoTime();
                            condicion = false;

                        }
                        break;
                }
            }

            tiempo = (endTime - startTime)/ 1000000000;
            System.out.println("GAME OVER\nBien jugado, has tenido "+aciertos+" aciertos y has tardado "+tiempo+" segundos");

            if (aciertos>recordAciertos){
                if (tiempo>recordTiempo){
                    recordAciertos=aciertos;
                    recordTiempo=tiempo;
                    System.out.println("Felicidades, has batido el record!!!!");
                    System.out.println("Record actual: \nAciertos = "+recordAciertos+"   Tiempo = "+recordTiempo);
                }
            }

            System.out.print("¿Quiere seguir jugando?: ");
            inicio = scan.next();

        }

        System.out.println();
        System.out.println("___________________________________");
        System.out.println();
        System.out.println("Record del Juego: \nAciertos = "+recordAciertos+"\tTiempo = "+recordTiempo);
        System.out.println();
        System.out.println("GRACIAS POR JUGAR.");

    }
}
