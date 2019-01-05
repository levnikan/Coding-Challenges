package telran.de;

import java.util.Arrays;
import java.util.Scanner;

public class ArraySortProblem {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int[] myIntegers = getIntegers(5);
//        printArray(myIntegers);
        System.out.println(Arrays.toString(myIntegers));
        int[] myNewIntegers = descSortIntegers(myIntegers);
        System.out.println("My sorted array (in descending order)");
//        printArray(myNewIntegers);
        System.out.println(Arrays.toString(myNewIntegers));
        System.out.println("My sorted array (in ascending order)");
        int[] myNewIntegers1 = ascSortIntegers(myIntegers);
        System.out.println(Arrays.toString(myNewIntegers1));

    }

    // Read integers from the console
    public static int[] getIntegers(int number) {
        System.out.println("Enter " + number + " integer values.\r");
        int[] values = new int[number];
        for (int i = 0; i < values.length; i++) {
            values[i] = scanner.nextInt();
        }
        return values;
    }

    // print array loop
    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    // sort array of integers in descending order
    public static int[] descSortIntegers(int[] array) {
        int[] newArr = new int[array.length];

        for (int i = 0; i < array.length; i++) {
            newArr[i] = array[i];
        }
//        int[] newArr1 =  Arrays.copyOf(array, array.length); // alternative copy

        boolean flag = true;
        int tempValue;

        while (flag) {
            flag = false;

            for (int i = 0; i < newArr.length - 1; i++) {
                if (newArr[i] < newArr[i + 1]) {
                    tempValue = newArr[i];
                    newArr[i] = newArr[i + 1];
                    newArr[i + 1] = tempValue;
                    flag = true;
                }
            }
        }
        return newArr;
    }

    //         //alternative (less effective sort)
//        int tmp;
//        for (int j = 0; j < array.length; j++) {
//            for (int i = 1; i < array.length; i++) {
//                if (array[i] > array[i - 1]) {
//                    tmp = array[i - 1];
//                    array[i - 1] = array[i];
//                    array[i] = tmp;
//                }
//            }
//        }
//        return array;
    public static int[] ascSortIntegers(int[] array) {
        int[] newArr = Arrays.copyOf(array, array.length);

        boolean flag = true;
        int tempValue;

        while (flag) {
            flag = false;

            for (int i = 0; i < newArr.length - 1; i++) {
                if (newArr[i] > newArr[i + 1]) {
                    tempValue = newArr[i];
                    newArr[i] = newArr[i + 1];
                    newArr[i + 1] = tempValue;
                    flag = true;
                }
            }
        }
        return newArr;
    }

}
