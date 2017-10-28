package task5;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {

    
    public static boolean searchingForKey(Path path, String keyword) {
        try {
            return Files.lines(path).anyMatch(line -> line.contains(keyword));
        }
        catch (IOException e) {
            return false;
        }
    }

    public static void main(String[] args) {
        Path p1 = Paths.get("c:/src");

        Files.walk(p1)
                .filter(path -> !Files.isDirectory(path))
                .filter(path -> Main.searchingForKey(path, "transient"))
                .filter(path -> Main.searchingForKey(path, "volatile"))
                .forEachOrdered(System.out::println);
    }
}
