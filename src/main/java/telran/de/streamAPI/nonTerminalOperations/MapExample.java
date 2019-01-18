package telran.de.streamAPI.nonTerminalOperations;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class MapExample {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("bill");
        list.add("bob");
        list.add("mike");
        list.add("Peter");
        Stream<String> stream = list.stream();

        Stream<String> streamMapped = stream.map(String::toUpperCase);

        streamMapped.forEach(System.out::println);

    }
}
