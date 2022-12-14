package bucles2;

import java.util.Scanner;

public class ej_16 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Introduce un numero: ");
        int n = scan.nextInt();

        int i = 1;
        boolean bool =false;

        while(i<=n/3 && !bool){
            if((i*i*i)==n){
                bool=true;
            }else{
                i++;
            }
        }
        if(bool){
            System.out.println("Es cubico");
        }else{
            System.out.println("No es cubico");
        }

    }
}
