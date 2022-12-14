package bucles2;

import java.util.Scanner;

public class ej_3 {

    public static void main(String[] args) {

        int contraseña = 256, prueba=0;

        Scanner scan = new Scanner(System.in);

        do{
            System.out.print("Introduce una contraseña: ");
            prueba = scan.nextInt();
        }while(contraseña!=prueba);

        System.out.println("Contraseña correcta");

    }
}
