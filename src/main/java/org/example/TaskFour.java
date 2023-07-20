package org.example;

import java.util.stream.Stream;

public class TaskFour {
    public static void main(String[] args) {
//        infinity-loop
        randomStream(25214903917L, 11 , 2^48L,0,66868)
                .forEach(System.out::println);
    }
    private static Stream<Long> randomStream(long a, int c, long m, long seed, int end) {
        return Stream
                .iterate(seed, x -> (a * x + c) % m)
                .limit(end);
    }
}
