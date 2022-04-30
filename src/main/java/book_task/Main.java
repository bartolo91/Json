package book_task;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

        /*
            Stworz klase ksiazka ktora ma autora, tytul, kategorie, cene.
            STworz kilka obiektów i zapisz je jako json nody a nastepnie zapisz je jako plik jsonowy.
            Wczytaj nastepnie ktoras ksiazke jako obiekt i wyswietl jej wartosci
         */

        //Przechowuje strukture Jsona ale nie w postaci Stringów.

        ObjectMapper objectMapper = new ObjectMapper();

        Book book1 = new Book("J.K. Rowling", "Harry Potter i Komnata", Category.FANTASY, 22.0);
        Book book2 = new Book("Bolesław Prus", "Lalka", Category.ROMANTIC, 50.0);
        Book book3 = new Book("Tolkien", "Władca Pierścieni", Category.FANTASY, 100.0);
        Book book4 = new Book("Karol Okrasa", "Kuchnia Polska", Category.THRILLER, 30.0);

        JsonNode book1JsonNode = objectMapper.valueToTree(book1);
        JsonNode book2JsonNode = objectMapper.valueToTree(book2);
        JsonNode book3JsonNode = objectMapper.valueToTree(book3);
        JsonNode book4JsonNode = objectMapper.valueToTree(book4);


        String PATH = "src/main/resources/";
        objectMapper.writeValue(new File(PATH + "book1.json"), book1JsonNode);
        objectMapper.writeValue(new File(PATH + "book2.json"), book2JsonNode);
        objectMapper.writeValue(new File(PATH + "book3.json"), book3JsonNode);
        objectMapper.writeValue(new File(PATH + "book4.json"), book4JsonNode);


        Book bookRead1 = objectMapper.readValue(new File(PATH + "book1.json"), Book.class);
        Book bookRead2 = objectMapper.readValue(new File(PATH + "book2.json"), Book.class);
        Book bookRead3 = objectMapper.readValue(new File(PATH + "book3.json"), Book.class);
        Book bookRead4 = objectMapper.readValue(new File(PATH + "book4.json"), Book.class);


        System.out.println(bookRead1);
        System.out.println(bookRead2);
        System.out.println(bookRead3);
        System.out.println(bookRead4);

    }
}
