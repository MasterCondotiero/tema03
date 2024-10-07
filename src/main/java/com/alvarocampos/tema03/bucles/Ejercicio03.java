package com.alvarocampos.tema03.bucles;
import java.util.Scanner;

public class Ejercicio03 {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        int total= 0;
        int mostrarUno, mostrarDos;
        System.out.println("Facilite el primer numero:");
        int numUno = Integer.parseInt(scanner.nextLine());
        System.out.println("Facilite el segundo numero:");
        int numDos = Integer.parseInt(scanner.nextLine());

        mostrarUno=numUno;
        mostrarDos=numDos;
        if (numUno<0 && numDos<0){
            numUno=numUno*-1;
            numDos=numDos*-1;
            //se puede hacer con -numUno y -numDos
        }else if (numUno<0 && numDos>0){
            numUno=numUno*-1;
        }else if (numDos<0 && numUno>0){
            numDos=numDos*-1;
            numUno=numUno*-1;
        }
        for (int i = 0; i<numDos; i++){
            total= total + numUno;
        }
        System.out.println("El total de multiplicar "+mostrarUno+" por "+mostrarDos+" es: "+ total);
    }
}

