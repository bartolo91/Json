package serializers_task;

import com.fasterxml.jackson.core.JacksonException;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;

import java.io.IOException;

public class PersonDeserializer extends StdDeserializer<Person> {

    protected PersonDeserializer(Class<Person> t) {
        super(t);
    }

    @Override
    public Person deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException, JacksonException {

        JsonNode node = jsonParser.getCodec().readTree(jsonParser);
        String name = node.get("imie").asText();
        String surname = node.get("nazwisko").asText();
        int age = node.get("wiek").asInt();
        return new Person(name,surname,age);
//        JsonNode node = jsonParser.getCodec().readTree(jsonParser);
//        String producer = node.get("brand").asText();
//        int doors = node.get("doorsNumber").asInt();
//        return new Auto(producer, doors);
    }
}
