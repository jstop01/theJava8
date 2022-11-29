package java8Study;

import java.util.function.*;

public class Foo {
    public static void main(String[] args) {
//        Function<Integer, Integer> plus10 = (i) -> i + 10;
//        Function<Integer,Integer> multiply2 = (i) -> i * 2;
//        System.out.println(plus10.andThen(multiply2).apply(2));

        /*Consumer<Integer> printT = (i) -> System.out.println(i);
        printT.accept(10);*/

//        Supplier<Integer> get10 = () -> 10;
//        System.out.println(get10.get());

//        Predicate<String> startSwithJaeseok = (s) -> s.startsWith("jaeseok");

        UnaryOperator<Integer> plus = (i) -> i +10;
        UnaryOperator<Integer> multiply2 = (i) -> i*2;
        System.out.println(plus.andThen(multiply2).apply(2));

        BinaryOperator<Integer> sum = (a,b) -> a+b;
    }
}
