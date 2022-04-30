package serializers_task;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

        String PATH = "src/main/resources/";

        // Stwórz klase Person (name, surname, age) i uzyj serializerow i deserializerow do odczytu i zapisu.
        // name = imie, surname = nazwisko age= wiek

        ObjectMapper objectMapper = PersonMapperHolder.INSTANCE.getPersonMapper();

        Person person = new Person("Maciej", "Testowy", 12);
        objectMapper.writeValue(new File(PATH + "person.json"), person);

        Person person1 = objectMapper.readValue(new File(PATH + "person.json"), Person.class);
        System.out.println(person1);


    }
}
