package Atividade6;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio3 {
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

        System.out.print("\nDigite um nome que deseja remover ou digite \"clear\" para limpar a lista: ");
        valor = sc1.nextLine();

        if(valor.equals("clear")){
            nomes.clear();
        } else if(nomes.contains(valor)){
            nomes.remove(valor);
        } else {
            System.out.print("\nNome não encontrado na lista!");
        }

        if(nomes.size()>0){
            for (int i = 0; i < nomes.size(); i++) {
                System.out.print("\nNome[" + i + "]: " + nomes.get(i));
            }
        } else {
            System.out.print("\nLista vazia!");
        }
    }
}
