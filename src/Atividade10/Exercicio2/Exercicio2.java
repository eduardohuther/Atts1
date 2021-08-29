package Atividade10.Exercicio2;

public class Exercicio2 {
    public static void main(String[] args) {
        Gerente g = new Gerente();
        g.setNome("Pedro");
        g.setSalario(7500);
        g.setUsuario("pedro");
        g.setSenha("0000");

        Telefonista t = new Telefonista();
        t.setNome("Julia");
        t.setSalario(1300.0);
        t.setEstacao(1);

        Secretaria s = new Secretaria();
        s.setNome("Ana");
        s.setSalario(1867.43);
        s.setRamal(15);

        System.out.println("GERENTE:");
        System.out.println(g.mostrarDados());

        System.out.println("TELEFONISTA:");
        System.out.println(t.mostrarDados());

        System.out.println("SECRETARIA:");
        System.out.println(s.mostrarDados());
    }
}
