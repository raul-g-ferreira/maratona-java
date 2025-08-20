package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturasDeRepeticao04 {
    //Dado um valor de um carro, descubra em quantas vezes ele pode ser parcelado
    //condição valorParcela >= 1000
    public static void main(String[] args) {
        double valorCarro = 158545.12;
        double valorParcela = 0;
        int quantParcela = 0;
        for (int i = 1; i <= (valorCarro / 2); i++) {
            if (valorCarro / i < 1000) {
                break;
            } else {
                valorParcela = valorCarro / i;
                quantParcela = i;
            }

        }
        System.out.println("O carro pode ser parcelado em até " + quantParcela + "x de R$" + valorParcela);
    }
}
