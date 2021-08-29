package Atividade11.Atividade2;

import Atividade11.Atividade1.Animal;
import Atividade11.Atividade1.Cachorro;
import Atividade11.Atividade1.Cavalo;
import Atividade11.Atividade1.Preguica;

public class Executa {
    public static void main(String[] args) {
        Animal cachorro = new Cachorro("Snoopy", 8);
        Animal cavalo = new Cavalo("Arabe", 5);
        Animal preguica = new Preguica("Alda", 3);

        cachorro.emitirSom();
        cavalo.emitirSom();
        preguica.emitirSom();
    }
}
