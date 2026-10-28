package com.priyanka.stream.demo;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ForEachDemo
    {
        public static void main(String[] args)
        {

        List<String> nameList = List.of("Priyanka", "Priya", "Piyu", "Pinkey");
        nameList.forEach(System.out::println);

        Map<Integer, String> letterMap1 = new HashMap<>();
        letterMap1.put(1, "P");
        letterMap1.put(2, "R");
        letterMap1.put(3, "I");
        letterMap1.put(4, "Y");
        letterMap1.put(5, "A");
        letterMap1.put(6, "N");
        letterMap1.put(7, "K");
        letterMap1.put(8, "A");

        letterMap1.forEach((k, v) ->
                System.out.println("Key: " + k + ", Value: " + v)
        );

        Map<Integer, String> letterMap2 = new HashMap<>();
        letterMap2.put(1, "P");
        letterMap2.put(2, "R");
        letterMap2.put(3, "I");
        letterMap2.put(4, "Y");
        letterMap2.put(5, "A");

        letterMap2.entrySet().forEach(System.out::println);
        }
    }

