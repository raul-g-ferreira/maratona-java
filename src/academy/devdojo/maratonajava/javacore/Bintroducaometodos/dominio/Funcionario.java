package academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio;

public class Funcionario {
    private String nome;
    private int idade;
    private double[] salarios;
    private double media;


    public void imprimeDados() {
        System.out.println(this.nome);
        System.out.println(this.idade);
//        System.out.println(this.salarios[0]);
//        System.out.println(this.salarios[1]);
//        System.out.println(this.salarios[2]);
        if (salarios == null) {
            return;
        }
        for (double salario : salarios) {
            System.out.print(salario + " ");

        }

        imprimeMediaSalarios();
    }

    public void imprimeMediaSalarios() {
        if (salarios == null) {
            return;
        }

        for (double salario : salarios) {
            media += salario;
        }
        media /= salarios.length;

        System.out.println("\nA média dos salários é: " + media);
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setSalarios(double[] salarios) {
        this.salarios = salarios;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public double[] getSalarios() {
        return salarios;
    }

    public double getMedia() {
        return media;
    }
}
