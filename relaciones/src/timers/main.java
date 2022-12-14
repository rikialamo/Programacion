package timers;

import java.util.Scanner;

public class main {

    public static void main(String[] args) throws InterruptedException {

        Scanner scan = new Scanner(System.in);

        int min, seg;

        do{
            System.out.print("Introduce los minutos, que deben estar entre 0 y 59: ");
            min =scan.nextInt();
        }while(min<0 || min>59);

        do{
            System.out.print("Introduce los segundos, que deben estar entre 0 y 59: ");
            seg =scan.nextInt();
        }while(seg<0 || seg>59);

        System.out.println();

        while(min>=0){
            while(seg>=0){
                /*
                if(min<10) {
                    System.out.print("\r0"+min+":");
                }else{
                    System.out.print("\r"+min+":");
                }

                if(seg<10) {
                    System.out.print("0"+seg);
                }else{
                    System.out.print(seg);
                }
                */

                System.out.printf("\n%02d:%02d", min, seg);

                Thread.sleep(1000);

                seg--;

            }
            seg=59;
            min--;
        }
        System.out.println();
        System.out.println("FIN");


    }
}