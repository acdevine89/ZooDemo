package com.example.zooDemo;

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

    public String display()
    {
        return super.display() + " Has Siblings: " + getHasSiblings();
    }
}
