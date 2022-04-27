package pl.kurs;

import com.fasterxml.jackson.core.Version;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.module.SimpleModule;
import serializers.Auto;
import serializers.AutoDeserializer;
import serializers.AutoSerializer;

import java.text.SimpleDateFormat;

public enum ObjectMapperHolder {

    INSTANCE;

    private final ObjectMapper mapper;

    ObjectMapperHolder() {
        this.mapper = create();
    }

    private static ObjectMapper create() {
        ObjectMapper mapper = new ObjectMapper();

        mapper.configure(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS, false);
        mapper.configure(DeserializationFeature.ACCEPT_EMPTY_STRING_AS_NULL_OBJECT, false);

        mapper.setDateFormat(new SimpleDateFormat("yyyy-MM-dd"));

        // serializer
        AutoSerializer as = new AutoSerializer(Auto.class);
        SimpleModule sm1 = new SimpleModule("AutoSerializer",
                new Version(1, 0, 0, null, null, null));
        sm1.addSerializer(Auto.class, as);
        mapper.registerModule(sm1);

        AutoDeserializer asd = new AutoDeserializer(Auto.class);
        SimpleModule sm2 = new SimpleModule("AutoDeserializer",
                new Version(1, 0, 0, null, null, null));
        sm2.addDeserializer(Auto.class, asd);
        mapper.registerModule(sm2);

        return mapper;
    }

    public ObjectMapper getMapper() {
        return mapper;
    }
}
