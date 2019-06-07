package io.zipcoder;

import java.util.ArrayList;
import java.util.Scanner;


    public class InputHandler {
        private Integer petNum;
        public ArrayList<Pet> pets;
        private Scanner scanner = new Scanner(System.in);


        public void getPetNum() {

            System.out.println("How many pets do you have");
            petNum = scanner.nextInt();
            if(petNum <= 0) {
                System.out.println("invalid number, Enter a valid number");
                petNum = scanner.nextInt();
            }

            pets = new ArrayList<Pet>(petNum);
        }

        public void addPetsArray () {

            for (int i = 0; i < petNum  ; i++) {
                System.out.println("What type of pet do you have?");
                String type = scanner.next();
                System.out.println("what is it's name?");
                String name = scanner.next();

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
}
