package main.java.boxes;

class Protector {
    private Thing thing;

    Protector(Thing thing) {
        this.thing = thing;
    }

    @Override
    public String toString() {
        return "Protector" +
                thing;
    }
}
