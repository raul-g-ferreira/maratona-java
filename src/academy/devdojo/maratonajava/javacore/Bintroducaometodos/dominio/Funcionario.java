package academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio;

public class Funcionario {
    public String nome;
    public int idade;
    public double[] salarios;


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
        double media = 0;
        if (salarios == null) {
            return;
        }

        for (double salario : salarios) {
            media += salario;
        }
        media /= salarios.length;

        System.out.println("\nA média dos salários é: " + media);
    }
}
