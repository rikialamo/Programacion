package bucles2;

import java.util.Scanner;

public class ej_1 {

    public static void main(String[] args) {

        String nombre;

        Scanner scan = new Scanner(System.in);

        System.out.print("Introduce un nombre: ");
        nombre = scan.nextLine();

        for(int i=0 ; i<10 ; i++){
            System.out.println("Hola, me llamo "+nombre);
        }

    }
}
