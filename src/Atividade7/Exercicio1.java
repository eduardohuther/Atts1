package Atividade7;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        ArrayList<Integer> inteiros = new ArrayList<Integer>();
        Scanner sc1 = new Scanner(System.in);
        boolean stop = false;

        while (!stop) {
            System.out.print("\nDigite um numero inteiro: ");
            int valor = sc1.nextInt();

            if (valor < 0) {
                stop = true;
            } else {
                inteiros.add(valor);
            }
        }

        for (int i = 0; i < inteiros.size(); i++) {
            System.out.print("\nInteiro: " + inteiros.get(i));
        }
        System.out.print("\n-----");

        for(int i : inteiros){
            System.out.print("\nInteiro: " + i);
        }
        System.out.print("\n-----");

        Iterator it = inteiros.iterator();
        while(it.hasNext()){
            int i = (int) it.next();
            System.out.print("\nInteiro: " + i);
        }
    }
}
