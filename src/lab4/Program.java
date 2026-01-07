package lab4;

public class Program {
    static void main(String[] args) {
        int[] numbers = {1, 3, -5, 7, 0, 4, 6, 8};
        System.out.println("Array is: " + numbers);

        // task 1 - Sum of every Numbers

        int sum = 0;

        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        System.out.println("Sum = " + sum);

        int average = (sum / numbers.length);
        System.out.println("Average = " + average);

        int lowest = numbers[0];

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < lowest) {
                lowest = numbers[i];
            }

        }
        System.out.println("Lowest Number is " + lowest);
        int highest = numbers[0];

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > highest) {
                highest = numbers[i];
            }

        }
        System.out.println("The highest number is " + highest);

        for (int i = 0; i < numbers.length ; i++){
            if (numbers[i] == 0){
                System.out.println("Position of 0 is: " + +i);

            }
        }
    }
}

