package com.example.zooDemo;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by anniedevine on 9/29/14.
 */
public class Pen {

    private List<Animal> allTheAnimals = new ArrayList<Animal>();
    private List<BabyAnimal> allTheBabyAnimals = new ArrayList<BabyAnimal>();

    public Pen(List allTheAnimals, List allTheBabyAnimals)
    {
        this.allTheAnimals = allTheAnimals;
        this.allTheBabyAnimals = allTheBabyAnimals;
    }

    public List<Animal> getAllTheAnimals() {
        return allTheAnimals;
    }

    public List<BabyAnimal> getAllTheBabyAnimals() {
        return allTheBabyAnimals;
    }

}
