package com.alvarocampos.tema03.bucles;
import java.util.Random;
import java.util.Scanner;

public class Ejercicio16 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        Random dado= new Random();
        int lanzamientos=1;
        int suma=0;
        int winCPU=0;
        int winPlayer=0;
        final int WINVICTORIAS=5;

        System.out.println("Vamos a jugar al 11.");

        for (int i=1; i<=lanzamientos; i++) {
            int tirada = dado.nextInt(1,7 );
            if (tirada>11){
                suma=suma+tirada;
                System.out.println("Has perdido, "+"el valor total que tienes es "+suma);
                int tiradas = Integer.parseInt(scanner.nextLine());
                winCPU++;
            } else if (tirada==11) {
                System.out.println("Has ganado");
                winPlayer++;
            }
            System.out.println("Los resultados son...   Jugador: "+winPlayer+"/ Maquina: "+winCPU);
        }
    }
}
