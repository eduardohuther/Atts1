package Atts3;

import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        String valor;
        Scanner sc1 = new Scanner(System.in);
        int i, j, vogais_total = 0, digitos_total = 0;
        char[] vogais = {'a', 'e', 'i', 'o', 'u'};
        char[] digitos = {'1', '2', '3', '4', '5', '6', '7', '8', '9', '0'};

        System.out.println("Digite uma string");
        valor = sc1.next();

        System.out.println("\nTamanho da string: " + valor.length());
        System.out.println("\nEm maiusculo: " + valor.toUpperCase());
        for (i = 0; i < valor.length(); i++) {
            char v = valor.toLowerCase().charAt(i);
            for (j = 0; j < vogais.length; j++) {
                if (vogais[j] == v)
                    vogais_total++;
            }
        }
        System.out.println("\nNumero de vogais da string: " + vogais_total);
        if (valor.toUpperCase().startsWith("UNI")) {
            System.out.println("\nString começa com UNI");
        } else {
            System.out.println("\nString não começa com UNI");
        }
        if (valor.toUpperCase().endsWith("RIO")) {
            System.out.println("\nString termina com RIO");
        } else {
            System.out.println("\nString não termina com RIO");
        }
        for (i = 0; i < valor.length(); i++) {
            char d = valor.charAt(i);
            for (j = 0; j < digitos.length; j++) {
                if (digitos[j] == d)
                    digitos_total++;
            }
        }
        System.out.println("\nNumero de digitos da string: " + digitos_total);
        if(new StringBuilder(valor).reverse().toString().equals(valor)){
            System.out.println("\nString é um palíndromo");
        } else {
            System.out.println("\nString não é um palíndromo");
        }
    }
}
