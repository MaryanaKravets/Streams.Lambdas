package main.java.boxes;

public class Thing {
    private String name;

    Thing(String name) {
        this.name = name;
    }

    String getName() {
        return this.name;
    }

    public String toString() {
        return "{" + this.name + "}";
    }
}
