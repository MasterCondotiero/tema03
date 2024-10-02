package com.alvarocampos.tema03;

import java.util.Scanner;

public class Ejercicio02 {
    public static void  main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Se le pedira que introduzca los numeros a comparar.");
        System.out.println("Introduce un valor numerico:");
        int numUno = Integer.parseInt(scanner.nextLine());

        System.out.println("Introduce un valor numerico:");
        int numDos = Integer.parseInt(scanner.nextLine());

        if (numDos<numUno) {
            System.out.println(numDos +" es menor que "+ numUno);
        }else if (numDos>numUno){
            System.out.println(numDos +" es mayor que "+ numUno);
        }else{
            System.out.println(numDos +" es igual a "+ numUno);
        }
    }
}
