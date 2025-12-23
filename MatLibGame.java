package miniprojects;

import java.util.Scanner;

/**A Mad Lib is a game where the program asks for words like
        nouns, verbs, adjectives, etc., and then inserts
 them into a funny story.*/

public class MatLibGame {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Name: ");
        String name = input.next();
        System.out.print("Enter Place: ");
        String place = input.next();
        input.nextLine();
        System.out.print("Enter adjective(Description):");
        String adjective = input.nextLine();
        System.out.print("Enter Animal: ");
        String animal = input.next();
        System.out.print("Enter any verb with -ing:");
        String verb = input.next();

        System.out.println("\n Funny Story:");
        System.out.println("One day, " + name + " went to " + place + ".");
        System.out.println("It was a " + adjective + " day.");
        System.out.println("Suddenly, a " + animal + " appeared and " + verb + " with " + name + "!");
        System.out.println("It was a memory to remember!");

        input.close();
    }
}
