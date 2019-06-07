package io.zipcoder;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;

import static org.junit.Assert.*;

public class PetCompareTest {

    @Test
    public void compareTest() {
        InputHandler i = new InputHandler();
        PetCompare pc = new PetCompare();
        i.pets = new ArrayList<Pet>();

        Pet cat = new Dog("z");
        Pet dog = new Cat("a");
        Pet mouse = new Mouse("bob");

        i.pets.add(dog);
        i.pets.add(mouse);
        i.pets.add(cat);

        Collections.sort(i.pets, pc);

        ArrayList actual = i.pets;//.get(0).getType();
        ArrayList expected = new ArrayList();

        expected.add(mouse);
        expected.add(dog);
        expected.add(cat);
    }

    @Test
    public void compareTest2() {
        InputHandler i = new InputHandler();
        PetCompare pc = new PetCompare();
        i.pets = new ArrayList<Pet>();

        Pet cat = new Dog("z");
        Pet dog = new Dog("a");
        Pet mouse = new Dog("bob");

        i.pets.add(dog);
        i.pets.add(mouse);
        i.pets.add(cat);

        Collections.sort(i.pets, pc);

        ArrayList actual = i.pets;//.get(0).getType();
        ArrayList expected = new ArrayList();

        expected.add(mouse);
        expected.add(dog);
        expected.add(cat);
    }
}