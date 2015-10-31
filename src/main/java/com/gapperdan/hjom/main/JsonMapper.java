package com.gapperdan.hjom.main;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.gapperdan.hjom.domain.Person;

import java.io.IOException;

public class JsonMapper {

    public Person jsonToObject(String jsonString) {
        Person person = new Person();

        ObjectMapper mapper = new ObjectMapper();

        try {
            person = mapper.readValue(jsonString, Person.class);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return person;
    }
}
