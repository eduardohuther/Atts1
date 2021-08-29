package Atividade10.Exercicio2;

public class Telefonista extends Funcionario{
    private int estacao;

    public int getEstacao() {
        return estacao;
    }

    public void setEstacao(int estacao) {
        this.estacao = estacao;
    }

    public String mostrarDados(){
        return "nome: " + getNome() + " / salario: " + getSalario()
                +" / bonificacao: " + calculaBonificacao()
                +" / estacao: " + estacao + "\n";
    }
}
