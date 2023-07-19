package org.example;

import java.util.ArrayList;
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
        if (names == null){
            return null;
        }
        List<String> mp = new ArrayList<>(IntStream.range(0, names.size())
                .boxed()
                .collect(Collectors.groupingBy(i -> i % 2 == 0 ? "even" : "odd",
                        Collectors.toMap( (i -> i ) , names::get)))
                .get("odd")
                .values());

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < mp.size();i++) {
            sb.append(String.format("%d. %s, ",i + 1 ,mp.get(i)));
        }
        sb.deleteCharAt(sb.length()-2);
        return sb.toString();
    }
}
