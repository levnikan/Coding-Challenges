package telran.de;

import java.util.Arrays;

public class MinMaxValueChallenge {

    public static void main(String[] args) {
        int[] myArray = {23, 34, 33, 3, 5};
        System.out.println("This is my array" + Arrays.toString(myArray));
        System.out.println("Min value is " + findMin(myArray));
        System.out.println("Max value is " + findMax(myArray));
    }

    public static int findMin(int[] array) {
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }

    public static int findMax(int[] array) {
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }
}
