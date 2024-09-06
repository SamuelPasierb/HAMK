import java.util.Random;
import java.util.Scanner;

public class GuessingGame {
    
    private static Random random = new Random();
    private static Scanner sc = new Scanner(System.in);
    private static String[] names = new String[] {"Marko", "David", "Tomas", "Lubo", "Pali", "Samo"};
    
    public static void main(String[] args) {
        
        String name = names[random.nextInt(0, names.length)];
        
        int tries = 1;

        System.out.println("Guess my name.");
        String guess = sc.nextLine();
        
        while (!name.equals(guess)) {
            
            System.out.println("Do you want to give up? (y/n)");
            
            if (sc.nextLine().toLowerCase().equals("y")) break;
            
            System.out.println("Guess my name. Here's a hint: " + name.substring(0, tries));
            guess = sc.nextLine();
            tries++;

        }

        if (name.equals(guess)) System.out.println("Congratulations!\nYou guessed in " + tries + " tries.");
        else System.out.println("The name was " + name + ". You gave up after " + tries + " tries.");
    }
}
