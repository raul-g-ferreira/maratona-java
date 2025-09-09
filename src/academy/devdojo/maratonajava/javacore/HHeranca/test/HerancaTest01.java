package academy.devdojo.maratonajava.javacore.HHeranca.test;

import academy.devdojo.maratonajava.javacore.HHeranca.dominio.Endereco;
import academy.devdojo.maratonajava.javacore.HHeranca.dominio.Funcionario;
import academy.devdojo.maratonajava.javacore.HHeranca.dominio.Pessoa;

public class HerancaTest01 {
    public static void main(String[] args) {
        Endereco endereco = new Endereco();
        endereco.setRua("Rua 3");
        endereco.setCep("324098-383");
        Pessoa pessoa = new Pessoa("Toyohisa Shimazu");

        pessoa.setCpf("11111111123");
        pessoa.setEndereco(endereco);
        pessoa.imprime();

        System.out.println("---------------------------");

        Funcionario funcionario = new Funcionario("Oda Nobunaga");

        funcionario.setCpf("1209312");
        funcionario.setEndereco(endereco);
        funcionario.setSalario(200000);
        funcionario.imprime();
    }
}
