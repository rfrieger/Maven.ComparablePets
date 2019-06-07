package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class InputHandlerTest {

    //    @Test
//    public void getPetNumTest() {
//        InputHandler i = new InputHandler();
//        Integer petNum = 1;
//        ArrayList<Pet> pets = new ArrayList<Pet>();
//
//        i.getPetNum();
//
//        int actual = pets.size();
//        int expected = 1;
//
//        Assert.assertEquals(actual,expected);
//    }



    @Test
    public void createPet() {
        InputHandler i = new InputHandler();
        i.pets = new ArrayList<Pet>(5);

        i.createPet("dog", "bob");

        String actual = i.pets.get(0).getName();
        String expected = "bob";

        Assert.assertEquals(actual,expected);

    }

}