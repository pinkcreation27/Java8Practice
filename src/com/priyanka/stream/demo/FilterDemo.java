package com.priyanka.stream.demo;

import org.w3c.dom.ls.LSInput;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FilterDemo {
    public static void main(String[] args){

        List<String> nameList = List.of("Priyanka","Priya","Pinkey","Piyu","Satara");

        nameList.stream()
                .filter(s -> s.startsWith("S"))
                .forEach(System.out::println);

        Map<Integer,String> map = new HashMap<>();
        map.put(1,"P");
        map.put(2,"R");
        map.put(3,"I");
        map.put(4,"Y");

        map.entrySet().stream()
                .filter(k  -> k.getKey() % 2 ==0)
                .forEach(System.out::println);

    }
}
