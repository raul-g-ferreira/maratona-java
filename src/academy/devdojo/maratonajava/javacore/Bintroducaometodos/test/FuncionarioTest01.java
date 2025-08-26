package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Funcionario;

public class FuncionarioTest01 {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();
        funcionario.setNome("Raul");
        funcionario.setIdade(18);
        funcionario.setSalarios(new double[]{2000,5000,14000});
        funcionario.imprimeDados();

        System.out.println("Média " + funcionario.getMedia());
    }
}
