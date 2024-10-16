package com.alvarocampos.tema03.ANSI;
import java.util.Scanner;

public class Ejercicio01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce un numero real: ");
        double num=scanner.nextDouble();
        System.out.printf("%.2f%n",num);

        scanner.close();
    }
}
