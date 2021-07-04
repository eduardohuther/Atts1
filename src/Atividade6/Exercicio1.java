package Atividade6;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        ArrayList<String> nomes = new ArrayList<String>();
        Scanner sc1 = new Scanner(System.in);
        boolean stop = false;

        while (!stop) {
            System.out.print("\nDigite um nome: ");
            String valor = sc1.nextLine();

            if (valor.equals("vazio")) {
                stop = true;
            } else if (nomes.contains(valor)) {
                System.out.print("\nO nome não pode ser adicionado!");
            } else {
                nomes.add(valor);
                System.out.print("\nNome inserido na posição: " + nomes.indexOf(valor));
            }
        }

        for (int i = 0; i < nomes.size(); i++) {
            System.out.print("\nNome[" + i + "]: " + nomes.get(i));
        }
    }
}
