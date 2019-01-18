package telran.de.streamAPI.nonTerminalOperations;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class LimitExample {
    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>();

        stringList.add("one");
        stringList.add("two");
        stringList.add("three");
        stringList.add("one");

        Stream<String> stream = stringList.stream();
        stream
                .limit(2)
                .forEach(element -> {
                    System.out.println(element);
                });

    }
}
