package com.example.zooDemo;
import java.util.Scanner;

/**
 * Created by anniedevine on 9/29/14.
 */
public class ZooDemo {

   private static Zoo theZoo = new Zoo();

    public static void main(String[] args) {

        mainMenu();

    }

    public static int mainMenu()
    {
        Scanner zooKeeper = new Scanner(System.in);
        int zooKeeperChoice;

        boolean quit = false;

        do {

            System.out.println("Hello Zookeeper! What would you like to do?");
            System.out.println("1 - Add new pen");
            System.out.println("2 - Remove pen");
            System.out.println("3 - Add an animal to a pen");
            System.out.println("4 - Add a baby animal to a pen");
            System.out.println("5 - Remove animals or baby animals from a pen");
            System.out.println("6 - Display all the animals in a pen");
            System.out.println("7 - Display all the animals in the zoo");
            System.out.println("8 - Leave the zoo. Zookeeping is not for me...");
            System.out.print("Enter menu selection by typing number here: ");
            //checkIfIntMainMenu(zooKeeperChoice);
            zooKeeperChoice = zooKeeper.nextInt();
            zooKeeper.nextLine();

            switch (zooKeeperChoice) {
                case 1:
                    System.out.println();
                    theZoo.addPen();
                    System.out.println("Pen has been added!");
                    System.out.println();
                    break;
                case 2:
                    System.out.println();
                    removePen();
                    System.out.println();
                    break;
                case 3:
                    System.out.println();
                    addAnimaltoPen();
                    System.out.println();
                    break;
//                case 4:
//                    System.out.println();
//                    theZoo.addBabyAnimaltoPen();
//                    System.out.println();
//                    break;
//                case 5:
//                    System.out.println();
//                    theZoo.removeAnimalsOrBabyAnimalsFromPen();
//                    System.out.println();
//                    break;
                case 6:
                    System.out.println();
                    System.out.println(theZoo.display());
                    System.out.println();
                    break;
//                case 7:
//                    System.out.println();
//                    theZoo.displayAnimalsInZoo();
//                    System.out.println();
//                    break;
                case 8:
                    quit = true;
                    break;
                default:
                    System.out.println();
                    System.out.println("Invalid choice. Please enter a number 1 through 8.");
                    System.out.println();
            }

        } while(!quit);

        System.out.println();
        System.out.println("Goodbye!");
        return 0;
    }

    public static int selectAPen()
    {
        int i = 1;
        for(Pen thisPen : theZoo.getAllThePens())
        {
            System.out.println((i) + ": " + thisPen.display());
            ++i;
        }

        Scanner zooKeeper = new Scanner(System.in);
        System.out.print("Which pen would you like to use? Type the number here: ");
        int zooKeeperChoice = zooKeeper.nextInt();
        return zooKeeperChoice-1;
    }

    public static void removePen()
    {
        theZoo.getAllThePens().remove(selectAPen());
        System.out.println("Pen removed.");
    }


    public static void addAnimaltoPen()
    {
        if(theZoo.getAllThePens().size()<=0)
        {
            System.out.println("Sorry, no pens. Must add pen first");
            return;
        }

        int i = selectAPen();

        if(i<0)
        {
            System.out.println("Invalid selection.");
        }

        Pen thisPen = theZoo.getAllThePens().get(i);

        Scanner zooKeeper = new Scanner(System.in);

        System.out.print("What is the animal's species? ");
        String animalSpecies = zooKeeper.nextLine();

        System.out.print("What is the animal's size? Type 1 for small, 2 for medium, 3 for large: ");
        int animalSize = zooKeeper.nextInt();

        System.out.print("What is the animal's gender? ");
        String animalGender = zooKeeper.nextLine();

        thisPen.getAllTheAnimals().add(new Animal(animalSpecies, animalSize, animalGender));

        System.out.println("Animal has been added to the pen!");
    }

//    public static void addBabyAnimaltoPen()
//    {
//        Scanner zooKeeper = new Scanner(System.in);
//        BabyAnimal newBabyAnimal;
//
//        System.out.print("What is the animal's species? ");
//        String animalSpecies = zooKeeper.nextLine();
//
//        System.out.print("What is the animal's size? Type 1 for small, 2 for medium, 3 for large: ");
//        int animalSize = zooKeeper.nextInt();
//
//        System.out.print("What is the animal's gender? ");
//        String animalGender = zooKeeper.nextLine();
//
//        System.out.println("Does the animal have siblings? Type 1 for yes, 2 for no: ");
//        int siblingsOrNot = zooKeeper.nextInt();
//        boolean hasSiblings;
//
//        if(siblingsOrNot==1)
//        {
//            hasSiblings = true;
//        }
//
//        if(siblingsOrNot==2)
//        {
//            hasSiblings = false;
//        }
//
//        else
//        {
//            System.out.println("That's not a valid response.");
//        }
//
//        newBabyAnimal = new BabyAnimal(hasSiblings, animalSpecies, animalSize, animalGender);
//        newBabyAnimal.setHasSiblings(hasSiblings);
//        newBabyAnimal.setSpecies(animalSpecies);
//        newBabyAnimal.setSize(animalSize);
//        newBabyAnimal.setGender(animalGender);
//
//        System.out.println("Animal has been added to the pen!");
//    }
//
//    public static void removeAnimalsOrBabyAnimalsFromPen()
//    {
//        Scanner zooKeeper = new Scanner(System.in);
//
//    }

//    public static void displayAnimalsInZoo()
//    {
//        for(Pen thisPen : allThePens)
//        {
//            System.out.println(thisPen.getAllTheAnimals());
//            System.out.println(thisPen.getAllTheBabyAnimals());
//        }
//    }
}
