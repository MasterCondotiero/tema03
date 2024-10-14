package com.alvarocampos.tema03.bucles;
import java.util.Random;

public class Ejercicio13 {
    public static void main(String[]args){
        Random  aleatorio= new Random();
        final int INTENTOS =1000000;
        final int CARA=0;
        final int CRUZ=1;
        int contadorCara=0;
        int contadorCruz=0;
        float porcentajeCara;
        float porcentajeCruz;

        for (int i=1; i<=INTENTOS; i++) {
            int intaleatorio = aleatorio.nextInt(0,2 );
            if (intaleatorio==CARA){
                contadorCara += 1;
            } else if (intaleatorio==CRUZ) {
                contadorCruz += 1;
            }
        }
        porcentajeCara=((float)contadorCara/INTENTOS)*100;
        System.out.println("Cara: "+porcentajeCara+"%");

        porcentajeCruz=((float)contadorCruz/INTENTOS)*100;
        System.out.println("Cruz: "+porcentajeCruz+"%");
    }
}
