package Atividade10.Exercicio1;

public class Exercicio1 {
    public static void main(String[] args) {
        Aluno aluno = new Aluno();
        Docente docente = new Docente();
        Tae tae = new Tae();

        aluno.setNome("Pedro");
        docente.setNome("Paula");
        tae.setNome("Julio");

        Escola escola = new Escola();
        escola.addPessoa(aluno);
        escola.addPessoa(docente);
        escola.addPessoa(tae);

        escola.imprimir();
    }
}
