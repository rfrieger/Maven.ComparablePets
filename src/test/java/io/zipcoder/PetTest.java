package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;
import java.util.Scanner;


public class PetTest{

    @Test
    public void PetConstructorNoarguments() {
        Pet c = new Pet();
        String actual = c.getName();
        String expected = "fido";

        Assert.assertEquals(actual,expected);
    }

    @Test
    public void PetConstructor() {
        Pet c = new Pet("Bob");
        String actual = c.getName();
        String expected = "Bob";

        Assert.assertEquals(actual,expected);
    }

    @Test
    public  void speakTest() {
        Pet c = new Pet();
        String actual = c.speak();
        String expected = "yikes";

        Assert.assertEquals(actual, expected);
    }
    @Test
    public void getName() {
        Pet c = new Pet();
        String actual = c.getName();
        String expected = "fido";

        Assert.assertEquals(actual, expected);
    }

    @Test
    public void setName() {
        Pet c = new Pet();
        c.setName("whatever");
        String actual = c.getName();
        String expected = "whatever";

        Assert.assertEquals(actual, expected);
    }
}
