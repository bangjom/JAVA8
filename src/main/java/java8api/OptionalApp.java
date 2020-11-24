package java8api;

import java.util.*;

public class OptionalApp {
    public static void main(String[] args) {
        List<OnlineClass> springClasses = new ArrayList<>();
        springClasses.add(new OnlineClass(1,"spring boot",true));
        springClasses.add(new OnlineClass(2,"spring data jpa",true));
        springClasses.add(new OnlineClass(3,"spring mvc",false));
        springClasses.add(new OnlineClass(4,"spring core",false));
        springClasses.add(new OnlineClass(5,"rest api development",false));

        /**
         * Null 체크
         */
        springClasses.get(0).getProgress().ifPresent(p-> System.out.println(p.getStduyDuration()));


        /**
         *  optional 리턴
         */
        Optional<OnlineClass> onlineClass = springClasses.stream()
                .filter(oc -> oc.getTitle().startsWith("spring"))
                .findFirst();


        onlineClass.ifPresent(o-> System.out.println(o.getTitle()));

        OnlineClass onlineClass1 = onlineClass.orElseGet(OptionalApp::createNewClass); //  만들어줄게 없으면 에러를 던저라 orElseThrow(()->);
        System.out.println(onlineClass1.getTitle());

        Optional<OnlineClass> onlineClass2 = onlineClass.filter(OnlineClass::isClosed);

        Integer integer = onlineClass.map(OnlineClass::getId).get();
        System.out.println(integer);

        Optional<Optional<Progress>> progress1 = onlineClass.map(OnlineClass::getProgress);
        Optional<Progress> progress = onlineClass.flatMap(OnlineClass::getProgress);
    }

    private static OnlineClass createNewClass() {
        return new OnlineClass(10,"New class", false);
    }


}
