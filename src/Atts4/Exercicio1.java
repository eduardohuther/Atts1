package Atts4;

public class Exercicio1 {
    public static void main(String[] args) {
        String frase = "Socorram-me, subi no ônibus em Marrocos";
        int i;

        String[] aux =  frase.split(" ");
        String result = "";

        for (i = aux.length - 1; i >= 0; i--) {
            result += aux[i] + " ";
        }
        System.out.println(result);
    }
}
