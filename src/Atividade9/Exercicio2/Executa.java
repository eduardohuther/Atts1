package Atividade9.Exercicio2;

import Atividade9.Exercicio1.Pais;

import java.util.ArrayList;

public class Executa {
    public static void main(String[] args) {
        Continente c1 = new Continente();
        c1.setNome("America");
        Pais p1 = new Pais("BRA", "BRASIL", 423423, 232323.23);
        Pais p2 = new Pais("ARG", "ARGENTINA", 53454353, 3242.23);
        Pais p3 = new Pais("URU", "URUGUAI", 534534, 5442.23);
        Pais p4 = new Pais("EQU", "EQUADOR", 76575, 7655.23);
        Pais p5 = new Pais("BOL", "BOLÍVIA", 423423, 234.23);
        ArrayList<Pais> paises = new ArrayList<Pais>();
        paises.add(p1);
        paises.add(p2);
        paises.add(p3);
        paises.add(p4);
        paises.add(p5);
        c1.setPaises(paises);
        c1.dimensao();
        c1.populacao();
        c1.densidade();
        c1.maiorPop();
        c1.menorPop();
        c1.maiorDim();
        c1.menorDim();
        c1.razaoTerritorial();
    }
}
