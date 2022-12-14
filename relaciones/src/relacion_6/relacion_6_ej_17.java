package relacion_6;

import java.sql.SQLOutput;
import java.util.Scanner;

public class relacion_6_ej_17 {

    public static void main(String[] args) {

        String nombre;

        Scanner scan = new Scanner(System.in);

        System.out.println("Introduce el nombre de la facultad a estudiar: ");
        nombre = scan.nextLine();

        switch (nombre){
            case "Ing.de Sistemas":
                System.out.println("Importe de la matricula: 350");
                System.out.println("Importe de la mensualidad: 650");
                break;
            case "Derecho":
                System.out.println("Importe de la matricula: 300");
                System.out.println("Importe de la mensualidad: 550");
                break;
            case "Ing. Naviera":
                System.out.println("Importe de la matricula: 100");
                System.out.println("Importe de la mensualidad: 500");
                break;
            case "Ing. Pesquera":
                System.out.println("Importe de la matricula: 310");
                System.out.println("Importe de la mensualidad: 460");
                break;
            case "Contabilidad":
                System.out.println("Importe de la matricula: 280");
                System.out.println("Importe de la mensualidad: 490");
                break;
            case "Administracion":
                System.out.println("Importe de la matricula: 360");
                System.out.println("Importe de la mensualidad: 520");
                break;
        }



    }
}
