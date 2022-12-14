package adivina;

import java.util.Scanner;

public class main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int n = (int) (Math.random() * 100+1);
        int jugador, cont=0;
        System.out.println(n);

        do{
            System.out.print("Introduce un numero entre el 0 y el 100: ");
            jugador=scan.nextInt();

            if(jugador>n && jugador>=0){
                System.out.println("menor");
            }else if(jugador<n && jugador<=100){
                System.out.println("mayor");
            }else if (jugador!=n){
                System.out.println("numero no valido");
            }
            cont++;

        }while(n!=jugador);

        if(cont==1){
            System.out.println("suerte o genio?");
        }else if(cont>1 && cont<5){
            System.out.println("eres bueno en esto");
        }else if(cont>=5 && cont<8){
            System.out.println("estas en el promedio");
        }else{
            System.out.println("practica un poco mas");
        }

    }
}
