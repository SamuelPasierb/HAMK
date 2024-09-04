public class Main {
    
    public static void main(String[] args) {

        String creator = "Samuel";

        int number1 = 5;
        int number2 = 13;

        int addition = number1 + number2;
        int subtraction = number1 - number2;
        int multiplication = number1 * number2;
        double division = (double) number1 / number2;

        System.out.println("Printer App");
        System.out.print("This app is made by: ");
        System.out.println(creator);
        
        // Number values
        System.out.println("The value of number1 is " + number1);
        System.out.println("The value of number2 is " + number2);

        System.out.println(number1 + " + " + number2 + " = " + addition);
        System.out.println(number1 + " - " + number2 + " = " + subtraction);
        System.out.println(number1 + " * " + number2 + " = " + multiplication);
        System.out.println(number1 + " / " + number2 + " = " + division);

    }

}   