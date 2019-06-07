package io.zipcoder;

public class Cat extends Pet {
    private String type = "cat";

    Cat() {
        super("Jeff", "cat");
    }

    Cat(String name) {
        super(name, "cat");
    }

    public String speak() {
        return "Meow";
    }


}
