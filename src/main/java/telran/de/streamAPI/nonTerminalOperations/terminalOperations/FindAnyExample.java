package telran.de.streamAPI.nonTerminalOperations.terminalOperations;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class FindAnyExample {
    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>();

        stringList.add("one");
        stringList.add("two");
        stringList.add("three");
        stringList.add("one");

        Stream<String> stream = stringList.stream();

        Optional<String> anyElement = stream.findAny();

        System.out.println(anyElement.get());
    }
}
