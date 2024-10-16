package com.alvarocampos.tema03.estructuras;
import java.util.Scanner;

public class Ejercicio03 {
    public static void  main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduzca su edad a continuacion.");
        int edad = Integer.parseInt(scanner.nextLine());

        if (edad>=18) {
            System.out.println("Eres mayor de edad");
        }else{
            System.out.println("Eres menor de edad");
        }
    }
}
