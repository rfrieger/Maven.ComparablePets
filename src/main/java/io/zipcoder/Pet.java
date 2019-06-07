package io.zipcoder;

public class Pet {
    private String name;


    Pet() {
        this.name = "fido";
    }

    Pet(String name) {
        this.name = name;
    }

    Pet(String name, String type) {
        this.name = name;
    }

    public String speak() {
        return "yikes";
    }

    ;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
