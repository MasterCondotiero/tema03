package com.alvarocampos.tema03.bucles;
import java.util.Scanner;

public class Ejercicio06 {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        int numGuardado, numUno, num;

        System.out.println("Introduce el numero del cual quieras ver la tabla de multiplicar, del 1 al 10.");
        int numDos = Integer.parseInt(scanner.nextLine());
        numGuardado=numDos;

        do {
           if (numDos>10 || numDos<=0){
               System.out.println("El numero que ha facilitado no es correcto");
               System.out.println("Por favor, introduce de nuevo un numero valido entre el 1 y el 10.");
               numDos = Integer.parseInt(scanner.nextLine());
           }
        } while  (numDos<0 || numDos>10);

        numUno=numDos;
            for (int i =1; i<11;i++){
                num= numUno*i;
                System.out.println(numGuardado+" x "+i+ "="+num);
            }
    }
}
