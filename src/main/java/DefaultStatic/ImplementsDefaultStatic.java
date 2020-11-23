package DefaultStatic;

import DefaultStatic.DefaultStatic;

public class ImplementsDefaultStatic implements DefaultStatic {

    String name;

    public ImplementsDefaultStatic(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public void printNameUpperCase() {
        System.out.println(this.getName().toUpperCase());
    }

    @Override
    public void printName() {
        System.out.println("bj");
    }
}
