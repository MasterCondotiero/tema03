package com.alvarocampos.tema03.ANSI;

public class Ejercicio03 {
    public static void main(String[] args) {
        String cadena= "";
        int totalFilas = 9;

        for (int i = 1; i <= totalFilas; i++) {
            cadena=cadena+i;
            System.out.printf("%9s\n",cadena);

        }
    }
}
