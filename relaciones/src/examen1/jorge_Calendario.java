package examen1;

import java.util.Scanner;

public class jorge_Calendario {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int mientras = 0;

        do {

            int mes = 0;

            do {
                System.out.print("Introduce un numero entre el 1 y el 12(mes): ");
                mes = scan.nextInt();
            } while (mes < 1 || mes > 12);

            int anyo;

            do {
                System.out.print("Introduce un numero mayor a 0(anyo): ");
                anyo = scan.nextInt();
            } while (anyo < 0);

            boolean bisiesto = (((anyo % 4) == 0 && (anyo % 100) != 0) || (anyo % 400) == 0);

            switch (mes) {
                case 1:
                    System.out.println("\t\t\"Enero\"");
                    break;
                case 2:
                    System.out.println("\t\t\"Febrero\"");
                    break;
                case 3:
                    System.out.println("\t\t\"Marzo\"");
                    break;
                case 4:
                    System.out.println("\t\t\"Abril\"");
                    break;
                case 5:
                    System.out.println("\t\t\"Mayo\"");
                    break;
                case 6:
                    System.out.println("\t\t\"Junio\"");
                    break;
                case 7:
                    System.out.println("\t\t\"Julio\"");
                    break;
                case 8:
                    System.out.println("\t\t\"Agosto\"");
                    break;
                case 9:
                    System.out.println("\t\t\"Septiembre\"");
                    break;
                case 10:
                    System.out.println("\t\t\"Octubre\"");
                    break;
                case 11:
                    System.out.println("\t\t\"Noviembre\"");
                    break;
                case 12:
                    System.out.println("\t\t\"Diciembre\"");
                    break;
                default:
                    System.out.println("Nunca deberia darse");
                    break;
            }

            System.out.println("\nLu Ma Mi Ju Vi Sa Do");

            if (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12) {//meses 31

                int dia = 1;
                while (dia <= 31) {
                    int j = 1;
                    while (j <= 7 && dia <= 31) {
                        System.out.printf("%02d ", dia);
                        dia++;
                        j++;
                    }
                    System.out.println();
                }
            } else if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {//meses 30

                int dia = 1;
                while (dia <= 30) {
                    int j = 1;
                    while (j <= 7 && dia <= 30) {
                        System.out.printf("%02d ", dia);
                        dia++;
                        j++;
                    }
                    System.out.println();
                }
            } else if (bisiesto){//febrero bisiesto
                int dia = 1;
                while (dia <= 29) {
                    int j = 1;
                    while (j <= 7 && dia <= 29) {
                        System.out.printf("%02d ", dia);
                        dia++;
                        j++;
                    }
                    System.out.println();
                }
            }else{//febrero normal
                int dia = 1;
                while (dia <= 28) {
                    int j = 1;
                    while (j <= 7 && dia <= 28) {
                        System.out.printf("%02d ", dia);
                        dia++;
                        j++;
                    }
                    System.out.println();
                }
            }

            System.out.println();
            System.out.print("Quieres continuar?(1 = afirmativo) ");
            mientras = scan.nextInt();

        }while(mientras == 1);

        System.out.println("Adios, gracias por la ejecucion");

    }
}
