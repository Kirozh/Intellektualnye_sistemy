package task9;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Spliterator;
import java.util.Spliterators;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

public class Main {

    public static <T> Stream<T> own_zip(Stream<T> first, Stream<T> second) {
        Spliterator<T> firstSpliterator = first.spliterator();
        Spliterator<T> secondSpliterator = second.spliterator();
        Spliterator<T> spliterator = null;

        Iterator<T> firstIterator = Spliterators.iterator(firstSpliterator);
        Iterator<T> secondIterator = Spliterators.iterator(secondSpliterator);
        Iterator<T> iterator = new Iterator<T>() {
            boolean nowfirst = true;

            @Override
            public boolean hasNext() {
                return this.nowfirst ? firstIterator.hasNext() : secondIterator.hasNext();
            }

            @Override
            public T next() {
                if (this.nowfirst) {
                    this.nowfirst = false;
                    return firstIterator.next();
                }
                this.nowfirst = true;
                return secondIterator.next();
            }
        };

        int characteristics = firstSpliterator.characteristics() & secondSpliterator.characteristics()
                &  ~(Spliterator.DISTINCT | Spliterator.SORTED | Spliterator.SIZED);

        spliterator = Spliterators.spliteratorUnknownSize(iterator, characteristics);

        boolean isParallel = first.isParallel() || second.isParallel();

        return StreamSupport.stream(spliterator, isParallel);
    }

    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<Integer>();

        list1.add(100);
        list1.add(300);
        list1.add(500);
        list1.add(700);
        list1.add(900);

        List<Integer> list2 = new ArrayList<Integer>();

        list2.add(0);
        list2.add(200);
        list2.add(400);
        list2.add(600);
        list2.add(800);
        
        Stream<Integer> stream = own_zip(list1.stream(), list2.stream());

        System.out.println(stream.map(f -> f.toString()).collect(Collectors.joining(", \t")));
    }
}
