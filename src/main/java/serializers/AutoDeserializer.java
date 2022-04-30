package serializers;

import com.fasterxml.jackson.core.JacksonException;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;

import java.io.IOException;

public class AutoDeserializer extends StdDeserializer<Auto> {


    public AutoDeserializer(Class<Auto> vc) {
        super(vc);
    }

    @Override
    public Auto deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException, JacksonException {

        JsonNode node = jsonParser.getCodec().readTree(jsonParser);
        String producer = node.get("brand").asText();
        int doors = node.get("doorsNumber").asInt();
        return new Auto(producer, doors);
    }
}
