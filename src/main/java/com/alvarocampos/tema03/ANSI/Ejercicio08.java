package com.alvarocampos.tema03.ANSI;

public class Ejercicio08 {
    public static void main(String[] args) {
        String cadena;
        final int ESPACIO= 7;
        final int COLUMNAS = 8;
        final int FILAS = 16;
        int colorB=0;
        int colorFG=29;
        int colorBG=39;

        for (int n = 1; n <= FILAS; n++){
            colorFG++;
            if (n==COLUMNAS+1){
                colorB++;
            }
            for (int i = 1; i <= COLUMNAS; i++) {
                colorBG++;

                if (colorB==2){
                    colorB=0;
                }
                if (colorFG==38){
                    colorFG=30;
                }
                if (colorBG==48){
                    colorBG=40;
                }
                cadena=colorB+";"+colorFG+";"+colorBG;
                System.out.printf("\u001B["+colorB+";"+colorFG+";"+colorBG+"m %"+ESPACIO+"s \u001B[0m",cadena);
            }
            System.out.printf("\n");
        }
    }
}
