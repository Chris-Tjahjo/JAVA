package Chapter07;

import java.util.Scanner;

/**
 * Prints grade number and letter for x number of students
 *
 * @author Shane Faulk
 */
public class C7_1 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of students:");
        /* Asking how many students */
        int stuNum = input.nextInt();
        int[] grades = new int[stuNum];
        double highest = 0;
        String letter;

        System.out.print("Enter " + stuNum + " scores:");
        /* Asking for the scores */
        for (int moist = 0; moist < grades.length; moist++) {
            grades[moist] = input.nextInt();/* Finding the highest score*/
            if (grades[moist] > highest) {
                highest = grades[moist];
            }

        }

        for (int counter = 0; counter < grades.length; counter++) {/* Printing the grades*/
            if (grades[counter] >= highest - 10) {
                letter = "A";
            } else if (grades[counter] >= highest - 20) {
                letter = "B";
            } else if (grades[counter] >= highest - 30) {
                letter = "C";
            } else if (grades[counter] >= highest - 40) {
                letter = "D";
            } else {
                letter = "F";
            }

            System.out.printf("Student %d score is %d and grade is %s \n", counter, grades[counter], letter);
        }

    }
}
