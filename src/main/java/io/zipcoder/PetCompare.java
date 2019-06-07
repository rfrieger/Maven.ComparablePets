package io.zipcoder;

import java.util.Comparator;

 class PetCompare implements Comparator<Pet> {

    public int compare(Pet o1, Pet o2) {
        if (o1.getType().compareTo(o2.getType()) > 0) {
            return 1;
        } else if (o1.getType().compareTo(o2.getType()) < 0) {
            return -1;
        } else {
            if ( o1.getName().toLowerCase().compareTo(o2.getName().toLowerCase() ) > 0) {
                return 1;
            }else if (o1.getName().toLowerCase().compareTo(o2.getName().toLowerCase()) < 0) {
                return  -1;
            } else
                return 0;
        }
    }
}
