package telran.de;

import java.util.Arrays;

public class ReverseArrayChallenge {
    public static void main(String[] args) {
        int[] myArray = {1, 2, 3, 4, 5};
        System.out.println("Original array: " + Arrays.toString(myArray));
        System.out.println("Reversed array: " + Arrays.toString(reverseArray(myArray)));
    }

    public static int[] reverseArray(int[] array) {
        int[] newArr = Arrays.copyOf(array, array.length);
        for (int i = 0; i < newArr.length / 2; i++) {
            int temp = newArr[i];
            newArr[i] = array[array.length - i - 1];
            newArr[newArr.length - i - 1] = temp;
        }
        return newArr;
    }

//    // another, less effective method
//    public static int[] reverseArray2(int[] array) {
//        int[] newArr = Arrays.copyOf(array, array.length);
//        for (int i = 0; i < newArr.length; i++) {
//            newArr[i] = array[array.length - i - 1];
//        }
//        return newArr;
//    }
}
