package com.example.madlibs;

import java.util.Scanner;

public class Thanksgiving {
    public static void main(String[] args) {
        //prompts the user for the correct parts of speech

        Scanner keyboardInput = new Scanner(System.in);
        System.out.print("Please enter a noun: ");
        String n1 = keyboardInput.nextLine();
        System.out.print("Please enter an adjective: ");
        String a2 = keyboardInput.nextLine();
        System.out.print("Please enter a verb: ");
        String v1 = keyboardInput.nextLine();
        System.out.print("Please enter an adjective: ");
        String a3 = keyboardInput.nextLine();
        System.out.print("Please enter an adjective: ");
        String a4 = keyboardInput.nextLine();
        System.out.print("Please enter a verb: ");
        String v2 = keyboardInput.nextLine();
        System.out.print("Please enter a noun: ");
        String n3 = keyboardInput.nextLine();
        System.out.print("Please enter an adjective: ");
        String a5 = keyboardInput.nextLine();
        System.out.print("Please enter a verb: ");
        String v3 = keyboardInput.nextLine();
        System.out.print("Please enter an adjective: ");
        String a6 = keyboardInput.nextLine();
        System.out.println();

        //Returns the appropriate madlib with the words the user picked.
        System.out.printf("""
        This Thanksgiving, my family and I gathered around the table, excited for the big meal.
        We started with a plate of %s, but it tasted a little %s. My Aunt tried to %s it to make it better,
        but that only made it more %s! When the turkey came out, it looked %s, and everyone was eager to
        %s it. But once we took a bite, we realized it tasted like %s! For dessert, Aunt Sally brought
        out a %s pie that no one could %s. By the end of the night, we were all too %s to do anything
        except laugh about our Thanksgiving surprise!""", n1, a2, v1, a3, a4, v2, n3, a5, v3, a6);
    }
}