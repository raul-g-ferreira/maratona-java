package academy.devdojo.maratonajava.javacore.HHeranca.test;

import academy.devdojo.maratonajava.javacore.HHeranca.dominio.Funcionario;

public class HerancaTest02 {
    // 0 - Bloco de inicializaçãon estático da superclasse é executrado quando a JVM carregar a classe pai
    // 1 - Bloco de inicializaçãon estático da subclasse é executrado quando a JVM carregar a classe filha
    // 2 - Alocado espaço em memória pro objeto da superclasse
    // 3 - Cada atributo de classe é criado e inicializado com valores default ou o que for passado da superclasse
    // 4 - Bloco de inicialização da superclasse é executado na ordem em que aparece
    // 5 - Constyrutor da superclasse é executado
    // 6 - Alocado espaço em memória pro objeto da subclasse
    // 7 - Cada atributo de classe é criado e inicializado com valores default ou o que for passado da subclasse
    // 8 - Bloco de inicialização da subclasse é executado na ordem em que aparece
    // 9 - Constyrutor da subclasse é executado
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario("Jiraiya");
    }
}
