package Atividade10.Exercicio1;

import java.util.ArrayList;

public class Escola {
    private ArrayList<Pessoa> pessoas = new ArrayList<>();

    public void addPessoa(Pessoa pessoa){
        this.pessoas.add(pessoa);
    }

    public void imprimir(){
        for(Pessoa pessoa : pessoas){
            System.out.println("Nome: " + pessoa.getNome() + " / Classe: " + pessoa.getClass());
        }
    }
}
