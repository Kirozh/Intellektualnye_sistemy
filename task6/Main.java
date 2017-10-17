//package task6;
/*
import java.io.*;
public class Main {

    private final char lookFor;
    private FileReader file01 = new FileReader("/Users/justin/Desktop/Codes Netbean/JavaRandom/xanadu.txt");

    CountLetter(FileReader file, char lookFor) throws IOException {
        this.file01 = file;
        this.lookFor = lookFor;

    }


    private String readFile() {

        String everything;

        try (BufferedReader br = new BufferedReader(file01)) {
            StringBuilder sb = new StringBuilder();
            String line = br.readLine();

            while (line != null) {
                sb.append(line);
                sb.append(System.lineSeparator());
                line = br.readLine();

            }
            everything = sb.toString();
        }
        return everything;
    }

    private int count(String line) {
        int count = 0;

        for (int i = 0; i < line.length(); i++) {
            if (line.charAt(i) == lookFor) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
	// write your code here
        FileReader file01 = new FileReader("/Users/justin/Desktop/Codes Netbean/JavaRandom/xanadu.txt");
        CountLetter cl1 = new CountLetter(file01, 'a');

        System.out.println(cl1.count(cl1.readFile()));
    }
    }
}
*/
import java.io.BufferedInputStream;
import java.io.FileInputStream;

class Main{
    public static void main(String args[])
    {
    //String s=args[0];
	System.out.println("Input letter: ");
    char letter=args[0].charAt(0);
        try{
        FileInputStream fis=new FileInputStream("C:\\Users\\User\\Temp.txt");
        BufferedInputStream bis=new BufferedInputStream(fis);
        int i;
        int count=0;
        while((i=bis.read())!=-1)
        {
            char a=(char)i;
            if(a==letter)
            {
                count++;
            }
        }
        System.out.println("Letter " + letter +" appears in the file "+count+" TIMES");
    }
    catch(Exception ex)
    {
        System.out.println(ex.getMessage());
    }
    }
}