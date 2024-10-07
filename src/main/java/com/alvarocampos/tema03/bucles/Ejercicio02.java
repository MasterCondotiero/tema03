package com.alvarocampos.tema03.bucles;

public class Ejercicio02 {
    public static void main(String[] args){

        int valor = 0;
        int contador = 1;

        while(contador<1000){

            valor = valor + contador;
            contador++;
            System.out.println(contador);
            System.out.println(valor);
        }
    }
}
