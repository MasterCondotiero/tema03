package com.alvarocampos.tema03.bucles;
import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[]args){
        Scanner scanner=new Scanner(System.in);
        int suma=0;

        System.out.println("Introduzca un valor numerico que sea un numero natural: ");
        System.out.println("Cuando un cero sea introducido el programa se detentra y dara la suma de todos los numeros. ");
        int num = Integer.parseInt(scanner.nextLine());

        do {
                suma=suma+num;
                if (num!=0){
                    System.out.println("Introduzca un valor numerico que sea un numero natural: ");
                    System.out.println("Cuando un cero sea introducido el programa se detendra y dara la suma de todos los numeros. ");
                    int numDos = Integer.parseInt(scanner.nextLine());
                    num=numDos;
                }
        }while (num!=0);

        System.out.println("Total de la suma: "+suma);
        scanner.close();
    }
}
