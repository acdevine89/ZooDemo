package com.example.zooDemo;
import java.util.ArrayList;
import java.util.List;

public class Pen {

    private ArrayList<Animal> allTheAnimals;
    private ArrayList<BabyAnimal> allTheBabyAnimals;
    //private String penName;

    public Pen()
    {
        allTheAnimals = new ArrayList<Animal>();
        allTheBabyAnimals = new ArrayList<BabyAnimal>();
    }

    public ArrayList<Animal> getAllTheAnimals() {
        return allTheAnimals;
    }

    public ArrayList<BabyAnimal> getAllTheBabyAnimals() {
        return allTheBabyAnimals;
    }

    public String display()
    {
        String ret = "Animals: " + allTheAnimals.size() + " Baby Animals: " + allTheBabyAnimals.size();

        for(Animal thisAnimal : allTheAnimals)
        {
            ret += "\n\tAnimal: " + thisAnimal.display();
        }

        for(BabyAnimal thisBabyAnimal : allTheBabyAnimals)
        {
            ret += "\n\tBaby Animal: " + thisBabyAnimal.display();
        }

        return ret;
    }

}
