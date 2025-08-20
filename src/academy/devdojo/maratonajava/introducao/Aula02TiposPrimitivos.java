package academy.devdojo.maratonajava.introducao;

public class Aula02TiposPrimitivos {
    public static void main(String[] args) {
        // int, double, float, char, byte, short, long, boolean
        int idade = (int) 10000000000L; // 4 bytes
        long numeroGrande = 100000L; // 8 bytes
        double salarioDouble = 2000.0D; // 8 bytes
        float salarioFloat = 2500.00F; // 4 bytes
        byte idadeByte = -128; // 1 byte
        short idadeShort = 32000; // 2 bytes
        boolean verdadeiro = true; // 1 bit
        boolean falso = false;
        char caractere = 67; // 2 bytes
        String nome = "Kuririn";

        System.out.println("A idade é " + idade + "anos");
        System.out.println(verdadeiro);
        System.out.println(caractere);
        System.out.println("oi meu nome é " + nome);
    }
}
