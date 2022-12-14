package Entrega_2;

public class Validacion_Cuenta_Corriente {

    public static void main(String[] args) {

        int entidad1= 1;
        int entidad2= 2;
        int entidad3= 3;
        int entidad4= 4;

        int banco1 = 5;
        int banco2 = 6;
        int banco3 = 7;
        int banco4 = 8;

        int numCuenta1 = 1;
        int numCuenta2 = 2;
        int numCuenta3 = 3;
        int numCuenta4 = 4;
        int numCuenta5 = 5;
        int numCuenta6 = 6;
        int numCuenta7 = 7;
        int numCuenta8 = 8;
        int numCuenta9 = 9;
        int numCuenta10 = 0;

        int codControl1 = 0;
        int codControl2 = 0;

        codControl1 = 11-(((entidad1*4)+(entidad2*8)+(entidad3*5)+(entidad4*10)+(banco1*9)+(banco2*7)+(banco3*3)+(banco4*6))%11);

        if(codControl1==10){
            codControl1=1;
        }else if(codControl1==11){
            codControl1=0;
        }

        codControl2 = 11-(((numCuenta1*1)+(numCuenta2*2)+(numCuenta3*4)+(numCuenta4*8)+(numCuenta5*5)+(numCuenta6*10)+(numCuenta7*9)+(numCuenta8*7)+(numCuenta9*3)+(numCuenta10*6))%11);

        if(codControl2==10){
            codControl1=1;
        }else if(codControl2==11){
            codControl1=0;
        }

        System.out.print(codControl1);
        System.out.print(codControl2);
    }
}
