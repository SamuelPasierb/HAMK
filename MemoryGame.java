import java.util.Random;
import java.util.Scanner;
import java.util.ArrayList;

public class MemoryGame {
    public static void main(String[] args) {
        
        Random random = new Random();
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> arr = new ArrayList<>();
        ArrayList<Integer> guesses = new ArrayList<>();

        System.out.println("Try to remember the following numbers. The numbers will be shown for 4 seconds.");

        for (int i = 0; i < 7; i++) {
            arr.add(random.nextInt(1, 6));
            System.out.print(arr.get(i) + " ");
        }

        try {
            Thread.sleep(4000);
        } catch (Exception e) {}

        for (int i = 0; i < 20; i++) System.out.println();

        for (int i = 0; i < 7; i++) {
            System.out.println("Number " + (i + 1) + ":");
            guesses.add(Integer.parseInt(sc.nextLine()));
        }

        int score = 0;

        System.out.println("The numbers were: ");
        for (int i = 0; i < 7; i++) {
            System.out.print(arr.get(i) + " ");
        }

        System.out.println("\nYour numbers were: ");
        for (int i = 0; i < 7; i++) {
            if (guesses.get(i) == arr.get(i)) score++;
            System.out.print(guesses.get(i) + " ");
        }

        System.out.println("\nYou got " + score + " numbers right.\nThat's " + ((int) (score / 7.0d * 10000)) / 100d + "%");

    }
}
