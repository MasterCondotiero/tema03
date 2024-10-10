package com.alvarocampos.tema03.bucles;
import java.util.Scanner;

public class Ejercicio11 {
    public static void main(String[]args){
        Scanner scanner=new Scanner(System.in);
        float suma=0;
        float media;
        int contador=0;

        System.out.println("Introduzca un valor numerico que sea un numero natural: ");
        System.out.println("Cuando un numero negativo sea introducido el programa se detentra y dara la media de entre todos los numeros. ");
        float num = Float.parseFloat(scanner.nextLine());

        while (num>=0){
            suma=suma+num;
            contador++;
                System.out.println("Introduzca un valor numerico que sea un numero natural: ");
                System.out.println("Cuando un numero negativo sea introducido el programa se detentra y dara la media de entre todos los numeros. ");
                float numDos = Float.parseFloat(scanner.nextLine());
                num=numDos;
        }
        if (contador>0){
            media=suma/contador;
            System.out.println("La media de todos los numeros es: "+media);
            scanner.close();
        }else {
            System.out.println("No se introdujeron numeros validos");
        }
    }
}
