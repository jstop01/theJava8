package java8to11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class App {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("keesun");
        names.add("whiteship");
        names.add("toby");
        names.add("foo");

        for(String name : names) {
            System.out.println(name.toUpperCase());
        }

        List<String> collect = names.parallelStream().map(String::toUpperCase).collect(Collectors.toList());

        collect.forEach(System.out::println) ;

    }
}
