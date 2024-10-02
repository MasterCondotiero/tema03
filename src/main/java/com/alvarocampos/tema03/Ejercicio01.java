package com.alvarocampos.tema03;
import java.util.Scanner;

public class Ejercicio01 {
    public static void  main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce un valor numerico para confirmar si es par o impar");
        int num = Integer.parseInt(scanner.nextLine());

        if (num%2==0) {
            System.out.println("Es par");
        }else{
            System.out.println("Es impar");
        }
    }
}
