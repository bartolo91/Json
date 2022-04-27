package car_task;

import car_task.model.Addon;
import car_task.model.Car;
import car_task.service.CarService;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Main {

    private final static String PATH = "C:\\Users\\cholo\\IdeaProjects\\Json\\src\\main\\resources\\";

    public static void main(String[] args) throws IOException {

        //Stwórz jsona z samochodem, samochod ma marke, model, pojemnosc silnika, info czy ma turbo oraz liste wyposazen
        //wyposazenie ma nazwe i cene

        //Stwórz 3 jsony z informacjami o autach, nastepnie wcyztaj je i wrzuc na liste i znajdz najdrozsze auto (na podstawie wyspoazenia)

        //Stwórz obiekt samochod i zapisz go do formatu json

        Car car = new Car("Fiat", "Panda", 2.0, true, List.of(Addon.AIR_CONDITION));
        Car car1 = new Car("BMW", "7", 4.0, true, Arrays.asList(Addon.AUDIO_SYSTEM, Addon.APPLE_CAR_PLAY, Addon.SEAT_MASSAGE, Addon.AIR_CONDITION));
        Car car2 = new Car("Fiat", "126p", 1.0, false, List.of());

        ObjectMapper objectMapper = new ObjectMapper();
        String s = objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(car);
        String s1 = objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(car1);
        String s2 = objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(car2);

        List<Car> carList = new ArrayList<>();

        Car fiatPanda = objectMapper.readValue(new File(PATH + "fiatpanda.json"), Car.class);
        Car bmw = objectMapper.readValue(new File(PATH + "bmw7.json"), Car.class);
        Car maluch = objectMapper.readValue(new File(PATH + "maluch.json"), Car.class);
        carList.add(fiatPanda);
        carList.add(maluch);
        carList.add(bmw);

        System.out.println(CarService.getMostExpensiveCarFromAList(carList));


        Car carToJson = new Car("Json", "car", 2.0, true, List.of(Addon.SEAT_MASSAGE, Addon.AIR_CONDITION));
        String s3 = objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(carToJson);
        System.out.println(s3);

    }


}

