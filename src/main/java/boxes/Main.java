package main.java.boxes;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Box> boxList = Arrays.asList(new Box(), new Box(), new Box());
        System.out.println("List of boxes with things:\n" + boxList);
        System.out.println("List of protected fragile things: ");
        Box.listOfProtectFragileThings(boxList);
    }
}
