package Entrega_2;

import java.util.Scanner;

public class Validación_DNI {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int numDni;

        System.out.print("Introduce el numero de tu DNI");
        numDni = scan.nextInt();

        if(numDni >99999999 && numDni<0){
            System.out.println("numero no valido");
        }else{
            switch(numDni%23){
                case 0:
                    System.out.println(numDni+"T");
                    break;
                case 1:
                    System.out.println(numDni+"R");
                    break;
                case 2:
                    System.out.println(numDni+"W");
                    break;
                case 3:
                    System.out.println(numDni+"A");
                    break;
                case 4:
                    System.out.println(numDni+"G");
                    break;
                case 5:
                    System.out.println(numDni+"M");
                    break;
                case 6:
                    System.out.println(numDni+"Y");
                    break;
                case 7:
                    System.out.println(numDni+"F");
                    break;
                case 8:
                    System.out.println(numDni+"P");
                    break;
                case 9:
                    System.out.println(numDni+"D");
                    break;
                case 10:
                    System.out.println(numDni+"X");
                    break;
                case 11:
                    System.out.println(numDni+"B");
                    break;
                case 12:
                    System.out.println(numDni+"N");
                    break;
                case 13:
                    System.out.println(numDni+"J");
                    break;
                case 14:
                    System.out.println(numDni+"Z");
                    break;
                case 15:
                    System.out.println(numDni+"S");
                    break;
                case 16:
                    System.out.println(numDni+"Q");
                    break;
                case 17:
                    System.out.println(numDni+"V");
                    break;
                case 18:
                    System.out.println(numDni+"H");
                    break;
                case 19:
                    System.out.println(numDni+"L");
                    break;
                case 20:
                    System.out.println(numDni+"C");
                    break;
                case 21:
                    System.out.println(numDni+"K");
                    break;
                case 22:
                    System.out.println(numDni+"E");
                    break;
                default:
                    break;
            }
        }

    }
}
