package Atividade3;

import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        String valor, r;
        Scanner sc1 = new Scanner(System.in);

        System.out.println("Digite um texto");
        valor = sc1.nextLine();
        r = valor.trim().replaceAll("\\s+", " ");
        System.out.println(r);
    }
}
