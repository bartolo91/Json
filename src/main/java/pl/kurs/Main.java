package pl.kurs;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.List;

public class Main {

    private final static String PATH = "C:\\Users\\cholo\\IdeaProjects\\Json\\src\\main\\resources\\";

    public static void main(String[] args) throws IOException {

        ObjectMapper objectMapper = new ObjectMapper();

        // tworzenie obiektu java na podstawie json'a
        // deserializacja, unmarhsalling

        Person adamNowak = objectMapper.readValue(new File(PATH + "adamnowak.json"), Person.class);
        System.out.println(adamNowak);

        // zapisanie obietku javowego do jsona
        // serializacja, marshalling
        List<Kid> kids = List.of(new Kid("Tomek", "Kowalski", 5),
                new Kid("Krzys", "Kowalski", 10));

        Person janKowalski = new Person("Jan", "Kowalski", 66, true, List.of("auta"), kids);
        objectMapper.writeValue(new File(PATH+"jankowalski.json"), janKowalski);

        // zapisanie obiektu java jako jsonowy string
        Kid k = new Kid("Tomek", "Kowalski", 5);
        String kidJsonString = objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(k);

        System.out.println(kidJsonString);
        System.out.println(k);

        // utworzneie obiektu na podstawie stringa jsonowego
        String kidJson = "{\"firstName\":\"Tomek\",\"lastName\":\"Kowalski\",\"age\":5}";
        Kid kidFromString = objectMapper.readValue(kidJson, Kid.class);

        System.out.println(kidFromString);

        // obiekt na podstawie jsona z urla
        // https://soundcloud.com/oembed?url=http%3A//soundcloud.com/forss/flickermood&format=json
        URL url = new URL("https://soundcloud.com/oembed?url=http%3A//soundcloud.com/forss/flickermood&format=json");
//        Book book = objectMapper.readValue(url, Book.class);
//        System.out.println(book);



        // https://matluniewski.smallhost.pl/club1.json club2, club3
        // wczytac je jako obiekty i znalezc najstarszy klub  + klasy serwisowe



        //Stwórz jsona z samochodem, samochod ma marke, model, pojemnosc silnika, info czy ma turbo oraz liste wyposazen
        //wyposazenie ma nazwe i cene

        //Stwórz 3 jsony z informacjami o autach, nastepnie wcyztaj je i wrzuc na liste i znajdz najdrozsze auto (na podstawie wyspoazenia)

        //Stwórz obiekt samochod i zapisz go do formatu json
    }
}
