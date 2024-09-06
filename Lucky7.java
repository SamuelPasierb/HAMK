import java.util.Random;
import java.util.Scanner;

public class Lucky7 {
    
    // Objects
    private static Random random = new Random();
    private static Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) throws InterruptedException {
        
        
        // Variables
        String[] numbers = new String[] {" ", " ", " "};
        int sevenCount;
        int[] winnings = new int[] {0, 3, 5, 10};
        
        // Money bet
        System.out.println("How much money would you like to spend?");
        int money = Integer.parseInt(sc.nextLine());
        
        // Main loop
        while (money > 0) {

            // Pay for the game
            money--;

            // Main screen
            System.out.println("Starting the round...");
            System.out.println("===============================");
            System.out.println("|                             |");
            System.out.println("|     ---     ---     ---     |");
            System.out.println("|     |" + numbers[0] + "|     |" + numbers[1] + "|     |" + numbers[2] + "|     |");
            System.out.println("|     ---     ---     ---     |");
            System.out.println("|                             |");
            System.out.println("===============================");

            // Counter for sevens
            sevenCount = 0;

            // 3 numbers
            for (int i = 0; i < 3; i++) {
                int number = random.nextInt(0, 10);
                numbers[i] = String.valueOf(number);
                if (number == 7) sevenCount++; // 7

                // Clean screen
                for (int j = 0; j < 5; j++) System.out.println();
                
                // Show next number
                System.out.println("===============================");
                System.out.println("|                             |");
                System.out.println("|     ---     ---     ---     |");
                System.out.println("|     |" + numbers[0] + "|     |" + numbers[1] + "|     |" + numbers[2] + "|     |");
                System.out.println("|     ---     ---     ---     |");
                System.out.println("|                             |");
                System.out.println("===============================");

                // Sleep for 1 second so user has time to see the outcome
                Thread.sleep(1000);

            }

            // Let user know the final outcome
            System.out.println("You won " + winnings[sevenCount] + "$");
            money += winnings[sevenCount];

            // Reset
            numbers = new String[] {" ", " ", " "};
            
            // Doesn't have any money -> End game
            if (money <= 0) break;

            // Ask if the user wants to continue
            System.out.println("Money: " + money + "$\nWould you like to play again?");
            if (!sc.nextLine().toUpperCase().equals("Y")) break; 

        }

        // Final message
        if (money <= 0) System.out.println("You lost everything.");
        else System.out.println("You made " + money + "$");
        System.out.println("Thank you for playing.");
        sc.close();

    }

}
