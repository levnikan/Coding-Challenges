package telran.de.streamAPI.nonTerminalOperations;

import java.util.stream.Stream;

import static java.util.Arrays.stream;

public class FilterExample {
    public static void main(String[] args) {
        String[] longString = {"Peter", "Bill", "me", "he", "she"};
        Stream<String> stringStream = stream(longString);
        Stream<String> shortStream = stringStream.filter((value) -> value.length() >= 3);

        shortStream.forEach(System.out::println);
    }
}
