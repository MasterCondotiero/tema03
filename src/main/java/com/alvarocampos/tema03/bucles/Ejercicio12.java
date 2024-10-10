package com.alvarocampos.tema03.bucles;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Ejercicio12 {
    public static void main(String[]args){
        Scanner scanner=new Scanner(System.in);
        int aleatorio = ThreadLocalRandom.current().nextInt(1, 101);

        System.out.println("Vamos a jugar a un juego, yo pienso en un numero del 1 al 100 y tu lo adivinas");
        System.out.println("En cuantos intentos quieres hacerlo?");
        int intentos = Integer.parseInt(scanner.nextLine());
        System.out.println("Empecemos entonces:");

        for (int i=1; i<=intentos; i++) {
            System.out.println("En que numero estoy pensando?");
            int prueba = Integer.parseInt(scanner.nextLine());

            if (prueba<aleatorio){
                System.out.println("El numero que estoy pensando es mayor que ese");
            } else if (prueba>aleatorio) {
                System.out.println("El numero que estoy pensando es menor que ese");
            }
            if (prueba==aleatorio){
                System.out.println("Bien! Justo estaba pensando en ese.");
                break;
            }else if(prueba!=aleatorio){
                System.out.println("Ese no es.");
            }
            if (i==intentos){
                System.out.println("El numero en el que estaba pensando era "+aleatorio);
            }
        }
    }
}
