package java8stream;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        List<OnlineClass> springClasses = new ArrayList<>();
        springClasses.add(new OnlineClass(1, "spring boot", true));
        springClasses.add(new OnlineClass(2,"spring data jpa",true));
        springClasses.add(new OnlineClass(3,"spring mvc",false));
        springClasses.add(new OnlineClass(4,"spring core",false));
        springClasses.add(new OnlineClass(5, "rest api development", false));

        System.out.println("spring으로 시작하는 수업");
        //TODO

        System.out.println("close 되지 않은 수업");
        //TODO

        System.out.println("수업 이름만 모아서 스트림 만들기");
        //TODO

        List<OnlineClass> javaClasses = new ArrayList<>();
        javaClasses.add(new OnlineClass(6,"The Java, Test", true));
        javaClasses.add(new OnlineClass(7,"The Java, Code manipulation", true));
        javaClasses.add(new OnlineClass(8,"The Java, 8 to 11", false));
    }
}
