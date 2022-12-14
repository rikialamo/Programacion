package bucles2;

import java.util.Scanner;

public class bucles2_mersenne {

    public static void main(String[] args) {

        Scanner scan  =new Scanner(System.in);

        boolean bool =true;

        System.out.print("introduce en numero que quieras comprobar: ");
        double n = scan.nextInt();

        n=(double)((Math.pow(2, n))-1);

        int i=2;
        while(i<n/2 && bool){
            if(n%i!=0){
                i++;
            }else{
                bool=false;
            }
        }

        if(bool){
            System.out.println("Es un numero de Mersenne");
        }else{
            System.out.println("No es un numero de Mersenne");
        }

    }
}
