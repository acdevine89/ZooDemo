package com.example.zooDemo;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by anniedevine on 9/29/14.
 */
public class Pen {

    private ArrayList<Animal> allTheAnimals;
    private ArrayList<BabyAnimal> allTheBabyAnimals;

    public Pen()
    {
        allTheAnimals = new ArrayList<Animal>();
        allTheBabyAnimals = new ArrayList<BabyAnimal>();
    }

    public List<Animal> getAllTheAnimals() {
        return allTheAnimals;
    }

    public List<BabyAnimal> getAllTheBabyAnimals() {
        return allTheBabyAnimals;
    }

}
