package Atividade8;

public class Executa {
    public static void main(String[] args) {
        Funcionario f1 = new Funcionario();
        f1.setNome("Eduardo");
        f1.setDepartamento("Programacao");
        f1.setRg("34234234");
        f1.setSalario(17540);
        Data d1 = new Data();
        d1.dia = 10;
        d1.mes = 12;
        d1.ano = 2020;
        f1.setData(d1);
        f1.recebeAumento(500);

        f1.mostra();

    }
}
