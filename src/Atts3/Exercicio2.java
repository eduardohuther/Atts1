package Atts3;

import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        int valor = 0, i, j;
        Scanner sc1 = new Scanner(System.in);
        char[] digitos1 = {'1', '2', '3', '4', '5', '6', '7', '8', '9', '0'};
        String[] digitos2 = {"um", "dois", "tres", "quatro", "cinco", "seis", "sete", "oito", "nove", "zero"};
        String r = "";

        System.out.println("Digite um inteiro");
        valor = sc1.nextInt();

        for (i = 0; i < String.valueOf(valor).length(); i++) {
            char v = String.valueOf(valor).charAt(i);
            for (j = 0; j < digitos1.length; j++) {
                if (digitos1[j] == v)
                    if(String.valueOf(valor).length() == (i+1)){
                        r += digitos2[j];
                    } else {
                        r += digitos2[j] + ", ";
                    }
            }
        }
        System.out.println("Resultado: " + r);

    }
}
