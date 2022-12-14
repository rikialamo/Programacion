package com.company;

import java.util.Scanner;

public class relacion_4 {
    public static void main(String[] args) {

        Scanner numero = new Scanner(System.in);
        Scanner string = new Scanner(System.in);

        //1. lee un nombre, guarda e imprime

        /*
        String nombre = string.nextLine();
        System.out.println(nambre);
         */

        //2.lee una edad, guarda e imprime

        /*
        int edad = numero.nextInt();
        System.out.println(edad);
         */

        //3.ahórrate la variable en los anteriores

        /*
        System.out.println("nombre: "+string.nextLine());

        System.out.println("edad: "numero.nextInt());
        */

        //4a.lee por pantalla temp en C e imprime

        /*
        float temp = numero.nextFloat();
        system.out.println(temp);
         */

        //4b.converti a kelvin

        /*
        float temp = numero.nextFloat();
        system.out.println("celsius :"+temp);
        System.out.println("kelvin :"+ temp+273,15);
         */

        //5.rectangulo

        /*
        float altura, base, area;

        System.out.println("introduce la altura: ");
        altura = numero.nextFloat();

        System.out.println("introduce la base: ");
        base = numero.nextFloat();

        area = base*altura;
        System.out.println("el area del rectangulo es: "+area);
         */

        //6. IMC

        /*
        float peso, altura;

        System.out.println("introduce el peso: ");
        peso=numero.nextFloat();

        System.out.println("introduce la altura: ");
        altura = numero.nextFloat();

        System.out.println("El IMC es: "+ peso/(altura*altura));
         */

        //7.IVA

        /*
        float precio;

        System.out.println("Introduce el precio sin IVA: ");
        precio= numero.nextFloat();

        precio+= precio*0,21;

        System.out.println("El precio con IVA es: "+ precio);
         */

        //8.

        /*
        float precio1, precio2, precio3;

        System.out.println("Introduce el precio 1 sin IVA: ");
        precio1= numero.nextFloat();
        System.out.println("Introduce el precio 2 sin IVA: ");
        precio2= numero.nextFloat();
        System.out.println("Introduce el precio 3 sin IVA: ");
        precio3= numero.nextFloat();

        System.out.println("El precio medio sin IVA es: "+ (precio1+precio2+precio3)/3);

        precio1+= precio*0,21;
        precio2+= precio*0,21;
        precio3+= precio*0,21;

        System.out.println("El precio medio con IVA es: "+ (precio1+precio2+precio3)/3);

        System.out.println("El precio total con IVA es: "+ precio);
         */


    }
}
