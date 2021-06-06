package Atts2;

import java.util.Scanner;

public class Exercicio7 {
    public static void main(String[] args) {

        int[] vetor = new int[10];
        int i, n = 0;
        Boolean existe = false;
        Scanner sc1 = new Scanner(System.in);

        for(i = 0; i<10;i++){
            System.out.println("Digite um número inteiro");
            vetor[i] = sc1.nextInt();
        }
        System.out.println("Digite um número para verificar");
        n = sc1.nextInt();
        for(i=0;i<10;i++){
            if(n==vetor[i]){
                System.out.println("Encontrou "+ n + " na posição " + i);
                existe = true;
            }
        }
        if(!existe){
            System.out.println("O numero fornecido nao existe no vetor");
        }
    }
}
