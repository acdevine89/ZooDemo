package com.example.zooDemo;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by anniedevine on 9/29/14.
 */
public class Zoo {

    ArrayList<Pen> allThePens = new ArrayList<Pen>();

    public static int mainMenu()
    {
        Scanner zooKeeper = new Scanner(System.in);
        int zooKeeperChoice;

        System.out.println("Hello Zookeeper! What would you like to do?");
        System.out.println("1 - Set up new pens");
        System.out.println("2 - Remove pens");
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
        return zooKeeperChoice;

        boolean quit = false;

        do {
            switch (zooKeeperChoice) {
                case 1:
                    System.out.println();
                    setUpPens(zooKeeper);
                    System.out.println();
                    break;
                case 2:
                    System.out.println();
                    removePens(zooKeeper);
                    System.out.println();
                    break;
                case 3:
                    System.out.println();
                    addAnimaltoPen(zooKeeper);
                    System.out.println();
                    break;
                case 4:
                    System.out.println();
                    addBabyAnimaltoPen(zooKeeper);
                    System.out.println();
                    break;
                case 5:
                    System.out.println();
                    removeAnimalsOrBabyAnimalsFromPen(zooKeeper);
                    System.out.println();
                    break;
                case 6:
                    System.out.println();
                    displayAnimalsInPen(zooKeeper);
                    System.out.println();
                    break;
                case 7:
                    System.out.println();
                    displayAnimalsInZoo(zooKeeper);
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
    }

    public void setUpPens(Scanner zooKeeper)
    {
        boolean quit = false;
        int zooKeeperChoice;

        System.out.println("Set up regular animal pen, or baby animal pen?");
        System.out.println("1 - Regular animal pen");
        System.out.println("2 - Baby animal pen");
        System.out.println("3 - I changed my mind... Go back to main menu");
        System.out.print("Enter menu selection by typing number here: ");
        //checkIfIntMainMenu(zooKeeperChoice);
        zooKeeperChoice = zooKeeper.nextInt();
        zooKeeper.nextLine();

        do {
            switch(zooKeeperChoice) {
                case 1:
                    System.out.println();
//                    System.out.print("New animal pen is being set up! Give it a name: ");
//                    String newPenName = zooKeeper.nextLine();
//                    zooKeeper.nextLine();
                    ArrayList<Pen> newAnimalPen = new ArrayList<Pen>();
                    allThePens.add(newAnimalPen);
                    System.out.println("New animal pen has been set up!");
                    System.out.println();
                case 2:
                    System.out.println();
                    ArrayList newBabyAnimalPen = new ArrayList<BabyAnimal>();
                    allThePens.add(newBabyAnimalPen);
                    System.out.println("New baby animal pen has been set up!");
                    System.out.println();
                case 3:
                    quit = true;
                    break;
                default:
                    System.out.println();
                    System.out.println("Invalid choice. Please enter 1, 2 or 3.");
                    System.out.println();
            }
        }while(!quit);
    }

    public void removePens(Scanner zooKeeper)
    {
        selectAPen();
        allThePens.remove();
    }

    public static void addAnimaltoPen(Scanner zooKeeper)
    {
        Scanner zooKeeper = new Scanner(System.in);
        Animal newAnimal;

        System.out.print("What is the animal's species? ");
        String animalSpecies = zooKeeper.nextLine();

        System.out.print("What is the animal's size? Type 1 for small, 2 for medium, 3 for large: ");
        int animalSize = zooKeeper.nextInt();

        System.out.print("What is the animal's gender? ");
        String animalGender = zooKeeper.nextLine();

        newAnimal = new Animal(animalSpecies, animalSize, animalGender);
        newAnimal.setSpecies(animalSpecies);
        newAnimal.setSize(animalSize);
        newAnimal.setGender(animalGender);

        System.out.println("Animal has been added to the pen!");

    }

    public static void addBabyAnimaltoPen(Scanner zooKeeper)
    {
        selectAPen();
        Scanner zooKeeper = new Scanner(System.in);
        BabyAnimal newBabyAnimal;

        System.out.print("What is the animal's species? ");
        String animalSpecies = zooKeeper.nextLine();

        System.out.print("What is the animal's size? Type 1 for small, 2 for medium, 3 for large: ");
        int animalSize = zooKeeper.nextInt();

        System.out.print("What is the animal's gender? ");
        String animalGender = zooKeeper.nextLine();

        System.out.println("Does the animal have siblings? Type 1 for yes, 2 for no: ");
        int siblingsOrNot = zooKeeper.nextInt();
        boolean hasSiblings;

        if(siblingsOrNot==1)
        {
            hasSiblings = true;
        }

        if(siblingsOrNot==2)
        {
            hasSiblings = false;
        }

        else
        {
            System.out.println("That's not a valid response.");
        }

        newBabyAnimal = new BabyAnimal(hasSiblings, animalSpecies, animalSize, animalGender);
        newBabyAnimal.setHasSiblings(hasSiblings);
        newBabyAnimal.setSpecies(animalSpecies);
        newBabyAnimal.setSize(animalSize);
        newBabyAnimal.setGender(animalGender);

        System.out.println("Animal has been added to the pen!");
    }

    public static void removeAnimalsOrBabyAnimalsFromPen(Scanner zooKeeper)
    {
        Scanner zooKeeper = new Scanner(System.in);

    }

    public static void displayAnimalsInPen(Scanner zooKeeper)
    {
        for(Pen thisPen : allThePens)
        {
            System.out.println(thisPen.getAllTheAnimals());
            System.out.println(thisPen.getAllTheBabyAnimals());
        }
    }

    public static void displayAnimalsInZoo(Scanner zooKeeper)
    {
       for(Pen thisPen : allThePens)
       {
           System.out.println(thisPen.getAllTheAnimals());
           System.out.println(thisPen.getAllTheBabyAnimals());
       }
    }

    public void selectAPen()
    {
        Scanner zooKeeper = new Scanner(System.in);

        for(ArrayList thisPen : allThePens)
        {
            System.out.println(thisPen.getPenName);
        }
        System.out.print("Pens are listed above by name. Select pen by typing its name: ");
        String selectedPen = zooKeeper.nextLine();
        zooKeeper.nextLine();

        if(selectedPen.equalsIgnoreCase(thisPen.getPenName))
        {
            return allThePens.thisPen.getPen();
        }
        else
        {
            System.out.println("Sorry, that's not a valid pen name.");
        }
    }
}
