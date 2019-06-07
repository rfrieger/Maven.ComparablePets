package io.zipcoder;

import org.omg.CORBA.INTERNAL;

import java.util.ArrayList;
import java.util.Scanner;


public class InputHandler {
    private Integer petNum;
    public ArrayList<Pet> pets;
    private Scanner scanner = new Scanner(System.in);


    public void getPetNum() {

        System.out.println("How many pets do you have");
        petNum = inputPetNum();
        if(petNum <= 0) {
            System.out.println("invalid number, Enter a valid number");
            petNum = inputPetNum();
        }

        pets = new ArrayList<Pet>(petNum);
    }

    public void addPetsArray () {
        for (int i = 0; i < petNum  ; i++) {
            System.out.println("What type of pet do you have?");
            String type = inputType();
            System.out.println("what is it's name?");
            String name = inputName();
            createPet(type, name);
        }
    }

    public void createPet(String type, String name) {
        if(type.toLowerCase().equals("dog")) {
            pets.add(new Dog(name));
        }else if(type.toLowerCase().equals("cat")) {
            pets.add(new Cat(name));
        }else if(type.toLowerCase().equals("mouse")) {
            pets.add(new Mouse(name));
        }else System.out.println("invalid type");
    }

    public String inputType() {
        String type = scanner.next();
        return type;
    }

    public String inputName() {
        String  name = scanner.next();
        return name;
    }

    public  Integer inputPetNum(){
        Integer petnum = scanner.nextInt();
        return petnum;
    }

    public ArrayList getArr () {
        return this.pets;
    }
}


