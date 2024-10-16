package com.alvarocampos.tema03.ANSI;

public class Ejercicio06 {
    public static void main(String[] args) {
        String cadenaUno= "";
        String cadenaDos= "";
        int totalFilas = 9;

        for (int i = 1; i <= totalFilas; i++) {
            cadenaUno=cadenaUno+i;
            cadenaDos=cadenaDos+i;
            System.out.printf("%9s%s\n",cadenaUno,cadenaDos);
        }
    }
}
