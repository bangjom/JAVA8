package Lamda;

import java.util.function.*;

public class App {
    public static void main(String[] args) {
        UnaryOperator<String> hi = Greeting::hi; // 이게 메소드 레퍼런스 (static)
        System.out.println(hi.apply("bj"));
        Greeting greeting = new Greeting();
        UnaryOperator<String> hello = greeting::hello; // 메소트 레퍼런스

        Supplier<Greeting> supplier = Greeting::new; // 인스턴트 만들지지 않아 그냥 레퍼런스할뿐.

        Function<String, Greeting> function = Greeting::new; // 인스턴트 만들지 않아 그냥 레퍼런스하는데, arg있는 생성자
        Greeting bj = function.apply("bj");
        System.out.println(bj.getName());
    }
}
