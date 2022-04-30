package pl.kurs;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import serializers.Auto;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.Date;
import java.util.List;

public class Main {

    private final static String PATH = "C:\\Users\\cholo\\IdeaProjects\\Json\\src\\main\\resources\\";

    public static void main(String[] args) throws IOException {

        ObjectMapper objectMapper = ObjectMapperHolder.INSTANCE.getMapper();
        //new ObjectMapper();

        // tworzenie obiektu java na podstawie json'a
        // deserializacja, unmarhsalling

        Person adamNowak = objectMapper.readValue(new File(PATH + "adamnowak.json"), Person.class);
        System.out.println(adamNowak);

        // zapisanie obietku javowego do jsona
        // serializacja, marshalling
        List<Kid> kids = List.of(new Kid("Tomek", "Kowalski", 5),
                new Kid("Krzys", "Kowalski", 10));

        Person janKowalski = new Person("Jan", "Kowalski", 66, true, List.of("auta"), kids);
        objectMapper.writeValue(new File(PATH + "jankowalski.json"), janKowalski);

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



        DateKeeper dk = new DateKeeper(new Date(86_400_000L * 19_000));
        objectMapper.writeValue(new File(PATH + "datekeeper.json"), dk);


        // Json Node

        // zmiana jsonowego stringa w json node'a
        String kidJson2 = "{\"firstName\":\"Tomek\",\"lastName\":\"Kowalski\",\"age\":5}";
        JsonNode jsonNode = objectMapper.readTree(kidJson2);
        System.out.println(jsonNode.get("firstName").asText());
        System.out.println(jsonNode.get("age").asInt());

        System.out.println(jsonNode.toPrettyString());

        // zmiana Json nodea na jsona w stringu
        String stringFromJsonNode = jsonNode.toString();
        System.out.println(stringFromJsonNode);

        // zmiana obiektu java na json node'a
        Kid k3 = new Kid("Tomek", "Kowalski", 5);
        JsonNode kidJsonNode = objectMapper.valueToTree(k3);
        System.out.println(kidJsonNode);

        // zamiana json node'a na obiekt java
        Kid kidFromJsonNode = objectMapper.treeToValue(kidJsonNode, Kid.class);
        System.out.println(kidFromJsonNode);

        // zapisanie json node'a do pliku
        objectMapper.writeValue(new File(PATH+"json.json"), kidJsonNode);

        Kid kid5 = objectMapper.readValue(new File(PATH+"json.json"), Kid.class);
        System.out.println(kid5);

        Auto auto = new Auto("fiat", 5);

        objectMapper.writeValue(new File(PATH+"auto.json"), auto);

        Auto auto1 = objectMapper.readValue(new File(PATH+"auto.json"), Auto.class);
        System.out.println(auto1);

        /*
            Stworz klase ksiazka ktora ma autora, tytul, kategorie, cene.
            STworz kilka obiektów i zapisz je jako json nody a nastepnie zapisz je jako plik jsonowy.
            Wczytaj nastepnie ktoras ksiazke jako obiekt i wyswietl jej wartosci
         */

        // Stwórz klase Person (name, surname, age) i uzyj serializerow i deserializerow do odczytu i zapisu.
        // name = imie, surname = nazwisko age= wiek

    }
}
