package Atividade6;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        ArrayList<String> nomes = new ArrayList<String>();
        Scanner sc1 = new Scanner(System.in);
        String valor;

        nomes.add("eduardo");
        nomes.add("pedro");
        nomes.add("joana");
        nomes.add("ana");
        nomes.add("claudio");
        nomes.add("carlos");
        nomes.add("junior");
        nomes.add("tiago");
        nomes.add("luiz");
        nomes.add("paula");

        System.out.print("\nDigite um nome que deseja buscar na lista: ");
        valor = sc1.nextLine();

        if (nomes.contains(valor)) {
            int index = nomes.indexOf(valor);
            if (index == 0) {
                System.out.println("Nome posterior: " + nomes.get(1));
            } else if (index + 1 == nomes.size()) {
                System.out.println("Nome anterior: " + nomes.get(index - 1));
            } else {
                System.out.println("Nome anterior: " + nomes.get(index - 1) + " / Nome posterior: " + nomes.get(index + 1));
            }
        } else {
            System.out.print("\nNome não encontrado na lista!");
        }
    }
}
