package String;

import java.util.Scanner;

public class main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
/*
        String nombre = new String("Ricardo");
        System.out.println(nombre);

        String vacia = ""; //String vacia  = new String();

        String nulo = null; //por defecto

        System.out.println("null");

        System.out.println(nombre.length());

        System.out.println("hola".length());

        System.out.println("Ricardo".charAt(0));

        System.out.println(nombre.charAt(nombre.length()-1));

        System.out.println(nombre.charAt(nombre.length()/2));



        String s = new String("hola");

        for (int i = 0; i<s.length(); i++){
            System.out.println(s.charAt(i));
        }




        String subcadena = "Ricardo".substring(1,3);    //imprime ic

        subcadena = "Ricardo".substring(1);    //imprime icardo

        subcadena = "Ricardo";
        System.out.println(subcadena.substring(0, subcadena.length()/2));
        System.out.println(subcadena.substring(subcadena.length()/2));
 */

         String cadena  = "hola Pablito";
        System.out.println(cadena.substring(0, cadena.indexOf(" ")));
        System.out.println(cadena.substring(cadena.indexOf(" ")+1));

    }
}
