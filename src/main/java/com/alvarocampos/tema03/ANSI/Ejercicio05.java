package com.alvarocampos.tema03.ANSI;

public class Ejercicio05 {
    public static void main(String[] args) {
        String cadena= "";
        int totalFilas = 9;
        int color=29;

        for (int i = 1; i <= totalFilas; i++) {
            cadena=cadena+i;
            color++;

            if (color==38){
                color=30;
            }

            System.out.printf("\u001B[1;"+color+"m %"+totalFilas+"s \u001B[0m \n",cadena);
        }
    }
}
