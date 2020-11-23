package java8api;

import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class App {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("bj");
        names.add("yj");
        names.add("jj");
        names.add("vj");

        /**
         *  forEach
         */
        names.forEach(System.out::println);
        System.out.println("==========");
        for(String n :names){
            System.out.println(n);
        }
        System.out.println("==========");
        /**
         * Spliterator
         */
        Spliterator<String> spliterator= names.spliterator();
        Spliterator<String> stringSpliterator = spliterator.trySplit(); //반으로 쪼개
        while(spliterator.tryAdvance(System.out::println)); // 다음 값이 없으면 false
        System.out.println("==========");
        while(stringSpliterator.tryAdvance(System.out::println));
        /**
         * removeIf
         */
        System.out.println("==========");
        names.removeIf(s->s.startsWith("b"));

        names.forEach(System.out::println);

        names.add("bj");

        /**
         * reversed 반대로 정렬
         */
        Comparator<String> compareToIgnoreCase = String::compareToIgnoreCase;
        names.sort(compareToIgnoreCase.reversed());
        System.out.println("=============");
        /**
         * stream
         * 중개형 operation은 종료형 operation이 오기전까지 실행을 하지 않는다. 즉, LAZY하다.
         */
        List<String> collect = names.stream().map(String::toUpperCase).collect(Collectors.toList());

        names.stream().map(String::toUpperCase).forEach(System.out::println);

        System.out.println("=======");
    }
}
