package com.example.madlibs;

import java.util.Scanner;

public class Easter {
    public static void main(String[] args) {
        // Prompts the user for the correct parts of speech
        Scanner keyboardInput = new Scanner(System.in);

        System.out.print("Please enter a verb: ");
        String verb1 = keyboardInput.nextLine();
        System.out.print("Please enter another verb: ");
        String verb2 = keyboardInput.nextLine();
        System.out.print("Please enter a noun: ");
        String noun1 = keyboardInput.nextLine();
        System.out.print("Please enter another noun: ");
        String noun2 = keyboardInput.nextLine();
        System.out.print("Please enter an adjective: ");
        String adjective1 = keyboardInput.nextLine();
        System.out.print("Please enter a plural noun: ");
        String pluralNoun1 = keyboardInput.nextLine();
        System.out.print("Please enter another verb: ");
        String verb3 = keyboardInput.nextLine();
        System.out.print("Please enter another adjective: ");
        String adjective2 = keyboardInput.nextLine();
        System.out.print("Please enter a group of people: ");
        String people = keyboardInput.nextLine();
        System.out.print("Please enter another adjective: ");
        String adjective3 = keyboardInput.nextLine();
        System.out.println();

        // Returns the appropriate madlib with the words the user picked.
        System.out.printf("""
        This Easter, prepare to celebrate! We have a very special guest coming to town, the Easter Bunny! The Easter Bunny’s job is to %s across the globe and %s joy and holiday to all. He will leave you with a %s full of little candy %s capsules with %s treats inside, and maybe even some jelly %s! However, it’s important not to %s the most %s feature of Easter, spending time with %s and loved ones. To help you along, the Easter Bunny sometimes hides a bunch of treat eggs for you and your friends and family to dig up and find. If you find one, you can expect something a little extra %s!
        """, verb1, verb2, noun1, noun2, adjective1, pluralNoun1, verb3, adjective2, people, adjective3);
    }
}