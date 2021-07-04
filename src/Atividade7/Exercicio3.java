package Atividade7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        ArrayList<String> agenda = new ArrayList<String>();
        Scanner sc1 = new Scanner(System.in);
        boolean stop = false;

        while (!stop) {
            System.out.print("\nDigite uma opção / 1-cadastrar, 2-listar, 3-remover: ");
            int opcao = sc1.nextInt();

            if(opcao==1){
                System.out.print("\nDigite o nome: ");
                String nome = sc1.nextLine();
                System.out.print("\nDigite o telefone: ");
                String telefone = sc1.nextLine();
                agenda.add(nome+";"+telefone);
            } else if(opcao==2){
                Collections.sort(agenda);
                for (String s : agenda) {
                    String[] aux = s.split(";");
                    System.out.print("\nNome: "+aux[0] + " / Telefone: " + aux[1]);
                }
            } else if(opcao==3){
                System.out.print("\nInforme o indice: ");
                int index = sc1.nextInt();
                agenda.remove(agenda.get(index));
            }
        }
    }
}
