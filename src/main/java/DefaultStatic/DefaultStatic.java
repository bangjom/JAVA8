package DefaultStatic;

public interface DefaultStatic {

    void printName();

    /**
     *  구현하는 모든 클래스에 나중에 추가된 메소드를 override하기 어려우니 디폴트를 쓰는거야
     *  @implSpec getName()으로 가져온 문자열을 대문자로 바꿔 출력한다.
     **/
    default void printNameUpperCase(){
        System.out.println(getName().toUpperCase());
    }; //이걸 동작한다고 보장할수없어. null이 들어오면 어떻게 할거야?

    String getName();
}
