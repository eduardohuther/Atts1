package Atividade2;

import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {

        int[] vetor = new int[20], vetorR = new int[20];
        int i;
        Scanner sc1 = new Scanner(System.in);

        for(i = 0; i < 20; i++){
            System.out.println("Digite um número inteiro");
            vetor[i] = sc1.nextInt();
            System.out.println("vetor["+i+"]: " + vetor[i]);
        }

        for(i = 0; i < 20; i++){
            vetorR[i] = vetor[19-i];
        }
        System.out.println("Vetor resultante= " + vetorR);
    }
}
