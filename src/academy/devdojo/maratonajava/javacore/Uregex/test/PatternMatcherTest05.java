package academy.devdojo.maratonajava.javacore.Uregex.test;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest05 {
    public static void main(String[] args) {
        // \d = Todos os dígitos
        // \D = Tudo que não for dígito
        // \s ou \t ou \n out \f ou \r = Espaços em branco
        // \S = Todos os carccteres excluindo os brancos
        // \w = a-zA-Z, dígitos, _
        // \W = Tudo o que não for incluso no \w
        // []
        //  QUNATIFICCADORES
        // ? Zero ou uma
        // * Zero ou mais
        // + uma ou mais
        // {n,m} de n até m
        // ()
        // | o(v|c)o     ovo ou oco
        // $
        // . 1.3 = 123, 133, 1@3, 1A3 (é um caracter curinga)


        String regex = "([a-zA-Z0-9\\._-])+@([a-zA-Z])+(\\.([a-zA-Z])+)+";
        String texto = "luffy@hotmail.com, 123jotaro@gmail.com, #@!zoro@mail.br, teste@gmail.com.br, sakura@mail ";
        System.out.println("Email válido");
        System.out.println("zoro@mail.br".matches(regex));
        System.out.println(texto.split(",")[1].trim());
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto);
        System.out.println("texto:  "+ texto);
        System.out.println("Índice: 0123456789");
        System.out.println("regex:  "+regex);
        System.out.println("posições encontradas");
        while (matcher.find()){
            System.out.print(matcher.start() + " "+ matcher.group() + "\n");
        }
    }
}
