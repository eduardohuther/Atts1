package Atividade9.Exercicio1;

import java.util.ArrayList;

public class Pais {
    private String iso;
    private String nome;
    private Integer pop;
    private Double dimensao;
    public ArrayList<Pais> paisFronteira = new ArrayList<Pais>();

    public Pais(String codigoIso, String nome, Integer pop, Double dimensao) {
        this.iso = codigoIso;
        this.nome = nome;
        this.pop = pop;
        this.dimensao = dimensao;
    }

    public String getIso() {
        return iso;
    }

    public void setIso(String iso) {
        this.iso = iso;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getPop() {
        return pop;
    }

    public void setPop(Integer pop) {
        this.pop = pop;
    }

    public Double getDimensao() {
        return dimensao;
    }

    public void setDimensao(Double dimensao) {
        this.dimensao = dimensao;
    }

    public boolean ehOMesmoPais(Pais outroPais){
        if( this.iso.equals(outroPais.getIso())){
            return true;
        }else{
            return false;
        }
    }

    public boolean ehLimitrofe(Pais outroPais){
        if( this.paisFronteira.contains(outroPais) ){
            return true;
        }else{
            return false;
        }
    }

    public ArrayList<Pais> vizinhosComuns(Pais outroPais){
        ArrayList<Pais> comuns = new ArrayList<Pais>();
        for(Pais p : this.paisFronteira){
            if( outroPais.ehLimitrofe(p) ){
                comuns.add(p);
            }
        }
        return comuns;
    }
}
