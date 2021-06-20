package Atividade2;

import java.util.Scanner;

public class Exercicio8 {
    public static void main(String[] args) {

        int[] vetor = new int[15];
        int i, j, menor = 0;
        Scanner sc1 = new Scanner(System.in);

        for(i = 0; i < 15; i++){
            System.out.println("Digite um número inteiro");
            vetor[i] = sc1.nextInt();
        }

        for(i = 0; i < 15; i++){
            for(j = 0; j< 15; j++){
                if(vetor[j] < vetor[j+1]){
                    menor = vetor[j];
                    vetor[j] = vetor[j+1];
                    vetor[j+1] = menor;
                }
            }
        }
            System.out.println("vetor: "+vetor);
    }
}
