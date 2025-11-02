import java.util.Arrays;

/**
 * ArrayMethods:
 *  1) Counts how many elements are stored in the array.
 *  2) Calculates the sum of all values in the array.
 *  3) Computes and returns the average of the array's values.
 *  4) Determines the largest (maximum) element in the array.
 *  5) Determines the index of the largest (maximum) element in the array.
 *  6) Prints an integer array in a formatted style.
 *
 * @author Brendon Grepo, bgrepo@student.sdccd.edu
 * @version v1.0
 * @since 11/1/2025
 */
public class ArrayMethods {
    //instance field
    private int[] myArray = {7, 8, 8, 3, 4, 9, 8, 7};

    //methods
    /**
     * Counts how many elements are in myArray using an enhanced for loop.
     * @return the number of elements in the array
     */
    public int count() {
        int cnt = 0;
        for (int ignored : myArray) {
            cnt++;
        }
        return cnt;
    }

    /**
     * Sums all elements in myArray.
     * @return the sum of the array elements
     */
    public int sum() {
        int s = 0;
        for (int v : myArray) {
            s += v;
        }
        return s;
    }

    /**
     * Computes the average of myArray.
     * @return the average as a double
     */
    public double average() {
        return (double) sum() / count();
    }

    /**
     * Finds the largest value in myArray.
     * @return the maximum value
     */
    public int findMax() {
        int max = myArray[0];
        for (int v : myArray) {
            if (v > max) max = v;
        }
        return max;
    }

    /**
     * Finds the index of the largest value in myArray.
     * If multiple equal maxima exist, returns the left-most index.
     * @return the index of the maximum value
     */
    public int findIndexOfMax() {
        int idx = 0;
        for (int i = 1; i < myArray.length; i++) {
            if (myArray[i] > myArray[idx]) idx = i;
        }
        return idx;
    }

    /**
    prints an int array, nicely formatted
    @param inArray int array to print
     */
    public void print(int[ ] inArray)
    {
        System.out.print("{");
        int i;
        // print elements before the last, separated by commas
        for (i = 0; i < inArray.length - 1; i++)
            System.out.print(inArray[i] + ", ");
        // print last element. Careful here to handle length 0
        if (inArray.length > 0)
            System.out.print(inArray[i]);
        System.out.println("}");
    }
}
