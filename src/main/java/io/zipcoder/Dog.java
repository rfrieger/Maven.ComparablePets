package io.zipcoder;


    public class Dog extends Pet {
        private String type = "dog";

        Dog() {
            super("fido", "dog");
        }
        Dog(String name) {
            super(name, "dog");
        }


        public String speak() {
            return "Bark";
        }

    }
