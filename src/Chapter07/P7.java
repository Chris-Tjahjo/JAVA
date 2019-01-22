package Chapter07;

import java.util.*;
import java.util.Scanner;

/**
 * Creates a array and averages the numbers
 *
 * @author Alan Kelly
 */

public class P7 {

    /**
     * Main method
     *
     * @param args
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        // Create the array
        System.out.print("How many numbers will be read: ");
        int amount = input.nextInt();
        ArrayList<Integer> numbers = new ArrayList<>(amount);

        fillArray(numbers, input, amount);
        System.out.println("The average is " + average(numbers));
        displayArray(numbers);
    }

    /**
     * fills the array with the entered numbers
     *
     * @param numbers is the array
     * @param input the input for the array
     * @param amount the amount of integers in the arraylist
     */
    public static void fillArray(ArrayList<Integer> numbers, Scanner input, int amount) {
        System.out.print("Enter " + amount + " elements: ");
        for (int i = 0; i < amount; i++) {
            numbers.add(i, input.nextInt());
        }
    }

    /**
     * creates the average for the array
     *
     * @param numbers the array
     * @return returns the average
     */
    public static double average(ArrayList<Integer> numbers) {
        double sum = 0;

        for (int i = 0; i < numbers.size(); i++) {
            sum = sum + numbers.get(i);
        }

        return sum / numbers.size();
    }

    /**
     * displays the whole array
     *
     * @param numbers the array
     */
    public static void displayArray(ArrayList<Integer> numbers) {
        System.out.println("The contents of the array: " + numbers);
    }
}
