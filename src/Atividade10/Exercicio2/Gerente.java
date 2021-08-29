package Atividade10.Exercicio2;

public class Gerente extends Funcionario{
    private String usuario;
    private String senha;

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public double calculaBonificacao(){
        return getSalario() * 0.6 + 100;
    }

    public String mostrarDados(){
        return "nome: " + getNome() + " / salario: " + getSalario()
                +" / bonificacao: " + calculaBonificacao()
                +" / usuario: " + usuario
                +" / senha: " + senha
                + "\n";
    }
}
