package lab3;
import java.util.Scanner;

public class Program{

static void main(String[] args) {
//    theLunchQueue("Welcome to the Lunch queue");
//    getInt("Enter a number");
//    getString("Enter a string");
//    convertInputToStonesPounds(0);
    convertKgsToStonesPounds(0);
}
    public static int getInt(String prompt){
        System.out.println(prompt);
        Scanner s = new Scanner(System.in);
        return s.nextInt();
    }

    public static String getString(String prompt){
        System.out.println(prompt);
        Scanner s = new Scanner(System.in);
        return s.nextLine();
    }


    // Part 2
    public static String theLunchQueue(String prompt){
        String mainCourse = getString("What main dish would you like: Chicken, Fish or Vegetarian?");
        int roastPotatoes = getInt("How many roast potatoes would you like?");
        int brusselSprouts = getInt("How many Brussel Sprouts would you like?");
        String bill = ("Hello, your lunch is " + mainCourse + " with " + roastPotatoes + " roast potatoes and " + brusselSprouts + " Brussel sprouts.");
        return bill;

    }


    //Part 3
    static void convertInputToStonesPounds(int pounds){
        int weightPounds = getInt("What is the weight, in pounds?");
        int weightStone = (weightPounds/14);
        int remainingPounds = (weightPounds % 14);
        System.out.println("Your weight is " + weightStone + " Stone and " + remainingPounds + " lbs.");
        return;
    }

    static void convertKgsToStonesPounds(int kg){
        int weightKg = getInt("What is your weight in kilograms?");
        double convertPounds = (weightKg * 2.20462);
        double weightStone = (convertPounds/14);
        double weightPounds = (convertPounds % 14);
        System.out.println("Your weight is " + weightStone + " Stone and " + weightPounds + " lbs.");
        return;
    }

}
