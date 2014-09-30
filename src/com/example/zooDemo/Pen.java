package com.example.zooDemo;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by anniedevine on 9/29/14.
 */
public class Pen {

    private ArrayList<Animal> allTheAnimals;
    private ArrayList<BabyAnimal> allTheBabyAnimals;
    //private String penName;

    public Pen()
    {
        allTheAnimals = new ArrayList<Animal>();
        allTheBabyAnimals = new ArrayList<BabyAnimal>();
        //penName = ;
    }

    public ArrayList<Animal> getAllTheAnimals() {
        return allTheAnimals;
    }

    public ArrayList<BabyAnimal> getAllTheBabyAnimals() {
        return allTheBabyAnimals;
    }

    public String display()
    {
        String ret = "Animals: " + getAllTheAnimals().size() + " Baby Animals: " + getAllTheBabyAnimals().size();

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
