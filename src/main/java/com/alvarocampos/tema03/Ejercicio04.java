package com.alvarocampos.tema03;
import java.util.Scanner;

public class Ejercicio04 {
    public static void  main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduzca dos numeros reales que se ordenaran de mayor a menor");
        System.out.println("Introduzca el primer numero");
        float numUno = Float.parseFloat(scanner.nextLine());
        System.out.println("Introduzca el segundo numero");
        float numDos = Float.parseFloat(scanner.nextLine());

        if (numUno >= numDos) {
            System.out.println(numUno +(", ")+ numDos);
        } else {
            System.out.println(numDos +(", ")+ numUno);
        }
    }
}
