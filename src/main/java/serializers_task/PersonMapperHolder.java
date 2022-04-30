package serializers_task;

import com.fasterxml.jackson.core.Version;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.module.SimpleModule;

public enum PersonMapperHolder {

    INSTANCE;

    private final ObjectMapper personMapper;

    PersonMapperHolder() {
        this.personMapper = create();
    }

    private static ObjectMapper create(){
        ObjectMapper personMapper = new ObjectMapper();

        //todo dokonczyc metode i testy w mainie

        // serializer
//        AutoSerializer as = new AutoSerializer(Auto.class);
//        SimpleModule sm1 = new SimpleModule("AutoSerializer",
//                new Version(1, 0, 0, null, null, null));
//        sm1.addSerializer(Auto.class, as);
//        mapper.registerModule(sm1);

        PersonSerializer ps = new PersonSerializer(Person.class);
        SimpleModule sm1 = new SimpleModule("PersonSerializer",
                new Version(1, 0, 0, null, null,null));
        sm1.addSerializer(Person.class, ps);
        personMapper.registerModule(sm1);


        PersonDeserializer pd = new PersonDeserializer(Person.class);
        SimpleModule sm2 = new SimpleModule("PersonDeseliarizer", new Version(1,0,0,null,null,null));
        sm2.addDeserializer(Person.class,pd);
        personMapper.registerModule(sm2);
//        AutoDeserializer asd = new AutoDeserializer(Auto.class);
//        SimpleModule sm2 = new SimpleModule("AutoDeserializer",
//                new Version(1, 0, 0, null, null, null));
//        sm2.addDeserializer(Auto.class, asd);
//        mapper.registerModule(sm2);



        return personMapper;
    }

    public ObjectMapper getPersonMapper() {
        return personMapper;
    }
}
