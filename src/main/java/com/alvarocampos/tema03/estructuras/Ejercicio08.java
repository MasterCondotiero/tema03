package com.alvarocampos.tema03.estructuras;
import java.util.Scanner;

public class Ejercicio08 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escriba el valor obtenido en el dado:");
        int dadoValor = Integer.parseInt(scanner.nextLine());

        if (dadoValor<1 || dadoValor>6){
            System.err.println("Error: numero incorrecto");
            System.exit(-1);
        }

        switch (dadoValor) {
            case 1:
                System.out.println("6");
                break;
            case 2:
                System.out.println("5");
                break;
            case 3:
                System.out.println("4");
                break;
            case 4:
                System.out.println("3");
                break;
            case 5:
                System.out.println("2");
                break;
            case 6:
                System.out.println("1");
                break;
            default :
                System.out.println("Error: Numero incorrecto.");

        }
    }
}
