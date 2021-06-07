package Atts3;

import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        String valor, r = "", valor2;
        Scanner sc1 = new Scanner(System.in);
        int i;

        System.out.println("Digite um nome");
        valor = sc1.nextLine();
        valor2 = valor.replaceAll(" e ", " ").replaceAll(" do ", " ").replaceAll(" da ", " ").replaceAll(" dos ", " ")
                .replaceAll(" das ", " ").replaceAll(" de ", " ").replaceAll(" di ", " ").replaceAll(" du ", " ");
        String[] rAux = valor2.split(" ");
        for (i = 0; i < rAux.length; i++) {
            r += rAux[i].charAt(0);
        }
        System.out.println(valor + " -> " + r.toUpperCase());
    }
}
