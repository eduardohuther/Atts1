package Atividade6;

import java.util.ArrayList;
import java.util.Collections;

public class Exercicio2 {
    public static void main(String[] args) {
        ArrayList<String> nomes = new ArrayList<String>();

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

        Collections.sort(nomes);

        for (int i = 0; i < nomes.size(); i++) {
            System.out.print("\nNome[" + i + "]: " + nomes.get(i));
        }
    }
}
