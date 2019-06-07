package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class DogTest {

    @Test
    public void speak() {
        Dog c = new Dog();
        String actual = c.speak();
        String expected = "Bark";

        Assert.assertEquals(actual,expected);
    }

    @Test
    public void DogConstructorNoarguments() {
        Dog c = new Dog();
        String actual = c.getName();
        String expected = "fido";

        Assert.assertEquals(actual,expected);
    }

    @Test
    public void DogConstructor() {
        Dog c = new Dog("Bob");
        String actual = c.getName();
        String expected = "Bob";

        Assert.assertEquals(actual,expected);
    }
}