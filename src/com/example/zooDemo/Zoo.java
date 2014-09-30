package com.example.zooDemo;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by anniedevine on 9/29/14.
 */
public class Zoo {

    private ArrayList<Pen> allThePens = new ArrayList<Pen>();

    public void addPen()
    {
        allThePens.add(new Pen());
    }

    public ArrayList<Pen> getAllThePens()
    {
        return allThePens;
    }

    public String display()
    {
        String ret = new String();

        for(Pen thisPen : allThePens)
        {
            ret += thisPen.display();
        }

        return ret;
    }

//    public void displayAnimalsInPen()
//    {
//        for(Pen thisPen : allThePens)
//        {
//            System.out.println(thisPen.getAllTheAnimals());
//            System.out.println(thisPen.getAllTheBabyAnimals());
//        }
//    }
//

}
