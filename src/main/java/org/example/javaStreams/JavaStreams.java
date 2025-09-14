package org.example.javaStreams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class JavaStreams {

    public static void main(String[] args)
    {
        System.out.print(IntStream
                .range(1,10)
//                .skip(5)
                .sum());
//                .forEach(System.out :: print);

        System.out.println();
        String [] str = {"Shivani","Apurva","Deepika","Seema"};
        Arrays.stream(str)
              .filter(x->x.startsWith("S"))
                .sorted()
                .forEach(s->System.out.print(s));
        System.out.println();

        Arrays.stream(new int[] {2,3,1,4})
                .map(x->x*x)
                .average().ifPresent(System.out::println);

        List<String> list = Arrays.asList("Shivani","Seema","Gauri");
        list.stream().map(s->s.toUpperCase()).forEach(System.out::println);

//        double d= Stream.of(7.3,9.8.1.3).reduce(0.0 , (Double a,Double b) -> a+b);


    }
}
