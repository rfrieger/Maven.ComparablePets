package io.zipcoder;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class CatTest {

    @Test
    public void speak() {
        Cat c = new Cat();
        String actual = c.speak();
        String expected = "Meow";

        Assert.assertEquals(actual,expected);
    }

    @Test
    public void CatConstructorNoarguments() {
        Cat c = new Cat();
        String actual = c.getName();
        String expected = "Jeff";

        Assert.assertEquals(actual,expected);
    }

    @Test
    public void CatConstructor() {
        Cat c = new Cat("Bob");
        String actual = c.getName();
        String expected = "Bob";

        Assert.assertEquals(actual,expected);
    }

}