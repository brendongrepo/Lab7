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
 * @version v1.1
 * @since 11/9/2025
 */
public class ArrayMethods {
    //instance field
    private int[] myArray = {7, 8, 8, 3, 4, 9, 8, 7};

    /**
     * Default constructor that initializes the array used for all method
     * operations in this class. The values are preset.
     */
    public ArrayMethods(){
    }
    //methods
    /**
     * Counts how many elements are in myArray using an enhanced for loop.
     * @return the number of elements in the array
     */
    public int count() {
        int elementCount = 0;
        for (int ignoredElement : myArray) {
            elementCount++;
        }
        return elementCount;
    }

    /**
     * Sums all elements in myArray.
     * @return the sum of the array elements
     */
    public int sum() {
        int runningSum = 0;
        for (int value : myArray) {
            runningSum += value;
        }
        return runningSum;
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
        int maxValue = myArray[0];
        for (int value : myArray) {
            if (value > maxValue) {
                maxValue = value;
            }
        }
        return maxValue;
    }

    /**
     * Finds the index of the largest value in myArray.
     * If multiple equal maxima exist, returns the left-most index.
     * @return the index of the maximum value
     */
    public int findIndexOfMax() {
        int maxIndex = 0;
        for (int index = 1; index < myArray.length; index++) {
            if (myArray[index] > myArray[maxIndex]) {
                maxIndex = index;
            }
        }
        return maxIndex;
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
