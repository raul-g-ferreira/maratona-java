package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais05Exercicio {
    public static void main(String[] args) {
        // Dados os valores de 1 a 7, imprima se é dia útil ou final de semana
        // Considerando 1 como domingo
        byte dia = 7;
        switch (dia) {
            case 1:
            case 7:
                System.out.println("Dia Útil");
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                System.out.println("FDS");
                break;
            default:
                System.out.println("Opção inválida");
                break;
        }

    }
}
