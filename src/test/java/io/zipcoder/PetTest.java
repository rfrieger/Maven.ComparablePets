package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


public class PetTest{

    @Test
    public void PetConstructorNoarguments() {
        Pet c = new Cat();
        String actual = c.getName();
        String expected = "Jeff";

        Assert.assertEquals(actual,expected);
    }

    @Test
    public void PetConstructor() {
        Pet c = new Cat("Bob");
        String actual = c.getName();
        String expected = "Bob";

        Assert.assertEquals(actual,expected);
    }

    @Test
    public  void speakTest() {
        Pet c = new Cat();
        String actual = c.speak();
        String expected = "Meow";

        Assert.assertEquals(actual, expected);
    }
    @Test
    public void getName() {
        Pet c = new Cat();
        String actual = c.getName();
        String expected = "Jeff";

        Assert.assertEquals(actual, expected);
    }

    @Test
    public void setName() {
        Pet c = new Cat();
        c.setName("whatever");
        String actual = c.getName();
        String expected = "whatever";

        Assert.assertEquals(actual, expected);
    }

    @Test
    public void compareTo() {
        InputHandler i = new InputHandler();
        i.pets = new ArrayList<Pet>();

        Pet cat = new Dog("z");
        Pet dog = new Cat("a");
        Pet mouse = new Mouse("bob");

        i.pets.add(dog);
        i.pets.add(mouse);
        i.pets.add(cat);

        Collections.sort(i.pets);

        ArrayList actual = i.pets;//.get(0).getType();
        ArrayList expected = new ArrayList();

        expected.add(dog);
        expected.add(mouse);
        expected.add(cat);



        Assert.assertEquals(actual, expected);

    }

    @Test
    public void compareTo2() {
        InputHandler i = new InputHandler();
        i.pets = new ArrayList<Pet>();

        Pet cat = new Dog("a");
        Pet dog = new Cat("a");
        Pet mouse = new Mouse("a");

        i.pets.add(dog);
        i.pets.add(mouse);
        i.pets.add(cat);

        Collections.sort(i.pets);

        ArrayList actual = i.pets;//.get(0).getType();
        ArrayList expected = new ArrayList();


        expected.add(mouse);
        expected.add(cat);
        expected.add(dog);


        Assert.assertEquals(actual, expected);

    }
}
