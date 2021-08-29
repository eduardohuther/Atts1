package Atividade11.Atividade1;

public class Preguica extends Animal{

    public Preguica(String n, int i){
        setNome(n);
        setIdade(i);
    }

    public void emitirSom(){
        System.out.println("Som da preguica!");
    }

    public void subirArvore(){
        System.out.println("Preguica subindo na arvore!");
    }

}
