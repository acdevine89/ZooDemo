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
        System.out.println("New animal pen has been set up!");
        System.out.println();
    }

    public ArrayList<Pen> getAllThePens()
    {
        return allThePens;
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
//    public void displayAnimalsInZoo()
//    {
//       for(Pen thisPen : allThePens)
//       {
//           System.out.println(thisPen.getAllTheAnimals());
//           System.out.println(thisPen.getAllTheBabyAnimals());
//       }
//    }

//    public void selectAPen()
//    {
//        Scanner zooKeeper = new Scanner(System.in);
//
//        for(ArrayList thisPen : allThePens)
//        {
//            System.out.println();
//        }
//        System.out.print("Pens are listed above by name. Select pen by typing its name: ");
//        String selectedPen = zooKeeper.nextLine();
//        zooKeeper.nextLine();
//
//        if(selectedPen.equalsIgnoreCase())
//        {
//            return allThePens.();
//        }
//        else
//        {
//            System.out.println("Sorry, that's not a valid pen name.");
//        }
//    }
}
