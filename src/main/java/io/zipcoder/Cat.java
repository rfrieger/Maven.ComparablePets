package io.zipcoder;

public class Cat extends Pet {
    private String name;

    Cat() {
        super("Jeff");
    }
    Cat(String name) {
        super(name);
    }

    @Override
    public String speak() {
        return "Meow";
    }
}
