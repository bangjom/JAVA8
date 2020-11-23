package Lamda;

import Lamda.RunSomethingWithParameter;

import java.util.function.*;


public class Foo {
    public static void main(String[] args) {
        int basenumber = 10 ;//effective final 다른데서 변경하지않아 거의 final
//        // 예전식 구현 방법 :  익명 내부 클래스
//        RunSomething runSomething = new RunSomething() {
//            int number=10; 이런 값을 가지고 변경하면 pure한 함수가 아니야
//            @Override
//            public void doIt() {
//                  number++;
//            }
//        }
        // 요즘 구현 방법: 람다 표현식
        RunSomething runSomething = () -> System.out.println("Hello"); //람다는 쉐도잉 안되다잉.
        runSomething.doIt();
        RunSomethingWithParameter runSomethingWithParameter = (number) -> {return number+10;};
        System.out.println(runSomethingWithParameter.doIt(12));


//        Plus10 plus10 = new Plus10();
//        System.out.println(plus10.apply(1));

        Function<Integer, Integer> plus10 = (i) -> i+10;
        System.out.println(plus10.apply(1));

        Function<Integer,Integer> multiply2 = (i) -> i*2;

        UnaryOperator<Integer> plus10_2 = (i) -> i+10; // Function에서 인풋이랑 아웃풋 타입이 같은거

        Function<Integer, Integer> multiPlus = plus10.compose(multiply2);//10더하기전에 2를 곱하겠다.
        System.out.println(multiPlus.apply(2));

        System.out.println(plus10.andThen(multiply2).apply(2));

        BiFunction<Integer, Integer, Integer> plus10_20= (i,j)-> i+j;
        System.out.println(plus10_20.apply(10,20));

        BinaryOperator<Integer> plus10_20_2 = (i,j) ->i+j; // Bifunction에서 모든 것이 다 타입이 같은거

        Consumer<Integer> prinT =(integer -> System.out.println(integer));
        prinT.accept(1000);

        Supplier<Integer> get10 = () -> {
            return 10;
        };
        System.out.println(get10);

        Predicate<String> startsWithBJ = (s) -> s.startsWith("bj"); // true or false 를 나타내줘
        Predicate<Integer> isOdd = (i) -> i%2 !=0;

        isOdd.or(isOdd).test(7);
    }
}
