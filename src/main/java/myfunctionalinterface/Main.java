package main.java.myfunctionalinterface;

import java.util.Arrays;
import java.util.List;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        MyFunctionalInterface myFunctionalInterface = (name) -> {
            name.stream().map((str) -> (str.substring(0, 1).toUpperCase() + str.substring(1)))
                    .forEach(System.out::println);
        };
        List<String> list = Arrays.asList("vasyl", "taras", "oksana", "oleg", "bogdan", "nazar");
        System.out.println("List of names with the first upper case letter:\n");
        myFunctionalInterface.firstLetterToUpperCase(list);
    }
}

