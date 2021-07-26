package Atividade9.Exercicio2;

import Atividade9.Exercicio1.Pais;

import java.util.ArrayList;

public class Continente {
    private String nome;
    public ArrayList<Pais> paises = new ArrayList<Pais>();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public ArrayList<Pais> getPaises() {
        return paises;
    }

    public void setPaises(ArrayList<Pais> paises) {
        this.paises = paises;
    }

    public void dimensao(){
        double total = 0.0;
        for(Pais p : paises){
            total += p.getDimensao();
        }
        System.out.println("Dimensao total: " + total);
    }

    public void populacao(){
        int total = 0;
        for(Pais p : paises){
            total += p.getPop();
        }
        System.out.println("Populacao total: " + total);
    }

    public void densidade(){
        int totalPop = 0;
        double totalDim = 0.0;
        for(Pais p : paises){
            totalPop += p.getPop();
            totalDim += p.getDimensao();
        }
        System.out.println("Densidade: " + totalPop/totalDim);
    }

    public void maiorPop(){
        int index = 0;
        int pop = 0;
        for(int i =0 ; i< this.paises.size();i++){
            if(this.paises.get(i).getPop() > pop){
                index = i;
                pop = this.paises.get(i).getPop();
            }
        }
        System.out.println("Pais com maior pop: " + this.paises.get(index).getNome() + " com " + this.paises.get(index).getPop());
    }

    public void menorPop(){
        int index = 0;
        int pop = 0;
        for(int i =0 ; i< this.paises.size();i++){
            if(this.paises.get(i).getPop() < pop || i == 0){
                index = i;
                pop = this.paises.get(i).getPop();
            }
        }
        System.out.println("Pais com menor pop: " + this.paises.get(index).getNome() + " com " + this.paises.get(index).getPop());
    }

    public void maiorDim(){
        int index = 0;
        double dim = 0;
        for(int i =0 ; i< this.paises.size();i++){
            if(this.paises.get(i).getDimensao() > dim){
                index = i;
                dim = this.paises.get(i).getDimensao();
            }
        }
        System.out.println("Pais com maior dimensao: " + this.paises.get(index).getNome() + " com " + this.paises.get(index).getDimensao());
    }

    public void menorDim(){
        int index = 0;
        double dim = 0;
        for(int i =0 ; i< this.paises.size();i++){
            if(this.paises.get(i).getDimensao() < dim || i == 0){
                index = i;
                dim = this.paises.get(i).getDimensao();
            }
        }
        System.out.println("Pais com menor dimensao: " + this.paises.get(index).getNome() + " com " + this.paises.get(index).getDimensao());
    }

    public void razaoTerritorial(){
        int indexMenor = 0;
        int indexMaior = 0;
        double dimMenor = 0;
        double dimMaior = 0;
        for(int i =0 ; i< this.paises.size();i++){
            if(this.paises.get(i).getDimensao() < dimMenor || i == 0){
                indexMenor = i;
                dimMenor = this.paises.get(i).getDimensao();
            }
            if(this.paises.get(i).getDimensao() > dimMaior || i == 0){
                indexMaior = i;
                dimMaior = this.paises.get(i).getDimensao();
            }
        }
        double razao = this.paises.get(indexMaior).getDimensao() / this.paises.get(indexMenor).getDimensao();
        System.out.println("Razao territorial entre " + this.paises.get(indexMaior).getNome() + " com " +  this.paises.get(indexMenor).getNome() + ": " + razao);
    }

}
