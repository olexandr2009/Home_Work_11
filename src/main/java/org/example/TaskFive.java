package org.example;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TaskFive {
    public static void main(String[] args) {
        List<Integer> list = zip(Stream.of(1432,53455,43,45,5),Stream.of(123,234,543)).collect(Collectors.toList());
        System.out.println(list);
    }
    public static <T> Stream<T> zip(Stream<T> first, Stream<T> second){
        List<T> list = new ArrayList<>();
        Iterator<T> firstI = first.iterator();
        Iterator<T> secondI = second.iterator();

        while (firstI.hasNext() && secondI.hasNext()){
            list.add(firstI.next());
            list.add(secondI.next());
        }
        Collections.shuffle(list);
        return list.stream();
    }
}
