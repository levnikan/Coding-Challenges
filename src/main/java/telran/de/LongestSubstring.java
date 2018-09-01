package telran.de;

public class LongestSubstring {
    public static void main(String[] args) {
        System.out.println(longestSubstring("aavvvBBBBBBkksnnnnn"));
        System.out.println(longestSubstring("aavvvBBBBBBkksnnnnn").length());
        System.out.println(sizeOflongestSubstring("aavvvBBBBBBkksnnnnn"));
    }

    public static String longestSubstring(String s) {
        int max = 0;
        int counter;
        String longSubstring;
        String longestSubstring = "";
        String[] splittedString = s.split("");
        for (int i = 0; i < splittedString.length; i++) {
            String first = splittedString[i];
            counter = 0;
            longSubstring = "";
            for (int j = 0; j < splittedString.length; j++) {
                if (splittedString[j].equals(first)) {
                    counter++;
                    longSubstring += splittedString[j];
                    if (counter >= max) {
                        max = counter;
                        longestSubstring = longSubstring;
                    }
                }
            }
        }
        return longestSubstring;
    }

    public static int sizeOflongestSubstring(String s) {
        int max = 0;
        int counter;
        String[] splittedString = s.split("");
        for (int i = 0; i < splittedString.length; i++) {
            String first = splittedString[i];
            counter = 0;
            for (int j = 0; j < splittedString.length; j++) {
                if (splittedString[j].equals(first)) {
                    counter++;
                    if (counter >= max) {
                        max = counter;
                    }
                }

            }
        }
        return max;
    }

}
