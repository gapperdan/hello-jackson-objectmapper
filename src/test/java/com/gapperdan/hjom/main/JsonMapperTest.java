package com.gapperdan.hjom.main;

import com.gapperdan.hjom.domain.Person;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class JsonMapperTest {

    String personJson = "{\"firstName\":\"Jason\"," +
            "\"lastName\":\"Jackson\"," +
            "\"age\":40," +
            "\"address\":{" +
            "\"number\":\"555\"," +
            "\"street\":\"Sesame St.\"," +
            "\"zipCode\":\"99901\"}," +
            "\"phones\":[{" +
            "\"type\":\"cell\"," +
            "\"number\":\"555-111-001\"}," +
            "{\"type\":\"home\",\"number\":\"555-222-002\"}," +
            "{\"type\":\"work\",\"number\":\"555-333-003\"}]}";

    @Test
    public void itShouldCreateAPersonObjectFromTheJsonString() {
        JsonMapper jsonMapper = new JsonMapper();

        Person person = jsonMapper.jsonToObject(personJson);
        assertEquals("Jason", person.getFirstName());
        assertEquals("Jackson", person.getLastName());
        assertEquals(40, person.getAge());
        assertEquals("555", person.getAddress().getNumber());
        assertEquals("Sesame St.", person.getAddress().getStreet());
        assertEquals("99901", person.getAddress().getZipCode());
        assertEquals(3, person.getPhones().size());
        assertEquals("cell", person.getPhones().get(0).getType());
        assertEquals("home", person.getPhones().get(1).getType());
        assertEquals("work", person.getPhones().get(2).getType());
        assertEquals("555-111-001", person.getPhones().get(0).getNumber());
        assertEquals("555-222-002", person.getPhones().get(1).getNumber());
        assertEquals("555-333-003", person.getPhones().get(2).getNumber());
    }

}