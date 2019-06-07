package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class MouseTest {

    @Test
    public void speak() {
        Mouse c = new Mouse();
        String actual = c.speak();
        String expected = "Mouse sound";

        Assert.assertEquals(actual,expected);
    }

    @Test
    public void MouseConstructorNoarguments() {
        Mouse c = new Mouse();
        String actual = c.getName();
        String expected = "mousey";

        Assert.assertEquals(actual,expected);
    }

    @Test
    public void MouseConstructor() {
        Mouse c = new Mouse("Bob");
        String actual = c.getName();
        String expected = "Bob";

        Assert.assertEquals(actual,expected);
    }
}