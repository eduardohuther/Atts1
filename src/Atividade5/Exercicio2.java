package Atividade5;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Exercicio2 {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Envie apenas uma string para verificar!");
            return;
        }

        String valor = args[0];
        String verificacao1 = "(http:|https:|ftp:)\\/\\/(www)\\.([a-z]*)\\.(com|(?=com)\\.(?=br))";
        Pattern padrao1 = Pattern.compile(verificacao1);
        Matcher match = padrao1.matcher(valor);
        if(match.find()){
            System.out.println("URL VÁLIDA");
        }else {
            System.out.println("URL INVÁLIDA");
        }

    }
}
