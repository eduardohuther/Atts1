package Atts2;

import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        int[] vetor1 = new int[10], vetor2 = new int[10], vetorR = new int[10];
        int i;
        Scanner sc1 = new Scanner(System.in);

        for(i = 0; i < 10; i++){
            System.out.println("Digite um numero inteiro para o vetor1[" + i + "]:");
            vetor1[i] = sc1.nextInt();
            System.out.println("Digite um numero inteiro para o vetor2[" + i + "]:");
            vetor2[i] = sc1.nextInt();
            vetorR[i] = vetor1[i] * vetor2[i];
        }

            System.out.println("Vetor resultante= " + vetorR);

    }
}
