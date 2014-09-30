package com.example.zooDemo;

/**
 * Created by anniedevine on 9/29/14.
 */
public class Animal {

    private String species;
    private int size;
    private String gender;

    public Animal(String species, int size, String gender)
    {
        this.species = species;
        this.size = size;
        this.gender = gender;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String display()
    {
        return "Species: " + getSpecies() + " Gender: " + getGender() + " Size: " + getSize();
    }
}
