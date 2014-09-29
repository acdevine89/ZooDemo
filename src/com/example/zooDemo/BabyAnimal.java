package com.example.zooDemo;

/**
 * Created by anniedevine on 9/29/14.
 */
public class BabyAnimal extends Animal {

    private boolean hasSiblingsOrNot;

    public BabyAnimal(boolean hasSiblingsOrNot, String species, int size, char gender)
    {
        super(species, size, gender);
        this.hasSiblingsOrNot = hasSiblingsOrNot;
    }


}
