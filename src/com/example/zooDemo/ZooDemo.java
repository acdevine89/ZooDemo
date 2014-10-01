package com.example.zooDemo;
import java.util.Scanner;

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
                    addAnimalToPen();
                    System.out.println();
                    break;
                case 4:
                    System.out.println();
                    addBabyAnimalToPen();
                    System.out.println();
                    break;
                case 5:
                    System.out.println();
                    removeAnimalsOrBabyAnimalsFromPen();
                    System.out.println();
                    break;
                case 6:
                    System.out.println();
                    //System.out.println(theZoo.display());
                    System.out.println();
                    break;
                case 7:
                    System.out.println();
                    System.out.println(theZoo.display());
                    System.out.println();
                    break;
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

    public static Pen selectAPen()
    {
        if (theZoo.getAllThePens().size() <= 0)
        {
            System.out.println("Sorry, no pens. Must add pen first");
            return null;
        }

        int i = 1;
        for(Pen thisPen : theZoo.getAllThePens())
        {
            System.out.println("Pen " + (i) + ": " + thisPen.display());
            ++i;
        }

        Scanner zooKeeper = new Scanner(System.in);
        System.out.print("Which pen would you like to use? Type the number here: ");
        int zooKeeperChoice = zooKeeper.nextInt();

        if(zooKeeperChoice<1 || zooKeeperChoice>theZoo.getAllThePens().size())
        {
            System.out.println("Invalid selection.");
            return null;
        }

        return theZoo.getAllThePens().get(zooKeeperChoice-1);
    }


    public static void removePen()
    {
        theZoo.getAllThePens().remove(selectAPen());
        System.out.println("Pen removed.");
    }


    public static void getAnimalInfo(Animal thisAnimal)
    {
        Scanner zooKeeper = new Scanner(System.in);

        System.out.print("What is the animal's species? ");
        thisAnimal.setSpecies(zooKeeper.nextLine());

        System.out.print("What is the animal's size? Type 1 for small, 2 for medium, 3 for large: ");
        thisAnimal.setSize(zooKeeper.nextInt());

        System.out.print("What is the animal's gender? ");
        thisAnimal.setGender(zooKeeper.nextLine());
        zooKeeper.nextLine();
    }

    public static void addAnimalToPen()
    {
        Pen thePen = selectAPen();
        if(thePen==null)
        {
            return;
        }
        Animal thisAnimal = new Animal();
        getAnimalInfo(thisAnimal);

        thePen.getAllTheAnimals().add(thisAnimal);
        System.out.println("Animal has been added to the pen!");
    }

    public static void addBabyAnimalToPen()
    {
        Scanner zooKeeper = new Scanner(System.in);

        Pen thePen = selectAPen();
        if(thePen==null)
        {
            return;
        }
        BabyAnimal thisAnimal = new BabyAnimal();
        getAnimalInfo(thisAnimal);

        thePen.getAllTheBabyAnimals().add(thisAnimal);

        System.out.println("Does the animal have siblings? Type 1 for yes, 2 for no: ");
        int siblingsOrNot = zooKeeper.nextInt();

        boolean hasSiblings;

        if(siblingsOrNot==1)
        {
            hasSiblings = true;
        }

        else if(siblingsOrNot==2)
        {
            hasSiblings = false;
        }

        else
        {
            System.out.println("That's not a valid response.");
            return;
        }

        thisAnimal.setHasSiblings(hasSiblings);

        thePen.getAllTheBabyAnimals().add(thisAnimal);

        System.out.println("Animal has been added to the pen!");
    }

    public static void removeAnimalsOrBabyAnimalsFromPen()
    {
        Pen thePen = selectAPen();
        if(thePen==null)
        {
            return;
        }
        Animal thisAnimal = new Animal();
        getAnimalInfo(thisAnimal);

        thePen.getAllTheAnimals().remove(thisAnimal);
        System.out.println("Animal has been added to the pen!");

    }

//    public static void displayAnimalsInZoo()
//    {
//        for(Pen thisPen : allThePens)
//        {
//            System.out.println(thisPen.getAllTheAnimals());
//            System.out.println(thisPen.getAllTheBabyAnimals());
//        }
//    }
}
