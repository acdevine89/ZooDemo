package com.example.zooDemo;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by anniedevine on 9/29/14.
 */
public class Zoo {

    List<Pen> allThePens = new ArrayList<Pen>();


    public int printMenuOptions()
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
    }

    public static void takeZooKeeperChoice(zooKeeperChoice)
    {
        boolean quit = false;

        do {
            printMenuOptions();
            switch (zooKeeperChoice) {
                case 1:
                    System.out.println();
                    setUpPens();
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

    public static void setUpPens()
    {
        boolean quit = false;
        Scanner zooKeeper = new Scanner(System.in);
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
                case 2:
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

    public static void removePens()
    {

    }

    public static void addAnimaltoPen()
    {

    }

    public static void addBabyAnimaltoPen()
    {

    }

    public static void removeAnimalsOrBabyAnimalsFromPen()
    {

    }

    public static void displayAnimalsInPen()
    {

    }

    public static void displayAnimalsInZoo()
    {

    }

}
