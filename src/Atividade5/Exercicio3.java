package Atividade5;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Exercicio3 {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Envie apenas uma senha para verificar!");
            return;
        }

        String valor = args[0];
        String verificacao1 = "^(?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[$*&@#])[0-9a-zA-Z$*&@#]{8,}$";
        Pattern padrao1 = Pattern.compile(verificacao1);
        Matcher match = padrao1.matcher(valor);

        if(match.find()){
            System.out.println("A SENHA É FORTE");
        }else {
            System.out.println("A SENHA É FRACA");
        }
    }
}
