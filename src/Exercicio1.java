import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {

        int[] vetor = new int[20];
        int i, pares = 0;
        Scanner sc1 = new Scanner(System.in);

        for(i = 0; i < 20; i++){
            System.out.println("Digite um número inteiro");
            vetor[i] = sc1.nextInt();
            if(vetor[i] % 2 == 0){
                pares++;
            }
        }
        System.out.println("Quantidade de pares = " + pares);
    }
}
