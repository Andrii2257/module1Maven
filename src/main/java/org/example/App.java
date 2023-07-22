package org.example;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.List;

public class App
{
    public static void main( String[] args )
    {
        Engine engineV6 = new Engine(180, 6);
        Engine engineV10 = new Engine(780, 10);
        Engine engineR4 = new Engine(120, 4);

        Car ferrari = new Car("ferrari", engineV10, "Red", 4);
        Car opel = new Car("opel", engineR4, "White", 4);
        Car ural = new Car("ural", engineV6, "Green", 6);

        List<Car> cars = Arrays.asList(ferrari, opel, ural);
        String json = new Gson().toJson(cars);
        System.out.println("json = " + json);
        Type listCars = new TypeToken<List<Car>>() {}.getType();
        List<Car> cars1 = new Gson().fromJson(json, listCars);
        System.out.println("cars1 = " + cars1);
    }
}
