package serializers_task;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;

import java.io.IOException;

public class PersonSerializer extends StdSerializer<Person> {


    protected PersonSerializer(Class<Person> t) {
        super(t);
    }

    @Override
    public void serialize(Person person, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws IOException {
        jsonGenerator.writeStartObject();
        jsonGenerator.writeStringField("imie",person.getName());
        jsonGenerator.writeStringField("nazwisko", person.getSurname());
        jsonGenerator.writeNumberField("wiek",person.getAge());
        jsonGenerator.writeEndObject();

    }
}
