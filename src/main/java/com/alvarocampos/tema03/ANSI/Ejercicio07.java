package com.alvarocampos.tema03.ANSI;

public class Ejercicio07 {
    public static void main(String[] args) {
        String cadenaUno= "";
        String cadenaDos= "";
        int Filas = 9;

        for (int i = 1; i <= Filas; i++) {
            cadenaUno=cadenaUno+i;

            for (int n = 1; n <= 1; n++){
                cadenaDos=i+cadenaDos;
            }
            System.out.printf("%9s%s\n",cadenaUno,cadenaDos);

        }
    }
}
