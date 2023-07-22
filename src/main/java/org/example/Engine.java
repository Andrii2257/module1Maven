package org.example;

public class Engine {
    private int power;
    private int cylindersCount;

    public Engine(int power, int cylindersCount) {
        this.power = power;
        this.cylindersCount = cylindersCount;
    }

    public int getPower() {
        return power;
    }

    public int getCylindersCount() {
        return cylindersCount;
    }

    @Override
    public String toString() {
        return "Engine{" +
                "power=" + power +
                ", cylindersCount=" + cylindersCount +
                '}';
    }
}
