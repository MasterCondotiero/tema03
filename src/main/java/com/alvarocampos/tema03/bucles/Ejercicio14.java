package com.alvarocampos.tema03.bucles;
import java.util.Random;

public class Ejercicio14 {
    public static void main(String[] args) {
        Random dado= new Random();
        final int INTENTOS = 1000000;
        int uno = 0;
        int dos = 0;
        int tres = 0;
        int cuatro = 0;
        int cinco = 0;
        int seis = 0;
        float porcentajeUno;
        float porcentajeDos;
        float porcentajeTres;
        float porcentajeCuatro;
        float porcentajeCinco;
        float porcentajeSeis;
        float total;
        float margenError;

        for (int i=1; i<=INTENTOS; i++) {
            int intdado = dado.nextInt(1,7 );
            switch (intdado){
                case 1 -> uno++;
                case 2 -> dos++;
                case 3 -> tres++;
                case 4 -> cuatro++;
                case 5 -> cinco++;
                case 6 -> seis++;
            }
        }
        porcentajeUno=((float)uno/INTENTOS)*100;
        porcentajeDos=((float)dos/INTENTOS)*100;
        porcentajeTres=((float)tres/INTENTOS)*100;
        porcentajeCuatro=((float)cuatro/INTENTOS)*100;
        porcentajeCinco=((float)cinco/INTENTOS)*100;
        porcentajeSeis=((float)seis/INTENTOS)*100;
        System.out.println("Uno "+porcentajeUno+"%");
        System.out.println("Dos "+porcentajeDos+"%");
        System.out.println("Tres "+porcentajeTres+"%");
        System.out.println("Cuatro "+porcentajeCuatro+"%");
        System.out.println("Cinco "+porcentajeCinco+"%");
        System.out.println("Seis "+porcentajeSeis+"%");

        total=porcentajeUno+porcentajeDos+porcentajeTres+porcentajeCuatro+porcentajeCinco+porcentajeSeis;
        if (total<100){
            margenError=100-total;
            System.out.println("Total "+total+"%"+" con margen de error del "+margenError+"%");
        } else {
            margenError=total-100;
            System.out.println("Total "+total+"%"+" con margen de error del "+margenError+"%");
        }
    }
}
