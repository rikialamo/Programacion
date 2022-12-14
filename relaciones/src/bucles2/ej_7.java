package bucles2;

import java.util.Scanner;

public class ej_7 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        boolean bool = false;

        while(!bool) {

            System.out.print("Introduce un numero del 1 al 12: ");
            int n = scan.nextInt();

            switch (n){
                case 1:
                    bool=true;
                    System.out.println("enero");
                    break;
                case 2:
                    bool=true;
                    System.out.println("febrero");
                    break;
                case 3:
                    bool=true;
                    System.out.println("marzo");
                    break;
                case 4:
                    bool=true;
                    System.out.println("abril");
                    break;
                case 5:
                    bool=true;
                    System.out.println("mayo");
                    break;
                case 6:
                    bool=true;
                    System.out.println("junio");
                    break;
                case 7:
                    bool=true;
                    System.out.println("julio");
                    break;
                case 8:
                    bool=true;
                    System.out.println("agosto");
                    break;
                case 9:
                    bool=true;
                    System.out.println("septiembre");
                    break;
                case 10:
                    bool=true;
                    System.out.println("octubre");
                    break;
                case 11:
                    bool=true;
                    System.out.println("noviembre");
                    break;
                case 12:
                    bool=true;
                    System.out.println("diciembre");
                    break;
                default:
                    System.out.println("numero incorrecto");
                    break;
            }

        }
        
    }
}
