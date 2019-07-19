package main.java.boxes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Box {
    private static List<Thing> fragileThings =
            Arrays.asList(new Thing("vase"), new Thing("plates"), new Thing("glasses"), new Thing("statuette"));
    private List<Thing> newList = new ArrayList<>();

    Box() {
        Random random = new Random();
        List<Thing> notFragileThings =
                Arrays.asList(new Thing("book"), new Thing("pencil"), new Thing("paper"), new Thing("spoon"));
        int totalItem = 5;
        List<Thing> list = Stream.concat(fragileThings.stream(), notFragileThings.stream())
                .collect(Collectors.toList());

        for (int i = 0; i < totalItem; ++i) {
            int randomIndex = random.nextInt(list.size());
            this.newList.add(list.get(randomIndex));
        }

    }

    static void listOfProtectFragileThings(List<Box> boxList) {
        boxList.stream().flatMap(box ->
                box.newList.stream())
                .filter(t -> (
                        fragileThings.stream().map(Thing::getName).collect(Collectors.toList()).contains(t.getName())))
                .map(Protector::new)
                .collect(Collectors.toList())
                .forEach(System.out::println);
    }

    public String toString() {
        return "Box" + this.newList;
    }
}

