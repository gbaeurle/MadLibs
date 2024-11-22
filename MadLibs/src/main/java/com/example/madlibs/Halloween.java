package com.example.madlibs;

import java.util.Scanner;

public class Halloween{

    public static void main(String[] args){
        Scanner keyboardInput = new Scanner(System.in);


        //blanks (10)

        System.out.println("Enter a noun (PERSON, PLACE, OR THING): ");
        String noun = keyboardInput.nextLine();
        System.out.println("Enter an adjective: ");
        String adj  = keyboardInput.nextLine();
        System.out.println("Enter a creature (ex: GHOUL, UNICORN, MONSTER): ");
        String creature = keyboardInput.nextLine();
        System.out.println("Enter a verb ending in -s: ");
        String sVerb = keyboardInput.nextLine();
        System.out.println("Enter a plural noun: ");
        String pNoun = keyboardInput.nextLine();
        System.out.println("Enter an adjective: ");
        String adj2 = keyboardInput.nextLine();
        System.out.println("Enter an animal: ");
        String animal = keyboardInput.nextLine();
        System.out.println("Enter an object: ");
        String object = keyboardInput.nextLine();;
        System.out.println("Enter an exclamation (ex: AH, WOW, BOO): ");
        String exc = keyboardInput.nextLine();
        System.out.println("Enter an adjective: ");
        String adj3 = keyboardInput.nextLine();


        System.out.println("This Halloween might have been the spookiest yet! I dressed up as a(n) " + noun +  " and went to a Halloween party. At the party, someone told us a creepy story about a(n) " + adj + " " + creature +  " that " +sVerb+ "  (at) anyone who dares enter its territory.\n" +
                "As we walked home, we could hear " + pNoun+ " moving in the darkness. Suddenly, a " +adj2 + " " + animal + " jumped out from behind a(n) " + object+ ", making us scream, " +exc + "!\"\n" +
                "We sprinted all the way home and swore never to go near that " +adj3+  " place again!\n");
        keyboardInput.close();


    }

}