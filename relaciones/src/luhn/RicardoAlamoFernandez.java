package luhn;

import java.util.Scanner;

public class RicardoAlamoFernandez {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Introduce el numero a calcular: ");
        long n = scan.nextLong();

        int i = 1;
        long temp, sum=0, reves=0;

        //inversión


        while(n>0){

            temp=n%10;
            reves*=10;
            reves+=temp;
            n/=10;

        }

        //algoritmo

        while(reves>9){

            temp = (reves%10);

            if((i%2)==0){
                sum+=temp;
            }else{
                temp*=2;

                if(temp>9){
                    sum+=(temp%10);
                    temp/=10;
                    sum+=temp;
                }else{
                    sum+=temp;
                }
            }

            reves/=10;
            i++;
        }

        sum+=reves;

        if((sum%10)==0){
            System.out.println("Es un numero de luhn");
        }else{
            System.out.println("no lo es");
        }



    }
}
