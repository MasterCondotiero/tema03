package com.alvarocampos.tema03.bucles;
import java.util.Scanner;

public class Ejercicio15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce la hora (h): ");
        int h = scanner.nextInt();

        System.out.println("Introduce los minutos (m): ");
        int m = scanner.nextInt();

        System.out.println("Introduce los segundos (s): ");
        int s = scanner.nextInt();

        if (h >= 0 && h <= 23 && m >= 0 && m <= 59 && s >= 0 && s <= 59) {
            System.out.println("La hora ingresada es valida: " + h + ":" + m + ":" + s);
        } else {
            System.out.println("La hora ingresada no es valida.");
        }

        scanner.close();
    }
}
