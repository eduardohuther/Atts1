package Atividade2;

import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {

        int[] vetor = new int[10];
        int i, menor = 0, pos = 0;
        Scanner sc1 = new Scanner(System.in);

        for(i = 0; i < 10; i++){
            System.out.println("Digite um numero inteiro["+ i +"]:");
            vetor[i] = sc1.nextInt();
            if(vetor[i] < menor || i == 0){
                menor = vetor[i];
                pos = i;
            }
        }
        System.out.println("O menor elemento do vetor é "+ menor + " na posição " + pos);

    }
}
