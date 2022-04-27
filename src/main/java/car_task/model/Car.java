package car_task.model;

import java.util.ArrayList;
import java.util.List;

public class Car {

    private String brand;
    private String model;
    private double engineCapacity;
    private boolean hasTurbo;
    private List<Addon> addons;
    public static List<Car> carExtension = new ArrayList<>();

    public Car() {
        carExtension.add(this);
    }

    public Car(String brand, String model, double engineCapacity, boolean hasTurbo, List<Addon> addons) {
        this.brand = brand;
        this.model = model;
        this.engineCapacity = engineCapacity;
        this.hasTurbo = hasTurbo;
        this.addons = addons;
        carExtension.add(this);
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", engineCapacity=" + engineCapacity +
                ", hasTurbo=" + hasTurbo +
                ", addons=" + addons +
                '}';
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public double getEngineCapacity() {
        return engineCapacity;
    }

    public boolean getHasTurbo() {
        return hasTurbo;
    }

    public List<Addon> getAddons() {
        return addons;
    }
}
