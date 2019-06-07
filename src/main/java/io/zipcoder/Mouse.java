package io.zipcoder;


    public class Mouse extends Pet {
        private String type = "cat";

        Mouse() {
            super("mousey", "mouse");
        }

        Mouse(String name) {
            super(name, "mouse");
        }


        public String speak() {
            return "Mouse sound";
        }

    }

