package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais04Exercicio {
    public static void main(String[] args) {
        // entre 0 e 34712 -> 9.7%
        // entre 34712 e 68507 -> 37.35%
        //a partir de 68508 -> 49.5%
        /*
        double salarioBruto = 10000;
        double taxa;
        double salarioLiq;

        if (salarioBruto <= 34712) {
            taxa = 9.7;
        } else if (salarioBruto <= 68507) {
            taxa = 37.35;
        } else {
            taxa = 49.5;
        }
        salarioLiq =  salarioBruto - salarioBruto * (taxa/100);
        System.out.println("Salário Líquido: " + salarioLiq + "| Taxa: " + taxa);
         */
        double salarioAnual = 25000;
        double primeiraFaixa = 9.7/100;
        double segundaFaixa = 37.35/100;
        double terceiraFaixa = 49.5/100;
        double valorImposto;
        if (salarioAnual <= 34712) {
            valorImposto = salarioAnual * primeiraFaixa;
        } else if (salarioAnual <= 68507) {
            valorImposto = salarioAnual * segundaFaixa;
        } else {
            valorImposto = salarioAnual * terceiraFaixa;
        }
        System.out.println(valorImposto);
    }
}
