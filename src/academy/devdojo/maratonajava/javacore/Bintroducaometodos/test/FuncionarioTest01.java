package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Funcionario;

public class FuncionarioTest01 {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();
        funcionario.nome = "Raul";
        funcionario.idade = 18;
        funcionario.salarios = new double[]{2000,5000,14000};

        funcionario.imprimeDados();
    }

}
