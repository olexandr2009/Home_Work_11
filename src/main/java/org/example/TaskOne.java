package org.example;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class TaskOne {

    public static final List<String> names = Arrays.asList("Ivan","Olexandr","Daryna","Jhon","Ian","Volodymyr","Alina","Peter");
    public static void main(String[] args) {
        System.out.println(getOddNames(names));
    }
    public static String getOddNames(List<String> names){
       return  IntStream.range(0, names.size())
               .filter(i -> i % 2 != 0)
               .mapToObj(i -> i + ". " + names.get(i))
               .collect(Collectors.joining(", "));
    }
}
