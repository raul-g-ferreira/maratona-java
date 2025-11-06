package academy.devdojo.maratonajava.javacore.Vio.test;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterTest01 {
    public static void main(String[] args) {
        File file = new File("file.txt");
        try (FileWriter fw = new FileWriter(file,true)){
            fw.write("O devdojo é lindo, é o melhor curso do brasillll\n Continuando a cantoria na proxima linha\n");
            fw.flush();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
