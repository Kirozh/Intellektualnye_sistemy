package task4;

import java.io.InputStream;
import java.util.Scanner;
import java.util.function.DoubleSupplier;
import java.util.function.IntSupplier;
import java.util.function.Supplier;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
        //IntStream stream = new ScannerStreamInt(System.in).stream();
        //DoubleStream stream = new ScannerStreamDouble(System.in).stream();
        //Stream<String> stream = new ScannerStreamLine(System.in).stream();


        stream.limit(5).forEach(x -> System.out.println(x));
    }

    public static class ScannerStreamInt{
        Scanner scan;
        IntSupplier supplier = () -> {
            return scan.nextInt();
        };
        ScannerStreamInt(InputStream in) {
            scan = new Scanner(in);
        }
        IntStream stream(){
            return IntStream.generate(supplier);
        }
    }

    public static class ScannerStreamDouble{
        Scanner scan;
        DoubleSupplier supplier = () -> {
            return scan.nextDouble();
        };
        ScannerStreamDouble(InputStream in) {
            scan = new Scanner(in);
        }
        DoubleStream stream(){
            return DoubleStream.generate(supplier);
        }
    }

    public static class ScannerStreamLine{
        Scanner scan;
        Supplier<String> supplier = () -> {
            return scan.nextLine();
        };
        ScannerStreamLine(InputStream in) {
            scan = new Scanner(in);
        }
        Stream<String> stream(){
            return Stream.generate(supplier);
        }
    }

}





