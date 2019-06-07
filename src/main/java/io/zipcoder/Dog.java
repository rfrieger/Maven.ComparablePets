package io.zipcoder;


    public class Dog extends Pet {
        private String name;

        Dog() {
            super("fido");
        }
        Dog(String name) {
            super(name);
        }

        @Override
        public String speak() {
            return "Bark";
        }

    }
