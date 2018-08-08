package telran.de;

public class CodingProblems {
    public static final int THRESHOLD = 2;

    public static void main(String[] args) {
//        System.out.println(transform("Big bosS"));
//
//        System.out.println(factorial(4));
//
//        System.out.println(reverse("Nikolay"));
//
//        System.out.println(fibonacci(6));
//
//        System.out.println(isCircular("bbaba","ababb"));

        System.out.println(returnAbString(3, 8));
    }

    //This method changes the letters of the input string to upper/lowercase
    public static String transform(String input) {
        char[] array = input.toCharArray();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < array.length; i++) {
            if (Character.isLowerCase(array[i])) {
                array[i] = Character.toUpperCase(array[i]);
                sb.append(array[i]);
            } else {
                array[i] = Character.toLowerCase(array[i]);
                sb.append(array[i]);
            }
        }
        return sb.toString();
    }

    //This method calculates the factorial of the number
    public static int factorial(int number) {
        int result = 1;
        if (number == 0) {
            return 1;
        }
        if (number == 1) {
            return 1;
        }
        for (int i = 1; i <= number; i++) {
            result = result * i;
        }
        return result;

    }

    //This method reverses the order of characters of the input string
    public static String reverse(String word) {
        if (word.length() == 1) {
            return word;
        }
        return word.charAt(word.length() - 1) + reverse(word.substring(0, word.length() - 1));
    }

    //This method calculates fibonacci number
    public static int fibonacci(int n) {
        if (n == 0)
            return 0;
        else if (n == 1)
            return 1;
        else
            return fibonacci(n - 1) + fibonacci(n - 2);
    }

    //This method checks whether two strings are circular copies of each other
    public static boolean isCircular(String String1, String String2) {
        int length = String1.length();
        for (int i = 0; i < length; i++) {
            if (String1.equals(String2)) {
                return true;
            } else {
                String2 = String2.substring(length - 1) + String2.substring(0, length - 1);
            }
        }
        return false;
    }

    //This method returns a string consisting of given number of 'a' 'b' characters without repeating 3 times in a row
    public static String returnAbString(int a, int b) {
        String finalString = "";
        double biggerNumber = a;
        double smallerNumber = b;
        if (b > a) {
            biggerNumber = b;
            smallerNumber = a;
        }
        if ((biggerNumber / THRESHOLD - smallerNumber) > 1) {
            return "No result is possible with these parameters. Please reduce the difference between two numbers";
        }
        boolean start = false;
        int bTotalCounter = 0;
        int aTotalCounter = 0;

        if (b == biggerNumber) {
            for (int q = 0; (aTotalCounter < a) || (bTotalCounter < b); q++) {
                for (int i = 0; i < THRESHOLD && bTotalCounter < b; i++) {
                    finalString = finalString + "b";
                    bTotalCounter++;
                }
                for (int j = 0; j < 1 && aTotalCounter < a; j++) {
                    finalString = finalString + "a";
                    aTotalCounter++;
                }

            }
        } else {
            for (int q = 0; (aTotalCounter < a) || (bTotalCounter < b); q++) {
                for (int j = 0; j < THRESHOLD && aTotalCounter < a; j++) {
                    finalString = finalString + "a";
                    aTotalCounter++;
                }
                for (int i = 0; i < 1 && bTotalCounter < b; i++) {
                    finalString = finalString + "b";
                    bTotalCounter++;
                }

            }
        }

        return finalString;
    }


}
