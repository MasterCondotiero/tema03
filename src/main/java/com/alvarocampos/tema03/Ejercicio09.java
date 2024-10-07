package com.alvarocampos.tema03;
import java.util.Scanner;

public class Ejercicio09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escriba el valor de los lados del triangulo:");
        float ladoUno = Float.parseFloat(scanner.nextLine());
        float ladoDos = Float.parseFloat(scanner.nextLine());
        float ladoTres = Float.parseFloat(scanner.nextLine());
        scanner.close();

        if (ladoUno != ladoDos && ladoDos != ladoTres && ladoTres != ladoUno) {
            System.out.println("Es escaleno");
        } else if (ladoUno == ladoDos && ladoDos == ladoTres && ladoTres == ladoUno) {
            System.out.println("Es equilatero");
        }else{
            System.out.println("Es isosceles");
        }
    }
}

