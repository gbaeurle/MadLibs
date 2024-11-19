import java.util.Scanner;

public class Christmas{

    public static void main(String[] args)
    {
        Scanner keyboardInput = new Scanner(System.in);
// 10 blanks
// UI input replaces scanner
// scanner for testing
        System.out.println("Enter a past tense verb: ");
        String ptverb = keyboardInput.nextLine();
        System.out.println("Enter a plural noun: ");
        String pnoun = keyboardInput.nextLine();
        System.out.println("Enter an adjective: ");
        String adjective = keyboardInput.nextLine();
        System.out.println("Enter a noun: ");
        String noun = keyboardInput.nextLine();
        System.out.println("Enter a name: ");
        String name = keyboardInput.nextLine();
        System.out.println("Enter an adjective: ");
        String adj = keyboardInput.nextLine();
        System.out.println("Enter an adjective: ");
        String adj2 = keyboardInput.nextLine();
        System.out.println("Enter a song: ");
        String song = keyboardInput.nextLine();
        System.out.println("Enter a food: ");
        String food = keyboardInput.nextLine();
        System.out.println("Enter a number: ");
        int num = keyboardInput.nextInt();


        System.out.println("It was Christmas morning when I, "+ ptverb + " into the family room." + " My family was already there to open " + pnoun + ". I couldn't help but notice a " + adjective + " " + noun + " sitting in the middle of the room. " + 
        name + " looked " + adj + ". My family is " + adj2 + ", so we always sing " + song + " before opening " + pnoun + ". It is always a good time with my family. " + name + " revealed that the " + noun + " was actually made out of " + food + "! Everyone loved it so much, we ate the whole thing in " + num + " hours. Best Christmas ever!");
        keyboardInput.close();
    }
}