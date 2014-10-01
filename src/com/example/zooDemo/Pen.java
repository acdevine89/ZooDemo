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
        String ret = allTheAnimals.size() + " Animals, " + allTheBabyAnimals.size() + " Baby Animals";

        for(Animal thisAnimal : allTheAnimals)
        {
            int i = 1;
            ret += "\n\tAnimal #" + i + thisAnimal.display();
            i++;
        }

        for(BabyAnimal thisBabyAnimal : allTheBabyAnimals)
        {
            int i = 1;
            ret += "\n\tBaby Animal #" + i + thisBabyAnimal.display();
            i++;
        }

        return ret;
    }

}
