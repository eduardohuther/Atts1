package Atividade9.Exercicio1;

import java.util.ArrayList;

public class Executa {
    public static void main(String[] args) {
        Pais p1 = new Pais("BRA", "BRASIL", 423423, 232323.23);
        Pais p2 = new Pais("ARG", "ARGENTINA", 53454353, 2323.23);
        Pais p3 = new Pais("URU", "URUGUAI", 534534, 2323.23);
        Pais p4 = new Pais("EQU", "EQUADOR", 76575, 2323.23);
        Pais p5 = new Pais("BOL", "BOLÍVIA", 423423, 2323.23);

        p1.paisFronteira.add(p2);
        p1.paisFronteira.add(p3);
        p1.paisFronteira.add(p5);
        p2.paisFronteira.add(p1);
        p2.paisFronteira.add(p3);
        p2.paisFronteira.add(p5);
        p3.paisFronteira.add(p1);
        p3.paisFronteira.add(p2);
        p5.paisFronteira.add(p1);
        p5.paisFronteira.add(p2);

        System.out.print("p1 é igual ao p2? ");
        boolean resp = p1.ehOMesmoPais(p2);
        System.out.println(resp);

        System.out.print("Argentina faz fronteira com o Brasil?");
        resp = p2.ehLimitrofe(p1);
        System.out.println(resp);

        System.out.println("Paises que fazem fronteira com o Brasil e com a Argentina:");
        ArrayList<Pais> comuns = p1.vizinhosComuns(p2);
        for(Pais p : comuns){
            System.out.println(p.getNome());
        }
    }
}
