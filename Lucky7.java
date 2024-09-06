import java.util.Random;
import java.util.Scanner;

public class Lucky7 {
    
    public static void main(String[] args) throws InterruptedException {
        
        Random random = new Random();
        Scanner sc = new Scanner(System.in);
        
        System.out.println("How much money would you like to spend?");
        int money = Integer.parseInt(sc.nextLine());

        int sevenCount;
        String[] numbers = new String[] {" ", " ", " "};

        while (money > 0) {

            money--;

            System.out.println("Starting the round...");
            System.out.println("===============================");
            System.out.println("|                             |");
            System.out.println("|     ---     ---     ---     |");
            System.out.println("|     |" + numbers[0] + "|     |" + numbers[1] + "|     |" + numbers[2] + "|     |");
            System.out.println("|     ---     ---     ---     |");
            System.out.println("|                             |");
            System.out.println("===============================");

            sevenCount = 0;

            for (int i = 0; i < 3; i++) {
                int number = random.nextInt(0, 10);
                if (number == 7) sevenCount++;
                numbers[i] = String.valueOf(number);

                for (int j = 0; j < 5; j++) System.out.println();
                System.out.println("===============================");
                System.out.println("|                             |");
                System.out.println("|     ---     ---     ---     |");
                System.out.println("|     |" + numbers[0] + "|     |" + numbers[1] + "|     |" + numbers[2] + "|     |");
                System.out.println("|     ---     ---     ---     |");
                System.out.println("|                             |");
                System.out.println("===============================");

                Thread.sleep(1000);

            }

            if (sevenCount == 1) {
                System.out.println("You won 3$");
                money += 3;
            } else if (sevenCount == 2) {
                System.out.println("You won 5$");
                money += 5;
            } else if (sevenCount == 3) {
                System.out.println("You won 10$");
                money += 10;
            }

            numbers = new String[] {" ", " ", " "};
            if (money <= 0) break;

            System.out.println("Money: " + money + "$\nWould you like to play again?");
            if (!sc.nextLine().toUpperCase().equals("Y")) break; 

        }

        if (money <= 0) System.out.println("You lost everything.");
        else System.out.println("You made " + money + "$");
        System.out.println("Thank you for playing.");
        sc.close();

    }

}
