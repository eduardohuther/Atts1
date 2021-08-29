package Atividade10.Exercicio2;

public class Secretaria extends Funcionario{
    private int ramal;

    public int getRamal() {
        return ramal;
    }

    public void setRamal(int ramal) {
        this.ramal = ramal;
    }

    public String mostrarDados(){
        return "nome: " + getNome() + " / salario: " + getSalario()
                +" / bonificacao: " + calculaBonificacao()
                +" / ramal: " + ramal + "\n";
    }
}
