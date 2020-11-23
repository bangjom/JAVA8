@FunctionalInterface
public interface RunSomething {

    void doIt(); // 추상메소드가 하나만 있으면 함수형 인터페이스 abstract,public 생략 가능

    static void printName(){
        System.out.println("bj");
    }
    default void printAge(){
        System.out.println("26");
    }

}
