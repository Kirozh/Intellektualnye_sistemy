package task5;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {

    // is the path contain the keyword
    public static boolean containKeyword(Path path, String keyword) {
        try {
            return Files.lines(path).anyMatch(line -> line.contains(keyword));
        }
        catch (IOException e) {
            return false;
        }
    }

    public static void main(String[] args) throws IOException {
        Path src = Paths.get("c:/src");

        Files.walk(src)
                .filter(path -> !Files.isDirectory(path))
                .filter(path -> Main.containKeyword(path, "transient"))
                .filter(path -> Main.containKeyword(path, "volatile"))
                .forEachOrdered(System.out::println);
    }
}
