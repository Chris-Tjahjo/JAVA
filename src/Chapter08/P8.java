package Chapter08;

 

import java.util.Scanner;

 

/**

 * Adds a matrix and adds each row

 *

 * @author Chris Tjahjo

 */

public class P8 {

 

    /**

     * main method

     *

     * @param args command line argument

     */

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double[][] x = new double[3][4];

 

        System.out.println("Enter a 3-by-4 matrix row by row: ");

        for (int row = 0; row < x.length; row++) {

            for (int column = 0; column < x[row].length; column++) {

                x[row][column] = input.nextDouble();

            }

        }

 

        for (int column = 0; column < 4; column++) {

            System.out.println("Sum of the elements at column " + column + " is " + sumColumn(x, column));

        }

    }

 

    /**

     * sumColumn method

     *

     * @param m is how long the matrix is

     * @param columnIndex tells how tall the matrix is

     * @return sum of the rows

     */

    public static double sumColumn(double[][] m, int columnIndex) {

        double sum = 0.0;

        for (int row = 0; row < m.length; row++) {

            sum = sum + m[row][columnIndex];

        }

        return sum;

    }

}

