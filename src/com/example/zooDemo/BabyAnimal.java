package com.example.zooDemo;

/**
 * Created by anniedevine on 9/29/14.
 */
public class BabyAnimal extends Animal {

    private boolean hasSiblings;

    public BabyAnimal(boolean hasSiblings, String species, int size, String gender)
    {
        super(species, size, gender);
        this.hasSiblings = hasSiblings;
    }

    public boolean getHasSiblings() {
        return hasSiblings;
    }

    public void setHasSiblings(boolean hasSiblings) {
        this.hasSiblings = hasSiblings;
    }
}
