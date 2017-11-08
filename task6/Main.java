package task6;


import java.io.IOException;
import java.nio.file.*;
import java.util.stream.Stream;



public class Main {

    public static long searchingForLetter(Path path, char letter)
    {
        try {
            Stream<String> lines=Files.lines(path);

            return lines.filter(line -> line.contains(Character.toString(letter))).count();
        }
        catch (IOException e) {
            return -1;
        }
    }

    public static void main(String[] args) {
        // write your code here
        Path p1 = Paths.get("d:\\temp.txt");
        System.out.println("Input a letter");
        char letter = args[0].charAt(0);
        try {
            System.out.println("letter" + letter + "appears in file " + searchingForLetter(p1, letter) + "times");
        }
        catch (Exception ex)
        {
            System.out.println(ex.getMessage());
        }

    }
}
