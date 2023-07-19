package org.example;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class TaskTwo {
    public static void main(String[] args) {
        System.out.println(sortList(TaskOne.names));
    }
    public static List<String> sortList(List<String> list){
    return list.stream()
            .map(String::toUpperCase)
            .sorted(Collections.reverseOrder())
            .collect(Collectors.toList());
    }
}
