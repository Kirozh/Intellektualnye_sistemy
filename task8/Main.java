package task8;

import java.util.stream.Stream;
import java.io.*;
import java.math.*;
public class Main {



    public static void main(String[] args) {
        final long a=25214903917L;
        final int c=11;
        final long m=(long)Math.pow(2,48);
        classRandom random=new classRandom(a,c,m);
        System.out.print(m);
        //int x0=Integer.parseInt(args[0]);
	    int x0=0;
        Stream<Integer> integers = Stream.iterate(x0, xn->(int)random.get_(xn));
        integers.forEach(System.out::println);
    }


}
