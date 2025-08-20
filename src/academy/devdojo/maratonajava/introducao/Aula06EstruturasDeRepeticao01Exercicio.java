package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturasDeRepeticao01Exercicio {
    public static void main(String[] args) {
        // imprima todos os números pares de 0 a 1000000
        for (int i = 0; i <= 1000000; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}
