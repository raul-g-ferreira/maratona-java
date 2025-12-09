package academy.devdojo.maratonajava.javacore.Wnio.test;

import java.io.File;
import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;

import static academy.devdojo.maratonajava.javacore.Wnio.test.PathMatcherExercise.matches;


class ListFiles extends SimpleFileVisitor<Path>{
    @Override
    public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
        if (matches(file, "glob:**/*Test*.{java,class}"))
            System.out.println(file.getFileName());
        return FileVisitResult.CONTINUE;
    }
}

public class PathMatcherExercise {
    public static void main(String[] args) throws IOException {
        Files.walkFileTree(Paths.get("."), new ListFiles());
    }

    public static boolean matches(Path path, String glob){
        PathMatcher matcher = FileSystems.getDefault().getPathMatcher(glob);
        return matcher.matches(path);
    }

}
