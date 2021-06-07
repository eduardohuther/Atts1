package Atts3;

import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        String valor;
        Scanner sc1 = new Scanner(System.in);
        int i = 0, caracteres = 0, palavras = 0;

        System.out.println("Digite um texto");
        valor = sc1.nextLine();

        for(i = 0; i < valor.length(); i++) {
            if(valor.charAt(i) != ' ')
                caracteres++;
        }
        String[] rAux = valor.split(" ");
        palavras = rAux.length;
        System.out.println("Caracteres: " + caracteres + "\nPalavras: " + palavras);
    }
}
