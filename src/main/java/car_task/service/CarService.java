package car_task.service;

import car_task.model.Addon;
import car_task.model.Car;

import java.util.*;

public class CarService {

    public static Car getMostExpensiveCarFromAList(List<Car> cars) {
        return Optional.ofNullable(cars).orElse(Collections.emptyList()).stream()
                .filter(Objects::nonNull)
                .filter(c -> !c.getAddons().isEmpty())
                .max(Comparator.comparingInt(CarService::getTotalPriceOfAddons))
                .orElseThrow(IllegalArgumentException::new);
    }

    private static int getTotalPriceOfAddons(Car car) {
        return Optional.of(car.getAddons()).orElse(Collections.emptyList()).stream()
                .mapToInt(Addon::getPrice)
                .sum();
    }
}

