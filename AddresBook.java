package com.company;
import java.util.*;
import java.util.stream.Stream;
public class AddresBook {
    public static void main(String args[]) {
        ArrayList<String> List = new ArrayList<String>();
        List.add("A");
        List.add("B");
        List.add("C");
        List.add("D");
        Iterator itr = List.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
        {
            //for Sorting
            AddresBook.stream().sorted()
                    .map(String::toUpperCase)
                    .forEach(System.out::println);
            //for filtering
            List.stream().filter((s) -> s.startsWith("A"))
                    .forEach(System.out::println);
            //for find
            Stream.of("A", "B", "C", "D")
                    .parallel()
                    .findAny()
                    .ifPresent(System.out::println);
        }
    }
}
