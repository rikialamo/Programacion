package relacion_6;

import java.util.Scanner;

public class relacion_6_ej_12 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int cont = 3527;
        int cont2;

        System.out.println("introduce la contraseña");
        cont2 = scan.nextInt();

        if(cont == cont2){
            System.out.println("Contraseña correcta, accediendo al sistema");
        }else{
            System.out.println("Contraseña incorrecta, cerrando sesion");
        }

    }
}
