package io.zipcoder;

import java.lang.reflect.Array;
import java.security.PrivateKey;
import java.util.*;


public class Application {
    public static void main(String[] args) {
        InputHandler input = new InputHandler();

        input.getPetNum();
        input.addPetsArray();

        Collections.sort(input.pets);


        for (Pet p: input.pets) {
            System.out.println(p.getName());

        }
        PetCompare pc = new PetCompare();
        Collections.sort(input.pets, pc );

        for (Pet p: input.pets) {

            System.out.println(p.getType());
        }

    }
}
