package java8Study;

import java.util.function.Consumer;
import java.util.function.IntConsumer;

public class Foo2 {
    public static void main(String[] args) {
        Foo2 foo2 = new Foo2();
        foo2.run();
    }

    private void run() {
        int baseNumber = 10;

//        class LocalClass {
//            void printBaseNumber() {
//                int baseNumber = 11;
//                System.out.println(baseNumber); //11
//            }
//        } // 쉐도잉됨
//
//        Consumer<Integer> integerConsumer = new Consumer<Integer>() {
//            @Override
//            public void accept(Integer baseNumber) {
//
//                System.out.println(baseNumber);
//            }
//        }; // 쉐도잉됨
        IntConsumer printInt = (i) -> {
            System.out.println(i + baseNumber);
        };// 쉐도잉 안됨

        printInt.accept(10);
    }
}
