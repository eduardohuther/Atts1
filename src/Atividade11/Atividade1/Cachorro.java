package Atividade11.Atividade1;

public class Cachorro extends Animal{

    public Cachorro(String n, int i){
        setNome(n);
        setIdade(i);
    }

    public void emitirSom(){
        System.out.println("Som do cachorro!");
    }

    public void correr(){
        System.out.println("Cachorro correndo!");
    }
}
