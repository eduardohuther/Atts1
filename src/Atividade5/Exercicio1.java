package Atividade5;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Exercicio1 {
    public static void main(String[] args) {

        if (args.length != 1) {
            System.out.println("Envie apenas uma string para verificar!");
            return;
        }

        String valor = args[0];
        String verificacao1 = "\\([0-9]{2}\\)[0-9]{5}\\-[0-9]{4}";
        String verificacao2 = "\\([0-9]{2}\\)[0-9]{4}\\-[0-9]{4}";
        Pattern padrao1 = Pattern.compile(verificacao1);
        Pattern padrao2 = Pattern.compile(verificacao2);
        Matcher celular = padrao1.matcher(valor);
        Matcher fixo = padrao2.matcher(valor);

        if(celular.find()){
            System.out.println("Telefone celular");
        } else if(fixo.find()){
            System.out.println("Telefone fixo");
        } else {
            System.out.println("Telefone inválido");
        }

    }
}
