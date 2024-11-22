package com.example.madlibs;

import java.util.Scanner;

public class Fourth {

    public static void main(String[] args)
    {
        Scanner keyboardInput = new Scanner(System.in);

        // 10 blanks

        System.out.println("Enter an adjective: ");
        String adj1 = keyboardInput.nextLine();
        System.out.println("Enter an adjective: ");
        String adj2 = keyboardInput.nextLine();
        System.out.println("Enter an noun: ");
        String noun1 = keyboardInput.nextLine();
        System.out.println("Enter an adjective (try a number!): ");
        String adj3 = keyboardInput.nextLine();
        System.out.println("Enter a noun: ");
        String noun2 = keyboardInput.nextLine();
        System.out.println("Enter an noun: ");
        String noun3 = keyboardInput.nextLine();
        System.out.println("Enter a verb: ");
        String verb1 = keyboardInput.nextLine();
        System.out.println("Enter a noun (maybe a color?): ");
        String noun4 = keyboardInput.nextLine();
        System.out.println("Enter a noun (animal): ");
        String noun5 = keyboardInput.nextLine();
        System.out.println("Enter an adjective: ");
        String adj4 = keyboardInput.nextLine();


        System.out.println("On the " + adj1 + " morning of the 4th of July, we decided to throw the " + adj2 + " party of the century . We packed a " + noun1 + " and " + adj3 + " hot dogs. " +
                " As we arrived at the park, we realized we had forgotten to bring a " + noun2 + " so we had to improvise with a " + noun3 + " Everyone started " + verb1 + " and  " + verb1 + " and before long, the sky turned " + noun4 + " with fireworks. Suddenly, a " + noun5 + " ran by and scared everyone, causing a panic. People were running in all directions, while someone yelled, get the " + noun5 + "! By the end of the night, we were all feeling " + adj4 + " but happy we survived the most " + adj1 + " 4th of July ever!");
        keyboardInput.close();
    }
}
