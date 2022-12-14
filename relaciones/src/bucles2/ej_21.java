package bucles2;

import java.util.Scanner;

public class ej_21 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int i=2, j=2;
        boolean bool =false;

        System.out.print("Introduce el 1º numero: ");
        int n1 = scan.nextInt();
        System.out.print("Introduce el 2º numero: ");
        int n2 = scan.nextInt();

        if(n1<n2){
            int cambio= n1;
            n1=n2;
            n2=cambio;
        }

        while(!bool && i<(n1*n2)){
            while(!bool && j<(n1*n2)){
                if((i*n1)==(j*n2)){
                    bool=true;
                }else{
                    j++;
                }
            }
            if(!bool){
                i++;
            }
        }

        if(bool){
            System.out.println("El mcm es: "+(n1*i));
        }else{
            System.out.println("No hay mcm");
        }

    }
}
