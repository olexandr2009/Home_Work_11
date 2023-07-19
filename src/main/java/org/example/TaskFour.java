package org.example;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TaskFour {
    public static void main(String[] args) {
//        infinity-loop
        Stream.iterate(0, i -> generate(getParameters(25214903917L, 11L, 2 ^ 48L), i))
                .forEach(System.out::println);
    }
    public static Stream<Long> getParameters(long a, long c, long m){
        return Stream.of(a ,c ,m);
    }
    public static int generate(Stream<Long> acm, int seed){
        List<Long> parameters = acm.collect(Collectors.toList());
        int[] x = new int[2];
        x[0] = seed;
        long a = parameters.get(0);
        long c = parameters.get(1);
        long m = parameters.get(2);
        for (int n = 0; n < x.length - 1;n++) {
            x[n + 1] = (int) ((((a * x[n]) + c) % m));
        }
        return x[1];
    }
    public static void generate(long a, long c, long m) {
        generate(getParameters(a,c,m), 0);
    }
}
