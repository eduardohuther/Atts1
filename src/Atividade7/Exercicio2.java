package Atividade7;

import java.util.ArrayList;

public class Exercicio2 {
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<Integer>();
        ArrayList<Integer> remover = new ArrayList<Integer>();

        numeros.add(4);
        numeros.add(6);
        numeros.add(4);
        numeros.add(2);
        numeros.add(7);
        numeros.add(6);
        numeros.add(7);
        numeros.add(9);
        numeros.add(5);
        numeros.add(3);

        for(int i : numeros){
            if((i%2)==0){
                System.out.println(i);
                remover.add(i);
            }
        }

        for (Integer i : remover) {
            numeros.remove(i);
        }

        for(int i : numeros){
            System.out.print("\nNumero: " + i);
        }

    }
}
