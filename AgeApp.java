public class AgeApp {
    public static void main(String[] args) {
        
        int age = 45;

        if (age > 0 && age < 18) { 
            System.out.println("You are underage."); 
            
            if (age >= 15) System.out.println("You can drive a moped."); 
        } else if (age == 18) System.out.println("You can drive a car."); 
        else if (age >= 65) System.out.println("You are retired."); 
        else System.out.println("You are an adult.");

        if (age % 10 == 0) System.out.println("Anniversary Party!!");
        if (age == 100) {
            for (int i = 0; i < 3; i++) System.out.println("Congratulations!");
        }
        if (age > 40 && age < 50) System.out.println("Happy mid-life.");

    }   
}
