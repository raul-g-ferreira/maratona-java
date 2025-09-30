package academy.devdojo.maratonajava.javacore.Qstring.test;

public class StringTest01 {
    public static void main(String[] args) {
        String nome = "William"; // String constant pool
        String nome2 = "William";

        nome += " Suane";
        System.out.println(nome);
        System.out.println(nome == nome2);
        String nome3 = new String("William"); // 1. variável de referência, 2. objeto do tipo String, 3. Uma string no string pool
        System.out.println(nome2 == nome3); // false
        System.out.println(nome2 == nome3.intern()); // true

    }
}
