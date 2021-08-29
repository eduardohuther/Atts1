package Atividade11.Atividade1;

public class Cavalo extends Animal{

    public Cavalo(String n, int i){
        setNome(n);
        setIdade(i);
    }

    public void emitirSom(){
        System.out.println("Som do cavalo!");
    }

    public void correr(){
        System.out.println("Cavalo correndo!");
    }

}
