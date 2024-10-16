package com.alvarocampos.tema03.ANSI;
import java.util.Scanner;

public class Ejercicio02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean valido;
        int hora, minutos, segundos;

        do {
            System.out.println("Introduce la hora (h): ");
            hora = Integer.parseInt(scanner.nextLine());
            valido = hora >= 0 && hora <= 23;
        } while  (!valido);

        do {
            System.out.println("Introduce lod minutos (m): ");
            minutos = Integer.parseInt(scanner.nextLine());
            valido = minutos >= 0 && minutos <= 59 ;
        } while  (!valido);

        do {
            System.out.println("Introduce los segundos (s): ");
            segundos = Integer.parseInt(scanner.nextLine());
            valido = segundos >= 0 && segundos <= 59;
        } while  (!valido);

        System.out.printf("%02d:%02d:%02d\n",hora, minutos, segundos);
        scanner.close();
    }
}
