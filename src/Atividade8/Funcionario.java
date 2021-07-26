package Atividade8;

public class Funcionario {
    String nome;
    String departamento;
    double salario;
    Data data;
    String rg;

    void recebeAumento(double aumento){
        this.salario += aumento;
    }

    double calculaAnual(){
        return this.salario*12;
    }

    void mostra(){
        System.out.println("Nome: " + this.nome);
        System.out.println("Departamento: " + this.departamento);
        System.out.println("Salario: " + this.salario);
        System.out.println("Data: " + this.data.toString());
        System.out.println("RG: " + this.rg);
        System.out.println("Ganho Anual: " + this.calculaAnual());
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public Data getData() {
        return data;
    }

    public void setData(Data data) {
        this.data = data;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }
}
