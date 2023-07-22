package org.example;

public class Car {
    private String carName;
    private Engine engine;
    private String colour;
    private int wheelsCount;

    public Car(String carName, Engine engine, String colour, int wheelsCount) {
        this.carName = carName;
        this.engine = engine;
        this.colour = colour;
        this.wheelsCount = wheelsCount;
    }

    public String getCarName() {
        return carName;
    }

    public Engine getEngine() {
        return engine;
    }

    public String getColour() {
        return colour;
    }

    public int getWheelsCount() {
        return wheelsCount;
    }

    @Override
    public String toString() {
        return "\nCar{" +
                "carName='" + carName + '\'' +
                ", engine=" + engine +
                ", colour='" + colour + '\'' +
                ", wheelsCount=" + wheelsCount +
                '}';
    }
}
