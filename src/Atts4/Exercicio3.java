package Atts4;

public class Exercicio3 {
    public static void main(String[] args) {
        String codificada = "pA pppapppa pdpo pPpapppa";
        StringBuilder decodificada = new StringBuilder();
        int i;
        boolean aux = false;

        for(i = 0; i< codificada.length();i++){
            if(codificada.charAt(i) == 'p' && !aux){
                aux = true;
            } else {
                decodificada.append(codificada.charAt(i));
                aux = false;
            }
        }
        System.out.println(decodificada);
    }
}
