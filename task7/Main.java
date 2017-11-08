package task7;
import java.util.*;
import java.io.*;

public class Main {

    public static int lineNumber(File myfile)
    {
        int lineNumber = 0;
        try {
            FileReader filereader = new FileReader(myfile);
            LineNumberReader linenumberreader = new LineNumberReader(filereader);



            while (linenumberreader.readLine() != null)
                lineNumber++;



            linenumberreader.close();
        }
        catch(IOException e ) {
            System.exit(1);
        }
         return lineNumber;
    }

    public static List<String> randomRepeat(File file, int stringLength) {
        List<String> lines = new ArrayList<String>((int)(file.length() / stringLength) * 2);

        BufferedReader reader = null;


        try {
            FileReader fReader= new FileReader(file);
            reader = new BufferedReader(fReader);

            for (String line = reader.readLine(); line != null; line = reader.readLine())
                lines.add(line);


        } catch (IOException e) {
            //System.err.println("Could not read file");
            System.exit(1);
        } finally {
            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException e) {}
            }
        }
        return lines;
    }
    public static void main(String[] args) {
        final int stringLength = 50;
        File myfile = new File(args[0]);

        int i;
        int numberOfRepeats = Integer.parseInt(args[1]);
        Random random = new Random();
        
        for (i = 0; i < numberOfRepeats; i++) {
            System.out.println(" string " + i + " = " + randomRepeat(myfile, stringLength).get(random.nextInt(lineNumber(myfile)-1)));
        }
    }
}
