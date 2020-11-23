package DefaultStatic;

public interface DefaultStatic_child extends DefaultStatic {

    /**
     *  DefaultStatic에서 제공하는 printNameUpperCase를 지원하고 싶지않으면 다시 추상메소드로 변경
     */
    void printNameUpperCase();

    static public void withoutNew(){
        System.out.println("구현하지말고 써~ ");
    }
}
