package relacion_3;
import java.util.Scanner;

public class relacion_3_ej_3 {

    public static void main(String[] args) {

        float moneda;
        int operacion;
        Scanner S = new Scanner(System.in);

        System.out.println("Elija la operación a realizar: \n"+"1. euros a dolares\n"+"2. dolares a euros");
        operacion=S.nextInt();

        S.nextLine();

        System.out.println("introduce la cantidad a calcular: ");
        moneda = S.nextFloat();

        if(operacion==1){
            moneda*=1.16;
            System.out.println("son "+moneda+" dolares");
        }else if(operacion==2){
            moneda*=0.84;
            System.out.println("son "+moneda+" euros");
        }else{
            System.out.println("Operacion incorrecta");
        }



    }
}
