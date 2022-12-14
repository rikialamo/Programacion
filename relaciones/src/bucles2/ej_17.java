package bucles2;

import java.util.Scanner;

public class ej_17 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Introduce un numero: ");
        int n = scan.nextInt();

        int i = 2;
        boolean bool =false;

        while(i<n && !bool){
            if((n%i)==0){
                bool=true;
            }else{
                i++;
            }
        }
        if(bool){
            System.out.println("No es primo");
        }else{
            System.out.println("Es primo");
        }

    }
}
