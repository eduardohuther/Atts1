package Atividade4;

public class Exercicio2 {
    public static void main(String[] args) {
        String frase = "Socorram-me, subi no ônibus em Marrocos";
        int i;

        String[] aux =  frase.split(" ");
        StringBuilder result = new StringBuilder();

        for (i = aux.length - 1; i >= 0; i--) {
            result.append(aux[i]).append(" ");
        }
        System.out.println(result);
    }
}
