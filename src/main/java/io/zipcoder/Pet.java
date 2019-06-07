package io.zipcoder;

import java.util.Collections;
import java.util.Comparator;

abstract class Pet implements Comparable<Pet> {
    private String name;
    private String type;


    Pet() {
        this.name = "fido";
    }

    Pet(String name) {
        this.name = name;
    }

    Pet(String name, String type) {
        this.name = name;
        this.type = type;
    }

    abstract String speak();


    public String getName() {
        return name;
    }

    public String getType(){
        return type;
    }

    public void setName(String name) {
        this.name = name;
    }


    public int compareTo(Pet o) {
        if (this.name.toLowerCase().compareTo(o.name.toLowerCase()) > 0) {
            return 1;
        } else if (this.name.toLowerCase().compareTo(o.name.toLowerCase()) < 0) {
            return -1;
        } else {
            if ( this.type.compareTo(o.type ) < 0) {
                return 1;
            }else if (this.type.compareTo(o.type) > 0) {
                return  -1;
            } else
                return 0;
        }
    }


}
